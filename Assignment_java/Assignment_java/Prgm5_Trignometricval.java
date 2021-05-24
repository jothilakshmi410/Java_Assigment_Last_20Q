package com.anna.cs;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;
public class Prgm5_Trignometricval {
	static void cal_sin(float n) {
	    float accuracy = (float) 0.0001, x1, denominator, sinx, sinval;
	    // Converting degrees to radian
	    n = n * (float) (3.142 / 180.0);
	    x1 = n;
	    // maps the sum along the series
	    sinx = n;
	    // holds the actual value of sin(n)
	    sinval = (float) sin(n);
	    int i = 1;
	    do {
	        denominator = 2 * i * (2 * i + 1);
	        x1 = -x1 * n * n / denominator;
	        sinx = sinx + x1;
	        i = i + 1;
	         
	    }
	    while (accuracy <= sinval - sinx);
	    System.out.println(sinx);
	     
	}

		static void cal_cos(float n) {
		    float accuracy = (float) 0.0001, x1, denominator, cosx, cosval;
		    // Converting degrees to radian
		    n = n * (float) (3.142 / 180.0);
		    x1 = 1;
		    // maps the sum along the series
		    cosx = x1;
		    // holds the actual value of sin(n)
		    cosval = (float) cos(n);
		    int i = 1;
		    do {
		        denominator = 2 * i * (2 * i - 1);
		        x1 = -x1 * n * n / denominator;
		        cosx = cosx + x1;
		        i = i + 1;
		         
		    }
		    while (accuracy <= cosval - cosx);
		    System.out.println(cosx);
		     
		}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	float n=45;
	cal_sin(n);

    float m=45;
	cal_cos(m);

	double p=45;
	p = Math.toRadians(p);
	
	System.out.println(Math.tan(p));
	

}

}
