// Andre Heller,Gabriel de Souza Klauck e Martin Lange de Assis

package ordenacao;

public class Veiculo implements Comparable<Veiculo> {
	private String placa;
	private String modelo;
	private int ano;
	private String proprietario;

	public Veiculo() {

	}

	public Veiculo(String placa, String modelo, int ano, String proprietario) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.proprietario = proprietario;
	}

	public String toString() {
		return "Veiculo " + modelo + ", " + placa + ", " + ano + ", de " + proprietario;
	}

	public int compareTo(Veiculo v) {
		return this.placa.compareTo(v.placa);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

}