package launch.com;

import java.util.*;

abstract class Shapes {
	float area;
	
	abstract public void input();
	
	abstract public void compute();
	
	public void display() {
		
	   System.out.println("The area is = " + area);
	}
		 
	 
}

class Rectangle extends Shapes {
	float length;
	float breadth;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length");
		length = sc.nextFloat();
		System.out.println("Enter also the breadth");
		breadth = sc.nextFloat();
	}
	public void compute() {
		area = length * breadth;
	}
}
class Square extends Shapes{
	
	float width;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width");
		width = sc.nextFloat();
	}
	public void compute() {
		area = width * width;
	}
}

class Circle extends Shapes{
	final float pi = 3.14f;
	float radius;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = sc.nextFloat();
	}
	public void compute() {
		//System.out.println("The area is:: ");
		area = pi * radius * radius;
	}
}
class Geometry {
   public void permit(Shapes s) {
	   s.input();
	   s.compute();
	   s.display();
   }
}

public class LaunchAbstract {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square ss = new Square();
		Circle c = new Circle();
		
		r.input();
		r.compute();
		r.display();
		System.out.println();
		ss.input();
		ss.compute();
		ss.display();
		System.out.println();
		c.input();
		c.compute();
		c.display();
		
	}

}
