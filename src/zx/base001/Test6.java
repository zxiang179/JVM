package zx.base001;

import java.util.HashMap;
import java.util.Map;

public class Test6 {
	
	public static void main(String[] args) {
		//-Xmx30m -Xms30m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1024000
		//�������С����1024000�������������
		/*Map<Integer,byte[]> map = new HashMap<Integer,byte[]>();
		for(int i=0;i<5;i++){
			byte[] b = new byte[1024*1024];
			map.put(i, b);
		}*/
		
		//���������ԭ���ǣ���������������Ķ�������Ȱ����ݷ��䵽TLAB�У����ʧȥ�����������Ļ���
		//-Xmx30m -Xms30m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000 -XX:-UseTLAB
		Map<Integer,byte[]> map = new HashMap<Integer,byte[]>();
		for(int i=0;i<5*1024;i++){
			byte[] b=new byte[1024];
			map.put(i, b);
		}
		
	}

}
