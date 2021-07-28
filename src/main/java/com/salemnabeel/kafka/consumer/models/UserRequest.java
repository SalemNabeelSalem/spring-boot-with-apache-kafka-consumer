package com.salemnabeel.kafka.consumer.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private String name;

    private String age;
}