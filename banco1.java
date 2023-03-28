import java.util.Scanner;

public class banco1 {
	public static void main (String[] args) {
		Scanner banco = new Scanner(System.in);
		Scanner banco1 = new Scanner (System.in);
		System.out.println("1 - Sair");
		System.out.println("2 - Menu");
		int oper = banco.nextInt();
	
	while (oper == 1) {
		System.out.println("Obrigado por utilizar nossos servicos, volte sempre!");
		break;
	}	
	
	while (oper == 2) {
		System.out.println("Digite 1 para Saldo:");
		System.out.println("2 para Deposito:");
		System.out.println("3 para Saque:");
		System.out.println("4 para Transferencia:");
		System.out.println("5 para Sair");
		int menu = banco1.nextInt();
		
	
	if (menu == 1){
		int Saldo = 1000;
		System.out.println("Seu saldo e: "+ Saldo); 
	}
	else if (menu == 2) {
		int Saldo = 1000;
		System.out.println("Valor a depositar: ");
		int dep = banco.nextInt() ;
		int d_atual = dep + Saldo;
			System.out.println("Deposito realizado. Saldo atual:"+d_atual);
	}
	else if (menu == 3) {
		int Saldo = 1000;
		System.out.println("Valor a sacar:");
		
		int saque = banco.nextInt();
		
		if (saque > 1000){
			System.out.println("Voce nao possui este saldo para saque");
		}
		else{
			int s_atual = Saldo - saque;
			System.out.println("Saque realizado. Saldo atual:" +s_atual);
		} 	
	}
	else if (menu == 4){
		int Saldo = 1000;
		System.out.println("Valor a transferir: ");
		
		int transfer = banco.nextInt();
		if (transfer > 1000) {
			System.out.println("Voce nao possui este saldo para transferencia");
		}
		else {
			int t_atual = Saldo - transfer;
			System.out.println("Transferencia realizada. Saldo atual:" +t_atual);
			}
	}
		else if (menu == 5) {
		System.out.println("Obrigado por utilizar nossos servicos, volte sempre!");
		break;
	}
	while (menu > 5) {
		System.out.println("Operacao inexistente, tente novamente!");
		break;
	}
}
}
}