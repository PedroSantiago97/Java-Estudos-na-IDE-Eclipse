package collectionsJAVA;

import java.util.Comparator;

public class Hortifruti implements Comparable<Hortifruti>{
	private String fruta;
	private Double peso;
	private Double preco;
	
	public Hortifruti(String fruta, Double peso, Double preco) {	
		this.fruta = fruta;
		this.peso = peso;
		this.preco = preco;
	}

	public String getFruta() {
		return fruta;
	}

	public void setFruta(String fruta) {
		this.fruta = fruta;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Hortifruti [fruta =" + fruta + ", peso =" + peso + "Kg, preço =R$ " + preco + "]\n";
	}

	@Override
	public int compareTo(Hortifruti o) {
		// TODO Auto-generated method stub
		return this.getFruta().compareToIgnoreCase(o.getFruta());
	}
	

}

class ComparatorPeso implements Comparator<Hortifruti>{

	@Override
	public int compare(Hortifruti o1, Hortifruti o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getPeso(), o2.getPeso());
	}
	
}
