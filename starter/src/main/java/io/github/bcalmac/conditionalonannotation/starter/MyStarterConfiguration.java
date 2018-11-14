package io.github.bcalmac.conditionalonannotation.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyStarterConfiguration {

    @Bean
    @ConditionalOnBean(annotation = MyAnnotation.class)
    @ConditionalOnMissingBean(Integer.class)
    public Integer myBean() {
        return 10;
    }

    @Bean
    public String myOtherBean(Integer myBean) {
        return myBean.toString();
    }
}
