package com.javarevolutions.curso1;


import com.javarevolutions.curso1.cmps.Calculadora;
import com.javarevolutions.curso1.cmps.ImplCalculadora;

/*
 * com = Tipo de proyecto com de comercial, gob de gobierno, co de colombia, org de organizacion
 * javarevolutions = nombre de la empresa o cliente a quien se le hace el proyecto
 * curso1 = nombre del proyecto
 */


/**
 * 
 * @author sistemas
 *nombre del creador:edward
 *email:edwarddiaz92@gmail.com
 *
 */

public class Principal {
	/*
	 * Modificador de acceso o prototipo
	 * public, private, protected, default
	 * public: cualquier clase de cualquier paquete accede a este objeto
	 * private: solo esta clase tiene acceso a dicho elemento declarado como private
	 * protected: Solo las clases que esten dentro del mismo paquete y heredadas (solo pueden ver los protectes)
	 * default:(no se escribe) no se pone nada, solo las clases que esten dentro del mismo paquete pueden ver
	 * 
	 */
	
	private int numero;
	
	public void setNumero(int numero){
		this.numero=numero;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public void administracionCuenta(){
		Calculadora calc= new ImplCalculadora(3,7);
		int ahorro =90;
		int cont=1;
		while(calc.suma(ahorro, cont++)<100)
		{
			System.out.println("ahorra mas ..");
		}
		if(calc.suma(ahorro, cont)==100)
		{
			System.out.println("tu ahorro es de 100");
		}else{
			System.out.println("tu suma es "+calc.suma(ahorro, cont));
		}
		ahorro = 90;
		for (int i=0;i<ahorro;i++){
			System.out.println("dentro del for");
		}
	}
	
	public static void main(String[] args){
		Principal obj= new Principal();
		obj.setNumero(100);
		System.out.print(obj.getNumero());
		
		Calculadora calc= new ImplCalculadora(1,2);
		System.out.println("resta"+ calc.resta(10, 3));
		obj.administracionCuenta();
	}
	
	
}
