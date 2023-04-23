package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("\n ------ MATEMÁTICA ------ \n");
	    Scanner sc = new Scanner (System.in);
	    System.out.println ("Digite um número para ver o valor dele ao quadrado, ao cubo, a raiz quadrada e a raiz cubica:");
	    double num= sc.nextDouble();
	    double num2=Math.pow(num,2);
	    double num3 =Math.pow(num,3);
	    double raizq= Math.sqrt(num);
	    double raizc= Math.cbrt(num);
	System.out.println ("Número ao quadrado: "+num2 );
	System.out.println ("Ao cubo:" + num3);
	System.out.println ("Raiz quadrada: " + raizq);
	System.out.println ("Raiz cúbica:" + raizc);


	}

}
