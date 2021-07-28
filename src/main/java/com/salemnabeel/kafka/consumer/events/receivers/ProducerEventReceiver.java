package com.salemnabeel.kafka.consumer.events.receivers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.salemnabeel.kafka.consumer.events.GlobalSecureEvent;
import com.salemnabeel.kafka.consumer.events.actions.ProducerServiceAction;
import com.salemnabeel.kafka.consumer.models.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class ProducerEventReceiver {

    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    public Consumer<GlobalSecureEvent> downloadProducerEvent() {
        // spring.cloud.bindings.downloadProducerEvent-in-0 => [downloadProducerEvent]

        return (globalSecureEvent -> {

            ProducerServiceAction producerServiceAction = objectMapper.convertValue(
                globalSecureEvent.getAction(), ProducerServiceAction.class
            );

            switch (producerServiceAction) {
                case EVENT_01:
                case EVENT_02:
                case EVENT_03:

                    UserRequest userRequest = objectMapper.convertValue(
                        globalSecureEvent.getPayload(), UserRequest.class
                    );

                    getEventPayload(userRequest);

                    break;
            }
        });
    }

    public void getEventPayload(UserRequest userRequest) {

        System.out.println(userRequest);
    }
}