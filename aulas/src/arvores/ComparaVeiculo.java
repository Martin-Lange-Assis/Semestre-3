package arvores;

public class ComparaVeiculo extends Veiculo {

	public ComparaVeiculo(String placa, String modelo, int ano, String proprietario) {
		super(placa, modelo, ano, proprietario);
	}

	@Override
	public int compareTo(Veiculo outro) {
		return this.getModelo().compareTo(outro.getModelo());
	}
}
