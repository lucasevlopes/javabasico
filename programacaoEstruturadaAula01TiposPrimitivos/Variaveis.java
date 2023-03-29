package programacaoEstruturadaAula01TiposPrimitivos;

import java.util.Scanner;

/*
 * 
 * Classe voltada para o ensino de tipos primitivos
 * 
 * autor: Lucas Lopes
 * 
 * data: 26/03/23
 */
public class Variaveis {
	//Método de execução da classe
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		
		String nome= "Lucas";
		int idade = 24;
		float altura =  1.79f;
		double peso = 102.4;
		char tipoSanguineo = 'O';
		boolean fatorRH = true; 
		
		nome = leitor.next();
		
		System.out.println("nome: "+nome); 
		System.out.println("Idade: "+idade);
		System.out.println("Altura: "+altura);
		System.out.println("Peso: "+peso);
		
		
	}

}
