package org.krunal.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("DemoBeanPostProcessor0: Before init life cycle event" + s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("DemoBeanPostProcessor0: After init life cycle event" + s);
        return o;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
