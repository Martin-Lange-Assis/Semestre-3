// Andre Heller,Gabriel de Souza Klauck e Martin Lange de Assis
package trabalho03;
public class Principal {

	public static void main(String[] args) {
		MapaDispersao<String, Veiculo> veiculo = new MapaDispersao<>(10);

		Veiculo v = new Veiculo();
		Veiculo v2 = new Veiculo();
		Veiculo v3 = new Veiculo();
		Veiculo v4 = new Veiculo();
		Veiculo v5 = new Veiculo();
		Veiculo v6 = new Veiculo();

		v.setPlaca("AAA-0123");
		v.setModelo("gol");
		v.setAno(2020);
		v.setProprietario("Antonio");

		v2.setPlaca("AAA-4567");
		v2.setModelo("fusca");
		v2.setAno(2021);
		v2.setProprietario("Joãozinho");

		v3.setPlaca("AAA-5678");
		v3.setModelo("ferrari");
		v3.setAno(1999);
		v3.setProprietario("leandro");

		v4.setPlaca("BBB-1234");
		v4.setModelo("bmw");
		v4.setAno(2015);
		v4.setProprietario("marco");

		v5.setPlaca("CCC-0213");
		v5.setModelo("porche");
		v5.setAno(2012);
		v5.setProprietario("fernando");

		v6.setPlaca("FDH-4895");
		v6.setModelo("mustang");
		v6.setAno(2019);
		v6.setProprietario("maria");

		veiculo.inserir(v.getPlaca(), v);
		veiculo.inserir(v2.getPlaca(), v2);
		veiculo.inserir(v3.getPlaca(), v3);
		veiculo.inserir(v4.getPlaca(), v4);
		veiculo.inserir(v5.getPlaca(), v5);
		veiculo.inserir(v6.getPlaca(), v6);

		System.out.println(veiculo.toString());
		System.out.println(veiculo.buscar("AAA-0123"));
		veiculo.remover("AAA-0123");
		System.out.println(veiculo.toString());
		System.out.println(veiculo.quantosElementos());

	}

}
