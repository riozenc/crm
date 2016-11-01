/**
 * @Title:MainListener.java
 * @Author:Riozenc
 * @Datetime:2016年1月6日 下午3:37:41
 * @Project:esi
 */
package crm.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.riozenc.quicktool.common.util.log.LogUtil;
import com.riozenc.quicktool.common.util.log.LogUtil.LOG_OUT_TYPE;

/**
 * 启动监听器
 * 
 * @author Riozenc
 *
 */
public class MainListener implements ServletContextListener {
	/**
	 * 启动
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {

		// 日志方式
//		LogUtil.setLogOutType(LOG_OUT_TYPE.FILE);// 全部日志根据文件配置输出
		 LogUtil.setLogOutType(LOG_OUT_TYPE.SYSTEM);// 全部日志根据文件配置输出

		System.out.println("initialized");

	}

	/**
	 * 销毁
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("destory");
	}
}
