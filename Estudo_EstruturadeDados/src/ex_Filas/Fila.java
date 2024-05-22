package ex_Filas;

public class Fila<T> {
	private No<T> refNoEntradadaFila;
	
	public Fila() {
		this.refNoEntradadaFila = null;
	}
	
	
	public void enqueue(T obj) {
		No<T> novoNo = new No<T>(obj);
		novoNo.setRefNo(refNoEntradadaFila);
		refNoEntradadaFila = novoNo;
	}
	
	@SuppressWarnings("unchecked")
	public T first() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = refNoEntradadaFila;
			while (true){
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();	
				}else {
					break;
				}
			} 
			return (T) primeiroNo.getObject();
		}
		return null;
		
	}
	
	public Object dequeue() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = refNoEntradadaFila;
			No<T> noAuxiliar = refNoEntradadaFila;
			while (true){
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();	
					
					
				}else {
					noAuxiliar.setRefNo(null);
					break;
				}
			} 
			return primeiroNo.getObject();
		}
		
		return null;
		
	}
	
	public boolean isEmpty() {
		return refNoEntradadaFila == null ? true: false ;
	}

	@Override
	public String toString() {
		String  stringRetorno = "";
		No<T> noAuxiliar = refNoEntradadaFila;
		
		if(refNoEntradadaFila != null) {
			while(true) {
				stringRetorno += "[No{objeto "+noAuxiliar.getObject()+"}]--->";
				if(noAuxiliar.getRefNo()!=null) {
					noAuxiliar = noAuxiliar.getRefNo();	
				}else {	
					stringRetorno += " null";
					break;		
				}
			}	
		}else {
			stringRetorno = "null";
		}
		return stringRetorno;
		
	}
	
	

}










