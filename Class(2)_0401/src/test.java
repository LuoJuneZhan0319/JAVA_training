import java.util.Date;

public class test {
	
	public static void main(String[] args){
		
		Date a = new Date();
		System.out.println(a.getYear());	// �~(+1900)
		System.out.println(a.getMonth());	// ��(+1)
		System.out.println(a.getDate());	// ��
		System.out.println(a.getHours());	// ��
		System.out.println(a.getMinutes());	// ��
		System.out.println(a.getSeconds());	// ��

		
	}

}