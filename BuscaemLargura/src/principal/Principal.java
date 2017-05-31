package principal;

import buscas.BuscaEmLargura;
import nos.No;

public class Principal {

	public static void main(String[] args) {

		No no0 = new No(0);
		No no1 = new No(1);
		No no2 = new No(2);
		No no3 = new No(3);
		No no4 = new No(4);
		No no5 = new No(5);
		No no6 = new No(6);
		No no7 = new No(7);
		No no8 = new No(8);
		No no9 = new No(9);
		No no10 = new No(10);
		No no11 = new No(11);
		No no12 = new No(12);
		No no13 = new No(13);
		No no14 = new No(14);

		no0.addFilhos(no1);
		no0.addFilhos(no2);
		no0.addFilhos(no3);
		no1.addFilhos(no4);
		no1.addFilhos(no7);
		no2.addFilhos(no5);
		no2.addFilhos(no8);
		no3.addFilhos(no6);
		no3.addFilhos(no9);
		no5.addFilhos(no10);
		no5.addFilhos(no11);
		no6.addFilhos(no12);
		no6.addFilhos(no13);
		no6.addFilhos(no14);

		BuscaEmLargura bel = new BuscaEmLargura(18);
		bel.buscarResultado(no0);
		bel.exibirTextoResultado();

	}
}
