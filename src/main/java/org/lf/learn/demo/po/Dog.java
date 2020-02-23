package org.lf.learn.demo.po;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liufu
 */
@ConfigurationProperties("dog")
@Data
public class Dog {
    private int age;
    private String name;
}
