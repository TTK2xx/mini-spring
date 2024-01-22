package top.ttk.springframeworlk.beans.factory;

import top.ttk.springframeworlk.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
