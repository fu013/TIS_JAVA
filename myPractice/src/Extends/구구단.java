package Extends;
import java.util.Scanner; //import �ؾ��Ѵ�
		 
		public class ������ {
		 
		    public static void main(String[] args) {
		    	Scanner scan = new Scanner(System.in);
		        
		    	System.out.println("����� ����ұ��"); // ��¹�
		    	
		        int num = scan.nextInt(); // ���� �Է¹ޱ�
		 
		        //num �Է� ������ + i 1���� 10���� �ݺ�  + num���ϱ� i �������� �ݺ��Ǵ²�
		        for (int i = 1; i < 10; i++) {
		            System.out.println(num+"*"+i+"="+(num*i));
		        }
		    }
		}
	