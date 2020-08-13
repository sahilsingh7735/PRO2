package pack1;


import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author SKB
 */
public class NewServletListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener, ServletRequestListener, ServletRequestAttributeListener {

      @Override
    public void contextInitialized(ServletContextEvent sce) {
         System.out.print("check1 -contextInitialized");        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.print("check2 -contextDestroyed");
        
        
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
         System.out.print("check3 -attributedAdded");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.print("check4 -attributedRemove");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
         System.out.print("check5 -attributedReplaced");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
System.out.print("check6 -sessionCreated");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.print("check7 -sessionDestroyed");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.print("check8 - attributeAdded");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.print("check9 - attributeRemoved");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
         System.out.print("check9 - attributeReplaced");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.print("check10 - requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.print("check11 - requestInitialized");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.print("check12 - attributeAdded");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
System.out.print("check13 - attributeRemoved");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
      System.out.print("check14 - attributeReplaced");  
    }
}
