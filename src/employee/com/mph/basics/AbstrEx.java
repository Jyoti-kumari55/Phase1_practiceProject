package employee.com.mph.basics;

class Calculatorex extends Calculator{

	@Override
	void sum(int a, int b) {
		System.out.println(a+b);
	}

	@Override
	void sub(int a, int b) {
		System.out.println(a-b);
	}

	@Override
	void div(int a, int b) {
		System.out.println(a/b);
	}

	@Override
	void mul(int a, int b) {
		System.out.println(a*b);
	}
}
public class AbstrEx {
public static void main(String[] args) {
Calculatorex imp=new Calculatorex();
		imp.sum(20, 30);
		imp.sub(50, 10);
		imp.div(60, 30);
		imp.mul(50, 10);
}
}
