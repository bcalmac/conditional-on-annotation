package io.github.bcalmac.conditionalonannotation.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConditionalOnAnnotationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void beansExist() {
        assertTrue(applicationContext.containsBean("myBean"));
        assertTrue(applicationContext.containsBean("myOtherBean"));
    }
}
