public class Pessoa {
	String nome = "Igor";
	String sobrenome = "Araujo";
	int idade = 18;
	
	public static void main(String[] args) {
		Pessoa MeuObjeto = new Pessoa ();
		System.out.println("Nome: " + MeuObjeto.nome + " " + MeuObjeto.sobrenome);
		System.out.println("Idade: " + MeuObjeto.idade);
		
}
}