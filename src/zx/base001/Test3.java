package zx.base001;

import java.util.Vector;

public class Test3 {
	
	public static void main(String[] args) {
		//-Xms2m -Xmx2m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=e:/Test03.dump
		//���ڴ����
		Vector vector = new Vector();
		for(int i=0;i<5;i++){
			vector.add(new Byte[1*1024*1024]);
		}
	}

}
