package estudo_Nos;

public class No <T>{
	private T conteudo;
	private No<T> proximoNo;
	
	public No(T conteudo) {
		this.proximoNo = null;
		this.conteudo = (T) conteudo;
	}
	
	
	
	public T getConteudo() {
		return conteudo;
	}
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	public No<?> getProximoNo() {
		return proximoNo;
	}
	@SuppressWarnings("unchecked")
	public void setProximoNo(No<?> proximoNo) {
		this.proximoNo = (No<T>) proximoNo;
	}
	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
	
	

}
