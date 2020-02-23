package org.lf.learn.demo;

import lombok.extern.slf4j.Slf4j;
import org.lf.learn.demo.po.Man;
import org.lf.learn.demo.po.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @author liufu
 */
@SpringBootApplication
@Slf4j
@ConfigurationPropertiesBinding
public class SpringBootDemoApplication {

    public static void main(final String[] args) {
        final SpringApplicationBuilder builder = new SpringApplicationBuilder();
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootDemoApplication.class, args);
        final Person bean = applicationContext.getBean(Person.class);
        log.info("bean:{}",bean);
        final Man man = applicationContext.getBean(Man.class);
        log.info("bean:{}",man);
    }

}
