// Criação da classe Carro
public class carro {

	// Criação do metodo aceleração ()
	public void aceleracao() {
		System.out.println("O carro esta veloz!");
	}
	
	// Cria um metodo de velocidade() e adiciona parametros a ele
	public void velocidade(int velocidadeMaxima) {
		System.out.println("A velocidade e: " + velocidadeMaxima);
	}

	// Dentro da classe main são chamados os metodos no objeto carro
	public static void main (String[] args) {
	carro meuCarro = new carro ();
	meuCarro.aceleracao();
	meuCarro.velocidade(20);
	}
	} 