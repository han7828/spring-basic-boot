package com.example.springbasicboot.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public interface Greeting {
    String hello();

}