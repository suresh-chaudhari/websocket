package com.startup;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.WebSocketApplicationContext;

public class WebContextListner implements ServletContextListener{


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@Override
	public void contextInitialized(ServletContextEvent context) {
//		ServerContainer serverContainer =(WsServerContainer)context.getServletContext().getAttribute("javax.websocket.server.ServerContainer");
//		// Add endpoint manually to server container
//		try {
//			serverContainer.addEndpoint(WebSocketTest.class);
//		} catch (DeploymentException e) {
//			e.printStackTrace();
//		}
		WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(context.getServletContext());
		WebSocketApplicationContext.getInstance().setContext(ctx);
		System.out.println("Context Initialized...");
	}

}
