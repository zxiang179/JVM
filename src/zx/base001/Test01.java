package zx.base001;

public class Test01 {
	
	public static void main(String[] args) {
		
		//-XX:+PrintGC -Xms5m -Xmx20m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:+PrintCommandLineFlags
		
		//1:
		//-XX:+PrintGC -Xms5m -Xmx20m -XX:+UseSerialGC -XX:+PrintGCDetails
		
		//�鿴GC��Ϣ
		System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
		System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
		System.out.println("total memory:"+Runtime.getRuntime().totalMemory());
		
		byte[] b1 = new byte[1*1024*1024];
		System.out.println("������1M");
		System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
		System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
		System.out.println("total memory:"+Runtime.getRuntime().totalMemory());
		
		byte[] b2 = new byte[4*1024*1024];
		System.out.println("������4M");
		System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
		System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
		System.out.println("total memory:"+Runtime.getRuntime().totalMemory());
		
		int a = 0x00000000fee10000;
		int b = 0x00000000fec00000;
		System.out.println("���Ϊ1920k����ʵ�ʽ����"+(a-b)/1024);
		
	}

}
