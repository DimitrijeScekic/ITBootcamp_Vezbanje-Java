package stariPaket;

/*Napisati interfejs IChangeable koji ima metodu tipa void bez
argumenata changeState(), printState();

Napisati klasu Uredjaj koja implementira interfejs IChangeable
tako sto metoda changeState() menja ukljucenost/iskljucenost uredjaja
metoda printState() ispisuje status uredjaja.

Napisati klasu Animal koja implementira interfejs IChangeable
tako sto metoda changeState() menja status da li je zivotinja gladna 
ili ne.  printState() ispisuje da li je zivotinja gladna ili ne*/

public class Uredjaj implements IChangeable {

	public boolean isON = false;

	@Override
	public void changeState() {
		if (isON) {
			isON = false;
		}
		isON = true;
		
		// isOn = !isOn
	}
	
	

	@Override
	public void printState() {
		//System.out.println(this.toString());
		if(isON)
			System.out.println("Iskljucen !");
		else
			System.out.println("Ukljucen !");
	}

	@Override
	public String toString() {
		return "Uredjaj je ukljucen = " + isON;
	}

}
