package com.salemnabeel.kafka.consumer.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalSecureEvent<T, Y> implements Serializable {

    private static final long serialVersionUID = 1234L;

    private T action;

    private Y payload;
}