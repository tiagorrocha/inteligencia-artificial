package buscas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import nos.No;

public class BuscaEmLargura extends Busca {

	// Fila de dados FiFo
	private Queue<No> NosFila;
	private List<No> caminho = new ArrayList<>();

	public BuscaEmLargura(int valorBusca) {
		this.NosFila = new LinkedList<No>();
		this.setValorBusca(valorBusca);
	}

	@Override
	public boolean buscarResultado(No no) {
		// exibirTextoResultado();
		if (ehResultadoBusca(no)) {
			caminho.add(no);
			ehResultadoPaternal(caminho);
			return true;
		} else {
			//Adicionar nó no caminho
			caminho.add(no);
			// Adicionar os nós na fila
			for (No no1 : no.getFilhos()) {
				this.NosFila.add(no1);
			}
            //Recupera a cabeça da fila e a remove da fila.
			No noHead = this.NosFila.poll();
			if (noHead != null && buscarResultado(noHead)) {
				return true;
			}
		}
		return false;
	}

	
/*
	@Override
	public int sizeFolhas() {
		if (this.NosFila != null) {
			return this.NosFila.size();
		}
		return 0;
	}
*/
}
