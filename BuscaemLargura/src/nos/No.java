package nos;

import java.util.ArrayList;
import java.util.List;

public class No {

	private int valor;
	List<No> filhos;

	public No() {
		filhos = new ArrayList<No>();
	}

	public No(int valor) {
		this.valor = valor;
		filhos = new ArrayList<No>();
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public List<No> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<No> filhos) {
		this.filhos = filhos;
	}

	public void addFilhos(No noFilho) {

		filhos.add(noFilho);
	}
}
