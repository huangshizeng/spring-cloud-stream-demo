package com.fgi.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author hsz
 */


public interface MySource {

    @Output("my-source")
    MessageChannel output();
}
