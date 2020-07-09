
public abstract class MathOp
{	
	protected float res;

	/** Initalisiert die Attribute */
	public MathOp(){
		res = 0.0f;
	}
	
	public abstract void execOp(float value1, float value2);
	
	/** Ergebnisoperation<br>
	 *  Liefert das durch add berechnetet Ergebnis.
	*/
	public float getResult(){
		return res;
	}

}
