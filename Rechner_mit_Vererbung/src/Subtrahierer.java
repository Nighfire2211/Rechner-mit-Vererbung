/** 
	Mathematikfunktion: Subtrahierer
	Subtrahiert zwei Zahlen und liefert auf Anfrage das Resultat
*/
public class Subtrahierer extends MathOp
{
	/** Erzeugt den Subtrahierer und initalisiert die Attribute */
	public Subtrahierer(){
		super();
	}

	/** 
	 * Subtraktionsoperation
	 * führt Operation  value1 - value2 aus
	 */
	public void execOp(float value1, float value2){
		res = value1 - value2;
	}
}