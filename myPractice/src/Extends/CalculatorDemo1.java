package Extends;

class Calculator {
	// 클래스 멤버변수
    int left, right;
    
    // 클래스 멤버 매소드
    public void setOprands(int left, int right) {
    	// 클래스 멤버 매소드 안의 this.변수명은 클래스의 멤버변수를 가르킨다.
        this.left = left;
        this.right = right;
    }
    
    // 클래스 멤버 매소드 2
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    // 클래스 멤버 매소드 3
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 

// calculator에게 상속받은 자식 클래스
class SubstractionableCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
// 
public class CalculatorDemo1 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
 
}