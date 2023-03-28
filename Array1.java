import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {

		System.out.print("Indique o tamanho do array: ");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		// 

		String[] nomes = new String[x];

		for(int i = 0; i < x; i++) {
			System.out.print("Coloque o nome #" + i + ": ");
			String n = in.next();
			nomes[i] = n;
		}
		for(int j = 0; j < x; j++) {
			System.out.print("\n");
			System.out.print("Nome #" + j + ": "+ nomes[j]);
		}
	}
}