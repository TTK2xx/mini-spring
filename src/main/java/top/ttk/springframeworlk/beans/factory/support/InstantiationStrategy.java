package top.ttk.springframeworlk.beans.factory.support;

import top.ttk.springframeworlk.beans.BeansException;
import top.ttk.springframeworlk.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
