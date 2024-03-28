package desafio_SistemaValidação;

public class Print_Lista_Candidatos {
	public static void main(String[] args) {
		String [] candidatos = {"JOÃO","EMÍLIO","VANESSO","ISOBELO","VANCLEIBSON","JUREMO","CREMILDA","ANSIOLÍTICA" };
		double [] salariosRequeridos = {1355 , 1455, 5000, 2000, 8000, 2000.00, 1699.36, 2000.00 };
		int c = 8;
		int d = 1;
		for(int i = 0;i<c;i++) {
			System.out.println("O candidato "+candidatos[i]+" é o "+d+"º candidato ");
			System.out.println("Sua pretensão salarial é R$"+salariosRequeridos[i]);
			d++;
		}
	}

}
