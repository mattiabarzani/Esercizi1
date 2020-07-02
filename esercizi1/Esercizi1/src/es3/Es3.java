package es3;

public class Es3 {
	
	public static double Perc(double val, double perc)
	{
		return val*perc;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Portfolio portfolioA = new Portfolio();
    Portfolio portfolioB = new Portfolio();
    
    portfolioA.valore = 1255.25;
    portfolioB.valore = 2561.11;
    
    System.out.println(Perc(portfolioA.valore,0.25));
	}

}
