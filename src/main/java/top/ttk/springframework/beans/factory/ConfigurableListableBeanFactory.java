package top.ttk.springframework.beans.factory;

import top.ttk.springframework.beans.BeansException;
import top.ttk.springframework.beans.factory.config.AutowireCapableBeanFactory;
import top.ttk.springframework.beans.factory.config.BeanDefinition;
import top.ttk.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}