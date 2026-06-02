public class Cachorro extends Animal {

	String raca;

	public Cachorro(String nome, int idade,boolean faminto,  String raca) {
		super(nome, idade, faminto);
		this.raca = raca;
	}

	
	
	
	
	public String getRaca() {
		return raca;
	}



	public void setRaca(String raca) {
		this.raca = raca;
	}




	@Override
	public void exibirDados() {
		System.out.println("\nINFORMAÇÕES DO CACHORRO:");
		System.out.printf("Nome: %s \n", getNome());
		System.out.printf("Idade: %d \n", getIdade());
		System.out.printf("Raça: %s \n", getRaca());
		if (dono != null) {
			System.out.println("o dono do cachorro é: " + dono.getNome() + " e seu telefone é: " + dono.getTelefone());
		} else {
			System.out.println("este cachorro não tem dono");
		}
		if (faminto == true) {
			System.out.printf("O %s está com fome \n", getNome());
		} else {
			System.out.printf("O %s está de barriga cheia \n", getNome());
		}

		
		
		
	}
	public void emitirSom() {
		System.out.printf("O cachorro chamado %s emite um som: AU AU! ",nome);
	}
}
