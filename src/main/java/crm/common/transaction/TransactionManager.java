/**
 * @Project:crm
 * @Title:TransactionManager.java
 * @Author:Riozenc
 * @Datetime:2016年11月8日 下午9:49:40
 * 
 */
package crm.common.transaction;

import org.springframework.context.annotation.Configuration;

import com.riozenc.quicktool.springmvc.transaction.TransactionServiceRegistryPostProcessor;


@Configuration
public class TransactionManager extends TransactionServiceRegistryPostProcessor {

}
