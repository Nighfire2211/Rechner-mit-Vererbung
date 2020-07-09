/** 
	Mathematikfunktion: Dividierer<br>
	Dividiert zwei Zahlen und liefert auf Anfrage das Resultat.
*/
public class Dividierer extends MathOp
{	
	/** Initalisiert die Attribute */
	public Dividierer(){
		super();
	}

	/**
	 * Divisionsoperation<br> 
	 * Führt die Operation  value1 / value2 aus.<br>
	 * Der Wert von value2 darf dabei nicht 0 sein!
	 */
	public void execOp(float value1, float value2){
		if (value2 == 0)
			res = (float)Double.NaN;
		else
			res = value1 / value2;
	}
}