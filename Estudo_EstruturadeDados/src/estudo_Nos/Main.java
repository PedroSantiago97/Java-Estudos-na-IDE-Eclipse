 
package estudo_Nos;

public class Main {
	public static void main(String[] args) {
		No<?> no1 = new No<String>("Conteudo no1");
		No<?> no2 = new No<String>("Conteudo no2");
		no1.setProximoNo(no2);
		No<?> no3 = new No<String>("Conteudo no3");
		no2.setProximoNo(no3);
		No<?> no4 = new No<String>("Conteudo no4");
		no3.setProximoNo(no4);
		
		System.out.println(no1.getProximoNo().getProximoNo());
		
	}

}
