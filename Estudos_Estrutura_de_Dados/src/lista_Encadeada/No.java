package lista_Encadeada;

public class No<T> {
	private T conteudo;
	private No<T> proximoNo;
	//Criar 3 construtores, um VAZIO, um passando só o CONTEÚDO e outro com o CONTEÚDO e o PROXIMO NO
	public No() {
		this.proximoNo = null;
	}

	public No(T conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public No(T conteudo, No<T> proximoNo) {
		this.conteudo = conteudo;
		this.proximoNo = proximoNo;
	}
	//Criar os Getters e Setters Padrão
	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}
	//Criar tambem 2 toString, um normal e um personalizado
	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	//Quero queuando meu Objeto estiver em um Sysout, ele irá retornar minha lista
	//Assim o segundo toStringprecisa estar assim
	public String toStringEncadeado() {
		String str = "No [conteudo=" + conteudo + "]";
		//Variável str contendo o retorno de toString
		if(proximoNo != null) {
		//Se o meu proximoNo nao for null ira mostrar uma seta e concatenar o valor de proximoNo em toString
			str += "->" + proximoNo.toString();
		}else {
			str += "null";
		}
		return str;
	}
	

}
