package top.ttk.springframework.beans.factory.support;

import top.ttk.springframework.beans.BeansException;
import top.ttk.springframework.core.io.Resource;
import top.ttk.springframework.core.io.ResourceLoader;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
