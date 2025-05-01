package com.dsa.assignments.conditionsloops;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	double areaOfCircle(float radius) {return 2*Math.PI*radius*radius;};
	double areaOfTriangle(float base, float height) {return(base*height)/2;};
	double areaOfRectangle(float length, float breadth) {return length*breadth;};
	double areaOfIsoscelesTriangle(float base, float height) {return(base*height)/2;};
	double areaOfParallelogram(float base, float height) {return base*height;};
	double areaOfRhombus(float base, float height) {return base*height;};
	double areaOfEquilateralTriangle(float a) {return (Math.sqrt(3)/4)*a*a;};
	
	double perimeterOfCircle(float radius) {return 2*Math.PI*radius;};
	double perimeterOfEquilateralTriangle(float a) {return 3*a;};
	double perimeterOfParallelogram(float a,float b) {return  2*(a+b);};
	double perimeterOfRectangle(float length, float breadth) {return 2*(length+breadth);};
	double perimeterOfSquare(float a) {return 4*a;};
	double perimeterOfRhombus(float a) {return 4*a;};
	
	double VolumeOfCone(float radius,float height) {return Math.PI*radius*radius*(height/3);};
//	double VolumeOfPrism(float radius) {return};
//	double VolumeOfCylinder(float radius) {return};
//	double VolumeOfSphere(float radius) {return};
//	double VolumeOfPyramid(float radius) {return};
//	
//	double CSAOfCylinder(float radius) {return};
//	double TSAOfCube(float radius) {return};

}
