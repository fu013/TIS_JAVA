package Extends;

public class 별찍기 {

	public static void main(String[] args) {
		
		// 계단형별찍기
		for(int i=1; i <= 10; i++) {
		    for(int j=1; j <= i; j++ ) { 
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		// 공백 세칸 가로로 출력
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 계단형별 역방향
		for(int i=1; i <= 10; i++) {
		    for(int j=1; j <=10-i; j++ ) {
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 피라미드형별
		for (int i = 0; i < 10; i++) {
		    for (int j = 10-1; j > i; j--) { 
		        System.out.print(" ");
		        // i 값이 증가함에 따라 공백수가 감소하는 포문
		    }
		    for (int k = 0; k < 2*i+1; k++) { 
		        System.out.print("*"); 
		        // i 값이 증가함에 따라 1,3,5 이런식으로 별의 개수가 찍히게하는 포문
		    } 
		        System.out.println(); 
		        // 공백과 별을 모두 찍었으면 줄바꿈을 한다
		}
		
		// 공백 세칸 가로로 출력
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 피라미드형별 역방향
		for(int i=10; i > 0; i--) {
		    for(int j=0; j < 10 - i; j++) {
		        System.out.print(" ");
		    }
		 
		    for(int k=0; k< 2*i-1; k++) {
		        System.out.print("*");
		    }
		 
		    System.out.println();
		}
		
		// 공백 세칸 가로로 출력
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 다이아몬드형 별
		for(int i=0; i < 5; i++) {
		    for(int j=0; j < 5; j++) {
		        if(i <= 5 / 2) {
		            if(i+j <= 5/2-1) {
		                System.out.print(" ");
		            }else if(j-i >= 5/2+1) {
		                System.out.print(" ");
		            }else {
		                System.out.print("*");
		            }
		        }else if (i>5/2)
		        {
		            if (i-j>=5/2+1)
		                System.out.print(" ");
		            else if (i+j>=5/2*3+1)
		                System.out.print(" ");
		            else
		                System.out.print("*"); 
		        }
		    }
		    System.out.println();
		}
	}
}
