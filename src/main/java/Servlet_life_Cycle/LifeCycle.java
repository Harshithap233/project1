package Servlet_life_Cycle;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

import javax.naming.Context;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.LifecycleState;
import org.apache.catalina.Server;
import org.apache.catalina.Service;
import org.apache.catalina.deploy.NamingResourcesImpl;
import org.apache.catalina.startup.Catalina;

@WebServlet("/life")
public class LifeCycle implements Servlet{

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy method is invoked ");
		
	}

	public ServletConfig getServletConfig() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method is invoked");
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service methode is invoked");
		
	}





}
