package top.ttk.springframework.test;

import org.junit.Test;
import top.ttk.springframework.test.bean.UserService;
import top.ttk.springframeworlk.BeanDefinition;
import top.ttk.springframeworlk.BeanFactory;

public class ApiTest {
    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
