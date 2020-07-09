/** 
	Mathematikfunktion: Multiplizierer<br>
	Multipliziert zwei Zahlen und liefert auf Anfrage das Resultat
*/
public class Multiplizierer extends MathOp
{
	/** Erzeugt den Multiplizierer und initalisiert die Attribute */
	public Multiplizierer(){
		super();
	}

	/** 
	 * Multiplikationsoperation<br>
	 * Führt die Operation  value1 * value2 aus.
	 */
	public void execOp(float value1, float value2){
		res = value1 * value2;
	}
}