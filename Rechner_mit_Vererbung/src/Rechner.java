public class Rechner 
{
	public static void main(String[] args) 
	{
		// die "Maschinen" erzeugen
		MathOp oper;
		Tokenizer token               = new Tokenizer();
		String term;

		// Eingabe einer Rechnung erfragen
		System.out.println ("Geben Sie eine Grundoperation mit zwei Zahlen ein, z.B. 5+2 oder 8/5.4 usw");
		term = MyReader.getString("Rechnung : ");
		//den String in seine Token zerlegen
		token.split(term);
		System.out.println("1. Zahl       : "+token.getValue1());
		System.out.println("Operation ist : "+token.getOperation());
		System.out.println("2. Zahl       : "+token.getValue2());
		//die Operation ausführen
		switch (token.getOperation())
		{
			case '+' :	oper = new Addierer();				//Polymorphie mit Referenzvariablen und Objekten
						break;
			case '-' :	oper = new Subtrahierer();
						break;
			case '*' :	oper = new Multiplizierer();
						break;
			case '/' :	oper = new Dividierer();
						break;						
			default  :  oper = null;				
		}
		
		if(oper != null) {
			oper.execOp(token.getValue1(), token.getValue2());			//Polymorphie mit der execOp-Methode
			System.out.println("Das Ergebis ist: " + oper.getResult());
		} else System.out.println("\nungültige Operation");
	}
}