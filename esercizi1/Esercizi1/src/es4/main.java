package es4;

public class main {
	
	public static String Correzione(String parola)
	{
		String parolaMenoPrimoChar = parola.substring(1);
		String parolaMinuscola = parola.charAt(0) + parolaMenoPrimoChar.toLowerCase();
		String parolafinale = parolaMinuscola.substring(0, 7) + "matore";
		
		return parolafinale;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String nomesbagliato = "PrograMatoRRe";
    System.out.println(Correzione(nomesbagliato));
	}

}
