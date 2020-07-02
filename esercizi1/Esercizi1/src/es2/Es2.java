package es2;

public class Es2 {

	public static void Namemaiusc(String name,String sur) {
		
		String maiuscName = name.toUpperCase();
		String maiuscSur = sur.toUpperCase();
		
		System.out.println(maiuscName + " " + maiuscSur);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona capo = new Persona();
		Persona sheriff = new Persona();
		capo.nome = "Paolo";
		capo.cognome = "Rossi";
		sheriff.nome = "john";
		sheriff.cognome = "smith";
		
		Namemaiusc(capo.nome,capo.cognome);
	}

}
