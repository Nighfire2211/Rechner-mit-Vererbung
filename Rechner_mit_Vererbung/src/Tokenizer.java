/**
	Zerlegt einen mathematischen Ausdruck in Zahl, Operation, Zahl.
*/
public class Tokenizer
{
	private float zahl1, zahl2;
	private char operation;

	/** Erzeugt einen Tokenizer
	*/
	public Tokenizer(){
	}

	/**
	 * Funktion für die Zerlegung eines mathematischen Ausrucks
	 * <p>
	 * Zerlegt einen String in die drei Token 
	 * <li>Zahl1</li>
	 * <li>Operation</li>
	 * <li>Zahl2</li><br>
	 * Diese Werte können danach über entsprechedne get-Operationen
	 * gelesen werden.
	 * </p>
	*/
	public void split(String cmd){
		
		if (cmd.indexOf('+') != -1){
			operation = '+';
			extract(cmd, operation);
		}
		else if (cmd.indexOf('-') != -1){
			operation = '-';
			extract(cmd, operation);
		}
		else if (cmd.indexOf('*') != -1){
			operation = '*';
			extract(cmd, operation);
		}
		else if (cmd.indexOf('/') != -1){
			operation = '/';
			extract(cmd, operation);
		}
		else if (cmd.indexOf('^') != -1){
			operation = '^';
			extract(cmd, operation);
		}
		else operation ='0';
	}



	private void extract(String cmd, char op){
		try{
			zahl1 = new Float(cmd.substring(0,cmd.indexOf(op)).trim()).floatValue();
			zahl2 = new Float(cmd.substring(cmd.indexOf(op)+1, cmd.length()).trim()).floatValue();
		}
		catch(NumberFormatException err){
			operation = '0';
		}
	}

	/**
		Liefert den 1. Zahlenwert des Ausdrucks.
	*/
	public float getValue1(){
		return zahl1;
	}

	/**
		Liefert den 2. Zahlenwert des Ausdrucks.
	*/
	public float getValue2(){
		return zahl2;
	}


	/**
		Liefert die Operation (+, -, *, /) des Ausdrucks.<br>
		Bei ungültigem Ausdruck wird '0' zurückgeliefert.
	*/
	public char getOperation(){
		return operation;
	}


};