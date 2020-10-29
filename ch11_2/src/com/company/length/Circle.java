package com.company.length;

public class Circle {
	
	double rad;
	final double PI;
	
	public Circle(double r) {
		rad = r;
		PI = 3.14;
	}
	
	//원의 둘레 길이 변환
	
	public double getperimeter() {
		return(rad * 2) * PI;
	}

}
