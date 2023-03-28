public class classe {
	// Metodo Estático
	static void meuMetodoEstatico() {
		System.out.println("Metodos estaticos podem ser chamados sem criar objetos!");
	}
	
	// Metodo Publico
	static void meuMetodoPublico() {
		System.out.println("Metodos publicos podem ser chamados criando objetos!");
	}
	
	// Main Method
	public static void main (String[] args) {
		meuMetodoEstatico(); // Chama o metodo estaticos
		// meuMetodoPublico(); Essa linha compilaria um erro
		
		classe myObj = new classe(); //Cria um objeto da "classe"
		myObj.meuMetodoPublico(); // Chama o metodo publico atraves de um objeto
	}
}	