package es6;

public class main {
	
	public static double Dist(double x1,double y1,double x2,double y2)
	{
		double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		return distance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
punto A = new punto();
punto B = new punto();

A.x = 10;
A.y = 15;

B.x = 12;
B.y = 21;

double D = Dist(A.x,A.y,B.x,B.y);
System.out.println(D);
	}

}
