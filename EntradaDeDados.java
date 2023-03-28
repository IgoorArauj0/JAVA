import java.util.Scanner;

public class EntradaDeDados {
	public static void main (String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com seu nome, idade e salario");
		
		String nome = myObj.nextLine();
		
		int idade = myObj.nextInt();
		double salario = myObj.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
	}
}