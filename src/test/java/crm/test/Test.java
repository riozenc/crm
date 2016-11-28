/**
 * Title:Test.java
 * Author:czy
 * Datetime:2016年11月14日 上午8:26:06
 */
package crm.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.util.ByteSource;

public class Test {
	public static void main(String[] args) {
		String s = "555";

		
		ByteSource byteSource = ByteSource.Util.bytes(s);
		System.out.println(byteSource);
		System.out.println(ByteSource.Util.bytes(ByteSource.Util.bytes(s)));
		
		byte[] bs = {53,53,53};
		System.out.println(Base64.encodeToString(bs));

	}
}
