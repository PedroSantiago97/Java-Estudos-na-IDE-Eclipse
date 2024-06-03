package lista_Encadeada;

public class ListaEncadeada<T> {
	
	
	No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}
	public void add(T conteudo) {
		//Criação do objeto novoNo, para colocar o valor do objeto sem instanciar na classe Main
		No<T> novoNo = new No<T>(conteudo);
		//Aqui abaixo, se a lista estiver vazia, a referenciaEntrada vai ser igual a novoNo direto
		
		if (this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}
		No<T> noAuxiliar = referenciaEntrada;
		//Se eu tiver algo em minha lista, o add(); vai acher o ultimo valor 
		for(int i = 0;i < this.size()-1;i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		//E apos achar o ultimo valor, ele vai dar um set no proximo nó com o novoNo
		noAuxiliar.setProximoNo(novoNo);
	}
	
	public T remove(int index) {
		No<T> noPivo = this.getNo(index);
		if(index == 0) {
			referenciaEntrada = noPivo.getProximoNo();
			return noPivo.getConteudo();
		}
		No<T> noAnterior = getNo(index-1);
		noAnterior.setProximoNo(noPivo.getProximoNo());
		return noPivo.getConteudo();
	}
	
	
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	//Criação de getNo(); vai ser usado internamente
	
	private No<T> getNo(int index){
		validaIndice(index);
		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;
		for(int i = 0;i <= index;i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noRetorno;
	}
	
	private void validaIndice(int index) {
		if (index > size()-1) {
			int ultimoIndicie = size() - 1;
			throw new IndexOutOfBoundsException("Não existe conteúdo no indicie "+index+" desta lista. Esta lista só vai até o indice"+ultimoIndicie+". ");
		}
	}
	
	//ADENO: isso é um método size, só que saber o tamanho, pouco importa quem está la
	//é tanto que aqui nao se usa o Nó auxiliar pra ter o retorno anterior e simpra saber se tem ou nao um item ali!!!!
	public int size() {
		int tamanhoLista = 0;	
		No<T> referenciaAux = referenciaEntrada;
		while (true) {
			if(referenciaAux!=null) {
				tamanhoLista++;
				if(referenciaAux.getProximoNo()!=null) {
					referenciaAux = referenciaAux.getProximoNo();
				}else {
					break;
				}
			}else {
				break;
			}
		}
		
		return tamanhoLista;
	}
	
	public boolean isEmpty() {
		return referenciaEntrada == null ?true:false;
		
	}
	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		for (int i = 0;i<this.size();i++) {
			strRetorno += "No{" + noAuxiliar.getConteudo() + "}--> ";
			noAuxiliar = noAuxiliar.getProximoNo();
			
		}
		strRetorno += "null";
		return strRetorno;
	}
	
	
	
	
	
	
	
	
	
	
	

}
