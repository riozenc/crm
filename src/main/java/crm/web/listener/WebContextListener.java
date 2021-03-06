/**
 * Title:WebContextListener.java
 * Author:czy
 * Datetime:2016年9月14日 下午5:30:15
 */
package crm.web.listener;

import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;

public class WebContextListener extends org.springframework.web.context.ContextLoaderListener {

	@Override
	public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
		System.out.println("initWebApplicationContext");

		WebApplicationContext webApplicationContext = super.initWebApplicationContext(servletContext);// 额外启动一次

		return webApplicationContext;
	}

}