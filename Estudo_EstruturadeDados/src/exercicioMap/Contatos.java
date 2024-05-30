package exercicioMap;

import java.util.Objects;
import java.lang.Comparable;

public class Contatos  implements Comparable<Contatos>{
	private String nome;
	private Integer numero;
	
	public Contatos(String nome, Integer numero) {
		
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contatos other = (Contatos) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numero, other.numero);
	}

	@Override
	public String toString() {
		return " Contato: [nome = " + nome + ", numero = " + numero + "]\n";
	}
	

	@Override
	public int compareTo(Contatos o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
