package modelo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		/*CRIE UM PROGRAMA QUE È UMA CALCULADORA COM OPÇÕES DE 1 A 4, CADA OPÇÃO 
		 * REALIZA UMA OPERAÇÃO MATEMÁTICA ENTRE DOIS NÚMERO E EXIBE O RESULTADO.
		 * UTILIZE O SWITCH CASE
		 */
		Scanner teclado = new Scanner(System.in);
		int num1 = 4, num2 = 6;
		int alternativa = 3;
		
		System.out.println("Digite um número");
		num1 = teclado.nextInt();
		System.out.println("Digite outro número");
		num2 = teclado.nextInt();
		
		System.out.println("Digite a Opção: 1 para somar, 2 para subtrair, 3 para multiplicar, 4 para dividir");
		alternativa = teclado.nextInt();
		
		
		switch (alternativa) {
		case 1:
			System.out.println(num1 + num2);
			break;
		case 2:
			System.out.println(num1 - num2);
			break;
		case 3:
			System.out.println(num1 * num2);
			break;
		case 4: 
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Opção Inválida");	
		}
		
		
	}
}
