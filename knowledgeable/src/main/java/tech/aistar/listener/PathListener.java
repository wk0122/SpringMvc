package tech.aistar.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/6/20 0020
 */
@WebListener
public class PathListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //将项目的上下文路径存放到application作用域中.
        sce.getServletContext().setAttribute("path",sce.getServletContext().getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
