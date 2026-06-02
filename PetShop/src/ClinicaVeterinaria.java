
public class ClinicaVeterinaria {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("thor",12,true,"pitbull");
		Gato gato1 = new Gato("zeus",2,true,true);
		Cliente cliente1 = new Cliente();
		//CLIENTE
		cliente1.setNome("Antonio");
		cliente1.setTelefone("55 85 91234-5678");
		//CACHORRO 1
		//cachorro1.setNome("Thor");
		//cachorro1.setIdade(-3);
		//cachorro1.setRaca("Pastor-alemão");
		//cachorro1.setFaminto(false);
		//cachorro1.setDono(cliente1);
		//cachorro1.setRaca("seila");
		gato1.emitirSom();
		gato1.exibirDados();
		cachorro1.emitirSom();
		cachorro1.exibirDados();
		System.out.println("Total de Animais na clínica: " + Animal.getTotalAnimal());
	}

}
