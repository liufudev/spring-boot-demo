package org.lf.learn.demo.po;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author liufu
 */
@Configuration
@EnableConfigurationProperties(Dog.class)
public class Person {

    private final Dog dog;

    public Person(final Dog dog) {
        this.dog = dog;
    }
}
