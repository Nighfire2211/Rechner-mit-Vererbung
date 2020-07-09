/** 
	Mathematikfunktion: Addierer<br>
	Addiert zwei Zahlen und liefert auf Anfrage das Resultat.
*/
public class Addierer extends MathOp
{	
	/** Erzeugt den Addierer */
	public Addierer(){
		super();
	}

	/** 
	 * Additionsoperation<br>
	 * Führt die Operation  value1 + value2 aus.
	 */
	public void execOp(float value1, float value2){
		res = value1 + value2;
	}
}