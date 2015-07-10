package com.javarevolutions.curso1.cmps;

public class ImplCalculadora implements Calculadora{
	
	//Constructor de la calculadora
	//interfaces no puede tener constructores
	
	public ImplCalculadora(int num1, int num2){
		System.out.println("suma: "+ suma(num1, num2));
		System.out.println("division: "+ division(num1, num2));
	}
	
	public ImplCalculadora(int num1){
		System.out.println("suma: "+ suma(num1,100));
		System.out.println("division: "+ division(num1, 2));
	}
	

	public float suma(float num1, float num2) {
		return num1+num2;
	}

	public float resta(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	public float multiplication(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	public float division(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}

}
