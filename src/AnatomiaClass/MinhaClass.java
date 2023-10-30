package AnatomiaClass;

public class MinhaClass {
	
	public static void main (String [] args) {
		System.out.println("Hello World!!");
		
		String primeiroNome = "Thiago";
		String segundoNome = "Alves";
		
		String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		
		return "Resultado do método: "+primeiroNome.concat(" ").concat(segundoNome);
	}

}
