package zx.base001;

public class Test4 {
	
	//-Xss1m
	//-Xss5m
	
	//ջ�������
	private static int count;
	
	public static void recursion(){
		count++;
		recursion();
	}
	
	public static void main(String[] args) {
		try {
			recursion();
		} catch (Throwable e) {
            System.out.println("����������"+count);
			e.printStackTrace();
		}
	}

}
