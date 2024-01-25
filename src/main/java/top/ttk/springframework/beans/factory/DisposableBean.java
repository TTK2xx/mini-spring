package top.ttk.springframework.beans.factory;

public interface DisposableBean {

    void destroy() throws Exception;

}
