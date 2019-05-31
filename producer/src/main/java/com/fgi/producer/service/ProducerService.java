package com.fgi.producer.service;

import com.fgi.producer.MySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author hsz
 */

@EnableBinding(MySource.class)
public class ProducerService {

    @Autowired
    private MySource source;

    public void sendMsg(String msg) {
        source.output().send(MessageBuilder.withPayload(msg).build());
    }
}
