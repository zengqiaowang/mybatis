/**   
 * 类名：LogBasePath
 *
 */
package com.cybbj.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.lang3.StringUtils;

/** 
 * LogBasePath: 
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-12-7 v1.0 15989 新建 
 */
public class LogBasePath implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		System.clearProperty("logBasePath");
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {		
		String sTempPath = System.getProperty("user.dir");
		String sTemppath2 = "";
		//含有才处理
		if (StringUtils.contains(sTempPath, "bin")) {
			sTemppath2 = sTempPath.substring(0, sTempPath.indexOf("bin"));
		} else {
			sTemppath2 = sTempPath;
		}
		String sProjectName = servletContextEvent.getServletContext().getContextPath();
		StringBuffer sPath = new StringBuffer(50);
		sPath.append(sTemppath2).append("/webapps/").append(sProjectName).append("/log/");
		System.setProperty("logBasePath", sPath.toString());
		sPath.delete(0, sPath.length());
	}

}
