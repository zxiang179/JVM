package zx.base001;

public class Test02 {

	public static void main(String[] args) {
		//��һ������                                         eden 2 =from 1+ to 1
		//-Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
		
		//�ڶ�������
		//-Xms20m -Xmx20m -Xmn7m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
		
		//����������
		//-XX:NewRatio=�����/������
		//-Xms20m -Xmx20m -XX:NewRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
	    
		byte[] b=null;
		//������ϵͳ����10m�ռ�
		for(int i=0;i<10;i++){
			b=new byte[1*1024*1024];
		}
	}
	
}
