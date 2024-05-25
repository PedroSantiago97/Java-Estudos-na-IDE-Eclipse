package listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	
	private int tamanhoLista = 0;
	
	public ListaDuplamenteEncadeada(){
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
	public void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
		novoNo.setNoProximo(null);
		novoNo.setNoPrevio(ultimoNo);
		if(primeiroNo == null) {
			primeiroNo = novoNo;
		}
		if (ultimoNo != null) {
			ultimoNo.setNoProximo(novoNo);
		}
		
		ultimoNo = novoNo;
		tamanhoLista++;
	}
	
	public void add(int index, T elemento) {
		//Quando se pensa em adicionar valores em um determinado lugar de uma lista
		//temos que pensar nas ações:
		//Indice fora do tamanho da lista:
		if(index < 0 || index > tamanhoLista) {
			throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
		}
		
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		//Adição no inicio:
		if (index == 0) {
			//O proximo nó do novo nó sera o atual do primeiro
			novoNo.setNoProximo(primeiroNo);
			// Se a lista não estiver vazia, ajusta o nó anterior do atual primeiro nó
			if(primeiroNo != null) {
				primeiroNo.setNoPrevio(novoNo);	
			}
			 // Atualiza o primeiro nó para ser o novo nó
			primeiroNo = novoNo; 
			if(tamanhoLista == 0) {
				ultimoNo = novoNo;
			}
		//Adição no fim:
		}else if(index == tamanhoLista) {
			novoNo.setNoProximo(ultimoNo);
			if(ultimoNo != null) {
				ultimoNo.setNoProximo(novoNo);
			}
			ultimoNo = novoNo;
		}else {
			//Adição no Meio:
			NoDuplo<T> noAuxiliar = getNo(index);
			novoNo.setNoProximo(noAuxiliar);
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
			noAuxiliar.getNoPrevio().setNoProximo(novoNo);
			noAuxiliar.setNoPrevio(novoNo);
		}
		tamanhoLista++;
	}
	
	public void remove(int index){
		
		//Ao implementar a remoção de um termo da lista
		//temos que pensar nas ações:
		//Se o Indicie é o primeiro
		if(index == 0) {
			primeiroNo = primeiroNo.getNoProximo();
			if(primeiroNo!=null) {
				primeiroNo.setNoPrevio(null);	
			}else {
				ultimoNo = null;
			}
			
		}else {
			NoDuplo<T> noAuxiliar = getNo(index);
			noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
			if(noAuxiliar != ultimoNo) {
				noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
			}else {
				ultimoNo = noAuxiliar.getNoPrevio();
			}
		}	
		
		this.tamanhoLista--;
		
	}
	
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	
	private NoDuplo<T> getNo(int index){
		NoDuplo<T> noAuxiliar = primeiroNo;
		for(int i = 0;(i < index)&&(noAuxiliar!=null);i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		
		return noAuxiliar;
	}
	
	public int size() {
		return tamanhoLista;
				
	}

	@Override
	public String toString() {
		String strRetorno = "";
		
		NoDuplo<T> noAuxiliar = primeiroNo;
		for(int i = 0;i<size();i++) {
			strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
			
		}
		strRetorno+="null";
		return strRetorno;
	}
	
	

}
