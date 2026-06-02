
public class Animal {
	protected String nome;
	protected int idade;
	protected boolean faminto = true;
	protected Cliente dono;
	protected static int totalAnimais = 0;
	
	//CONSTRUTOR
	Animal(String nome,int idade, boolean faminto){
		Animal.totalAnimais = Animal.totalAnimais + 1;
		this.nome = nome;
		this.idade = idade;
		this.faminto = faminto;
	}
	
	//GETTERS E SETTERS
	public static int getTotalAnimal(){
		return Animal.totalAnimais;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade >=0) {
		this.idade = idade;
		}else {
			System.out.println("IDADE INEXISTENTE!");
			
		}
	}
	
	public Cliente getDono() {
		return dono;
	}

	public void setDono(Cliente dono) {
		this.dono = dono;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isFaminto() {
		return faminto;
	}

	public void setFaminto(boolean faminto) {
		this.faminto = faminto;
	}

	//METODOS
	public void comer() {
		if(faminto == true) {
			System.out.printf("O %s comeu!\n",nome);
				faminto = false;
		}else {
			System.out.printf("o %s já está satisfeito\n",nome);
		}
	}
	
	
	public void emitirSom() {
		System.out.printf("O %s chamado %s emite um som: ",nome);
	}
	
	
	public void exibirDados() {
		System.out.println("INFORMAÇÕES DO ANIMAL:");
		System.out.printf("Nome: %s \n",getNome());
		System.out.printf("Idade: %d \n",getIdade());
		if (dono != null) {
			System.out.println("o dono do Animal é: " + dono.getNome() + " e seu telefone é: " + dono.getTelefone());
			}
		else{
			System.out.println("este animal não tem dono");
		}
		if(faminto == true) {
			System.out.printf("O %s está com fome \n",getNome());
		}
		else {System.out.printf("O %s está de barriga cheia \n",getNome());
		}
	}
	

}

