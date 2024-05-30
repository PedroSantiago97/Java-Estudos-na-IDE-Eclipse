package ex_Pilha;

public class Pilha {
	private No refNoEntradaPilha;

	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
////////////////////Organizador de Pilhas///////////////////////////
	
	// Conseguem Adicionar ao TOPO da pilha: push();
	public void push(No novoNo) {
		No refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
		
	}
	// Conseguem extrair o TOPO da pilha e armazena-lo : pop();
		public No pop() {
			if(!this.isEmpty()) {
				No noPoped = refNoEntradaPilha;
				refNoEntradaPilha = refNoEntradaPilha.getRefNo();
				return noPoped;
			}
			return null;
			
			
			
		}
	// Conseguem mostrar o TOPO da pilha e "copiar" sua referencia: top();
	public No top() {
		return refNoEntradaPilha;
	}
	// E por fim uma verificação da pilha pra saber se está vazia isEmpty();
	public boolean isEmpty() {
		if (refNoEntradaPilha == null) {
			return true;
		}else{
			return false;
		}
	}

//////////////////////////To String/////////////////////
	@Override
	public String toString() {
		String stringRetorno = "---------------\n";
		stringRetorno = "        Pilha\n";
		stringRetorno = "---------------\n";
		No noAuxliar = refNoEntradaPilha;
		while (true) {
			if(noAuxliar!=null) {
				stringRetorno += "Nó {" +noAuxliar.getDado() +"}\n";
				noAuxliar = noAuxliar.getRefNo();
			}else {
				break;
			}
		}
		stringRetorno += "===========\n";
		return stringRetorno;
	}
	
	
	
	
}
