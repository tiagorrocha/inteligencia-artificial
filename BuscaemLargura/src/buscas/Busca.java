package buscas;

import java.util.List;

import nos.No;

public abstract class Busca {

	private int valorBusca;
	private String textoResposta;

	public abstract boolean buscarResultado(No no);

	protected void ehResultadoPaternal(List<No> caminho) {

		String retorno = "";
		
		for (No no1 : caminho) {
			retorno = no1.getValor() + " " + retorno;
		}

		this.textoResposta = retorno;
	}

	public void exibirTextoResultado() {
		if (this.textoResposta != null) {
			System.out.println("O caminho percorrido será: " + this.textoResposta);
		} else {
			System.out.println("O valor " + this.valorBusca + " não foi encontrado.");
		}
	}

	public String getTextoResposta() {
		return textoResposta;
	}

	public void setTextoResposta(String textoResposta) {
		this.textoResposta = textoResposta;
	}

	public void setValorBusca(int valorBusca) {
		this.valorBusca = valorBusca;
	}

	public boolean ehResultadoBusca(No no) {
		return no.getValor() == valorBusca;
	}

	public int getValorBusca() {
		return valorBusca;
	}

}
