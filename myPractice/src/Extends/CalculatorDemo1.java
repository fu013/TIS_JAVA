package Extends;

class Calculator {
	// Ŭ���� �������
    int left, right;
    
    // Ŭ���� ��� �żҵ�
    public void setOprands(int left, int right) {
    	// Ŭ���� ��� �żҵ� ���� this.�������� Ŭ������ ��������� ����Ų��.
        this.left = left;
        this.right = right;
    }
    
    // Ŭ���� ��� �żҵ� 2
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    // Ŭ���� ��� �żҵ� 3
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 

// calculator���� ��ӹ��� �ڽ� Ŭ����
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