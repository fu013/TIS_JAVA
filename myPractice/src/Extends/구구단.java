package Extends;
import java.util.Scanner; //import 해야한다
		 
		public class 구구단 {
		 
		    public static void main(String[] args) {
		    	Scanner scan = new Scanner(System.in);
		        
		    	System.out.println("몇단을 출력할까요"); // 출력문
		    	
		        int num = scan.nextInt(); // 숫자 입력받기
		 
		        //num 입력 받은값 + i 1부터 10까지 반복  + num곱하기 i 곱해진게 반복되는꼴
		        for (int i = 1; i < 10; i++) {
		            System.out.println(num+"*"+i+"="+(num*i));
		        }
		    }
		}
	