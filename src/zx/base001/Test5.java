package zx.base001;

public class Test5 {

	public static void main(String[] args) {
		//初始对象在eden区
		//-Xmx64m -Xms64m -XX:+PrintGCDetails
		/*for(int i=0;i<5;i++){
			byte[] b = new byte[1024*1024];
		}*/
		
		//测试进入老年代的对象
		//-Xmx1024m -Xms1024m -XX:+UseSerialGC -XX:MaxTenuringThreshold=15 -XX:+PrintGCDetails
		//-XX:+PrintHeapATGC
		for(int k=0;k<20;k++){
			for(int j=0;j<300;j++){
				byte[] b=new byte[1024*1024];
			}
		}
		
	}
}
