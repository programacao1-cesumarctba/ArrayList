package br.com.github.aula4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	       List<Integer> numerosImpares = new ArrayList<>();
	       List<Integer> numerosPares = new ArrayList<>();
	       List<Integer> num = new ArrayList<>();

	       int numero;
	       for (int i = 0; i < 8; i++) {
	    	   System.out.println("Digite um n�mero: ");
	           numero = sc.nextInt();  
	           
	           if (numero % 2 == 0){
	               numerosPares.add(numero);
	               num.add(numero);
	           }else{
	               num.add(numero);
	               numerosImpares.add(numero);
	           }
	       }

	       System.out.println("N�meros pares digitados: " + numerosPares);
	       System.out.println("N�meros �mpares digitados: " + numerosImpares);
	       System.out.println("Quantidade de n�meros digitados: " + num.size());        

	   }

	}