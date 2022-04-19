package abstractco;

import employee.com.mph.basics.Calculator1;
import employee.com.mph.basics.Calculator2;
//import employee.com.mph.basics.CalculatorEx;

class CalculatorEx implements Calculator1,Calculator2{

@Override
public void sum(int a, int b) {
	System.out.println(a+b);
}

@Override
public void sub(int a, int b) {
	System.out.println(a-b);
}

@Override
public void div(int a, int b) {
	System.out.println(a/b);
}

@Override
public void mul(int a, int b) {
	System.out.println(a*b);
}
}
public class AbstraEX {
public static void main(String[] args) {
CalculatorEx imp=new CalculatorEx();
	imp.sum(10, 30);
	imp.sub(50, 40);
	imp.div(60, 20);
	imp.mul(50, 20);
   }
}












