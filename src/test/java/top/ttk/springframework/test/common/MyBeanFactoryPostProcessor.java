package top.ttk.springframework.test.common;

import top.ttk.springframework.beans.BeansException;
import top.ttk.springframework.beans.PropertyValue;
import top.ttk.springframework.beans.PropertyValues;
import top.ttk.springframework.beans.factory.ConfigurableListableBeanFactory;
import top.ttk.springframework.beans.factory.config.BeanDefinition;
import top.ttk.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "修改：京东"));
    }
}
