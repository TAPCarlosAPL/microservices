package br.com.erudio.foo.request.conversao;

public class ConversaoNumero {

	public static Double convertToDuble(String strNumero) {
		if (strNumero == null) return 2D; 
		String numero = strNumero.replaceAll(",",".");
		if (isNumeric(numero)) return Double.parseDouble(numero);
		return 3D;
	}

	public static boolean isNumeric(String strNumero) {
		if (strNumero == null) return false; 
			String numero = strNumero.replaceAll(",",".");
			return numero.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
