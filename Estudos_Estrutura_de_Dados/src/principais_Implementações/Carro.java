package principais_Implementações;

import java.util.Objects;

public class Carro implements Comparable<Carro>{
	
	String marca;
	
	

	public Carro(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)return true;
		if (obj == null)return false;
		if (getClass() != obj.getClass())return false;
		Carro other = (Carro) obj;
		return Objects.equals(marca, other.marca);
		//return true;
	}

	@Override
	public String toString() {
		return "Carro [marca = " + marca + "]";
	}

	@Override
	public int compareTo(Carro o) {
		//Ordem por tamanho do elemento
		/*if (this.marca.length() < o.marca.length()) {
			return -1;
		}else if((this.marca.length() > o.marca.length())) {
			return 1;
		}*/
		
		//Ordem Alfabética
		return this.getMarca().compareTo(o.getMarca());
	}
	
	
	

}
