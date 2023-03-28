import java.util.Scanner;

public class BancoMet{
		static void Metodo1(){
			
	Scanner banco = new Scanner (System.in);
			
	System.out.println("Digite:");			
	System.out.println("1-Saldo: ");
	System.out.println("2-Deposito: ");
	System.out.println("3-Saque: ");
	System.out.println("4-Transferencia: ");
					
	double saldo = 1000;
	int oper = banco.nextInt();
	
		if (oper == 1){
		System.out.println("Saldo:"+saldo);
	}
	}
	
		static void Metodo2(){
		Scanner banco = new Scanner (System.in);
		double saldo = 1000;
			int oper = banco.nextInt();
			if (oper == 2){
				System.out.println("Valor a depositar:");
			double deposito = banco.nextDouble();
			double d_atual = deposito + saldo;
				System.out.println("Saldo:" +d_atual);
	}
	}
		
		static void Metodo3(){
		Scanner banco = new Scanner (System.in);
		double saldo = 1000;
		int oper = banco.nextInt();
				if (oper == 3){
				System.out.println("Valor a sacar:");
				double saque = banco.nextDouble();
				if (saque > saldo){
				System.out.println("Saldo insuficiente");	
	}
			
		else{
		double s_atual = saldo - saque;
		System.out.println("Saldo:" +s_atual);}
	}
	}

		static void Metodo4(){
		Scanner banco = new Scanner (System.in);
		double saldo = 1000;
		int oper = banco.nextInt();	
		if (oper == 4){

		System.out.println("Valor a transferir:");

		double transf = banco.nextDouble();
			
		if (transf > saldo){
			System.out.println("Saldo insuficiente");		
		}

		else{
		double t_atual = saldo - transf;
		System.out.println("Saldo:" +t_atual);
		}
		}
		else{
		System.out.println("Operacao inexistente.");
	}	
	}
	public static void main (String[] args) {	
	Metodo1();
	Metodo2();
	Metodo3();
	Metodo4();
		
}
}