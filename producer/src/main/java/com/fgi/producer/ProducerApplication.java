package com.fgi.producer;

import com.fgi.producer.service.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class ProducerApplication {

    @Autowired
    private ProducerService producerService;

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    @RequestMapping("/send")
    public void send() {
        long start = System.currentTimeMillis();
        String message = "this is message,this is message,this is message,this is message,this is message,this is message,this is message,this is message,this is message,this is message,this is message,this is message,this is message,this is message,this is message,this is message,this is message,this is message,";
        for (int i = 0; i < 1000000; i++) {
            producerService.sendMsg(message);
            log.info("send a message");
        }
        System.out.println((System.currentTimeMillis() - start) / 1000);
    }
}
