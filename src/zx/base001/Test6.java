package zx.base001;

import java.util.HashMap;
import java.util.Map;

public class Test6 {
	
	public static void main(String[] args) {
		//-Xmx30m -Xms30m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1024000
		//当对象大小超过1024000，放入老年代中
		/*Map<Integer,byte[]> map = new HashMap<Integer,byte[]>();
		for(int i=0;i<5;i++){
			byte[] b = new byte[1024*1024];
			map.put(i, b);
		}*/
		
		//这种现象的原因是：虚拟机对体积不大的对象会优先把数据分配到TLAB中，因此失去了老年代分配的机会
		//-Xmx30m -Xms30m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000 -XX:-UseTLAB
		Map<Integer,byte[]> map = new HashMap<Integer,byte[]>();
		for(int i=0;i<5*1024;i++){
			byte[] b=new byte[1024];
			map.put(i, b);
		}
		
	}

}
