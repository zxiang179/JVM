package zx.base001;

public class Test01 {
	
	public static void main(String[] args) {
		
		//-XX:+PrintGC -Xms5m -Xmx20m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:+PrintCommandLineFlags
		
		//1:
		//-XX:+PrintGC -Xms5m -Xmx20m -XX:+UseSerialGC -XX:+PrintGCDetails
		
		//查看GC信息
		System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
		System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
		System.out.println("total memory:"+Runtime.getRuntime().totalMemory());
		
		byte[] b1 = new byte[1*1024*1024];
		System.out.println("分配了1M");
		System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
		System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
		System.out.println("total memory:"+Runtime.getRuntime().totalMemory());
		
		byte[] b2 = new byte[4*1024*1024];
		System.out.println("分配了4M");
		System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
		System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
		System.out.println("total memory:"+Runtime.getRuntime().totalMemory());
		
		int a = 0x00000000fee10000;
		int b = 0x00000000fec00000;
		System.out.println("结果为1920k，但实际结果："+(a-b)/1024);
		
	}

}
