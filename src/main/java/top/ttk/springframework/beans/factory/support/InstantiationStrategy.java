package top.ttk.springframework.beans.factory.support;

import top.ttk.springframework.beans.factory.config.BeanDefinition;
import top.ttk.springframework.beans.BeansException;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
