package cn.qphone.ssm.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        /* 在tomcat启动完成之后立刻调用*/
        System.out.println("哇塞，我生了！！！");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        /* 在tomcat临死之前立刻调用*/
    }
}
