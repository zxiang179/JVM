package zx.base001;

public class Test7 {
	
	public static void alloc(){
		byte[] b = new byte[2];
	}
	
	public static void main(String[] args) {
		//TLAB∑÷≈‰
		//-XX:+UseTLAB -XX:+PrintTLAB -XX:TLABSize=102400 -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis
		long start = System.currentTimeMillis();
		for(int i=0;i<10000000;i++){
			alloc();
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
