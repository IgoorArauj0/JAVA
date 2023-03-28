import java.util.Scanner;

public class banco {
	public static void main (String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Ola Cliente! Digite 1 para Saldo, 2 para Deposito, 3 para Saque e 4 para Transferencia.");

		int operacao = myObj.nextInt();
		int Saldo = 1000;
		
	if (operacao == 1){
		
		System.out.println("Seu saldo e: "+ Saldo); 
	}
	else if (operacao == 2) {
		System.out.println("Valor a depositar: ");
		int dep = myObj.nextInt() ;
		int d_atual = dep + Saldo;
			System.out.println("Deposito realizado. Saldo atual:"+d_atual);
	}
	else if (operacao == 3) {
		System.out.println("Valor a sacar:");
		
		int saque = myObj.nextInt();
		
		if (saque > 1000){
			System.out.println("Voce nao possui este saldo para saque");
		}
		else{
			int s_atual = Saldo - saque;
			System.out.println("Saque realizado. Saldo atual:" +s_atual);
		} 	
	}
	else if (operacao == 4){
		System.out.println("Valor a transferir: ");
		
		int transfer = myObj.nextInt();
		if (transfer > 1000) {
			System.out.println("Voce nao possui este saldo para transferencia");
		}
		else {
			int t_atual = Saldo - transfer;
			System.out.println("Transferencia realizada. Saldo atual:" +t_atual);
		}
	}
	}
}