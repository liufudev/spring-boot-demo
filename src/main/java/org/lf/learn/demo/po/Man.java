package org.lf.learn.demo.po;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author liufu
 */
@Data
@Configuration
public class Man {

    @Autowired
    private Dog dog;


}
