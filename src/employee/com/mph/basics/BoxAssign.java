package employee.com.mph.basics;

//write a java program which takes the class Box with fields l,b,h :int . 
//Assigning of the values for the fields l,b,h need to happen from the constructor .
//Calculate the volume of the box with the formula l*b*h


class BoxData{
	int length;
	int breadth;
	int height;
	BoxData(int L, int B, int H){
		length=L;
		breadth=B;
		height=H;
	}
		int volume() {
			return length*breadth*height;
		}
	}

public class BoxAssign {
	public static void main(String args[]) {
		BoxData b = new BoxData(12,4,6);
		BoxData b1 = new BoxData(10,5,4);
		int vol;
		vol = b.volume();
		System.out.println("volume of Box1:" +vol);
		
		
		vol = b1.volume();
		System.out.println("volume of Box2:" +vol);
		
		
	}
}



