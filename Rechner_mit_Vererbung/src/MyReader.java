import java.util.*;
/**
 * 
 *
 * Diese Klasse dient der Werteingabe über die Tastatur.<br>
 * Sie stellt statische Funktionen bereit um Daten mit folgenden Formaten einzulesen
 * <li>Integer</li>
 * <li>Double</li>
 * <li>String</li><p>
 * Der Aufruf einer Funktion erfolgt über<br>
 * String s = MyReader.getString("Bitte Telefonnummer eingeben :");</p>
 */
public class MyReader{

	static Scanner scanner = null;


	// Instanzierung eines Singleton-Objektes für den Scanner
	static Scanner creatScannerObject(){
		if (scanner == null)
			scanner = new Scanner(System.in);
		return scanner;
	}

	/** Liest eine formatierte Eingabe von der Tastatur und liefert den zugehörenden 
		Zahlenwert als int.
	*/
	static public int getInt(String hinweis){
		System.out.print("\n"+hinweis);
		try
		{
			return(creatScannerObject().nextInt());
		}
		catch (InputMismatchException err)
		{
			System.out.println("ERROR : "+err);
			System.exit(0);
			return 0;
		}
	}/*END getKeyInput*/

	/** Liest eine formatierte Eingabe von der Tastatur und liefert den zugehörenden 
		Zahlenwert als int.
	*/
	static public double getDouble(String hinweis){
		System.out.print("\n"+hinweis);
		try
		{
			return(creatScannerObject().nextDouble());
		}
		catch (InputMismatchException err)
		{
			System.out.println("ERROR : "+err);
			System.exit(0);
			return 0;
		}
	}/*END getKeyInput*/


	/** Liest eine formatierte Eingabe von der Tastatur und liefert den zugehörenden 
		Text als String.
	*/	
	static public String getString(String hinweis){
		System.out.print("\n"+hinweis);
		try
		{
			return creatScannerObject().nextLine();
		}
		catch (InputMismatchException err)
		{
			System.out.println("ERROR : "+err);
			System.exit(0);
			return null;
		}
	}


	/*TEST*/
	public static void main(String[] args) throws InputMismatchException{

		System.out.println("Test des Scanners");
		String in = MyReader.getString("Text eingeben: ");
		System.out.println("Einagbe war  : "+in);
		//
		int c = MyReader.getInt("Ganze Zahl eingeben : ");
		System.out.println("Eingabe war         : "+c);
		//
		double d = MyReader.getDouble("Rationale Zahl eingeben : ");
		System.out.println("Einagbe war             : "+d);
	}
}