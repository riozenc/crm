/**
 * Title:ServiceTransactionSupport.java
 * Author:czy
 * Datetime:2016年11月14日 下午4:02:31
 */
package crm.web.support.transaction;

import org.springframework.context.annotation.Configuration;

import com.riozenc.quicktool.springmvc.transaction.registry.TransactionServiceRegistryPostProcessor;

@Configuration
public class TransactionServiceSupport extends TransactionServiceRegistryPostProcessor {

}
