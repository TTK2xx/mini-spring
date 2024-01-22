package top.ttk.springframework.test;

import org.junit.Test;
import top.ttk.springframework.test.bean.UserService;
import top.ttk.springframeworlk.beans.factory.config.BeanDefinition;
import top.ttk.springframeworlk.beans.factory.BeanFactory;
import top.ttk.springframeworlk.beans.factory.support.DefaultListableBeanFactory;

public class ApiTest {
    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean，经历了很长的调用
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean 直接从Singleton的缓存里取的
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();

        // 5.判断是否是同一个对
        System.out.println(userService.equals(userService_singleton));
    }
}
