package excecoes_Exemplos;

public class FormatadordeCepExemplo {
	public static void main(String[] args) {
		try {
			//Tentativa feita para ajustar o Cep formatado
			String cepFormatado = formatarCep("1786523");
			System.out.println(cepFormatado);
		}catch (CepInvalidoException e){
			e.printStackTrace();
			//O método printStackTrace() em Java é usado para imprimir a pilha de chamadas de um thread em um fluxo de erro padrão 
			//System.out.println("Ta errado Rapaaaz!");		
		}
		
	}
	
	public static String formatarCep(String cep) throws CepInvalidoException{
		if (cep.length() != 8) {
			throw new CepInvalidoException();
		}
		return cep;
	}

}
