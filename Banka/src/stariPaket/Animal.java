package stariPaket;

/*Napisati interfejs IChangeable koji ima metodu tipa void bez
argumenata changeState(), printState();

Napisati klasu Uredjaj koja implementira interfejs IChangeable
tako sto metoda changeState() menja ukljucenost/iskljucenost uredjaja
metoda printState() ispisuje status uredjaja.

Napisati klasu Animal koja implementira interfejs IChangeable
tako sto metoda changeState() menja status da li je zivotinja gladna 
ili ne.  printState() ispisuje da li je zivotinja gladna ili ne*/

public class Animal implements IChangeable {
	public boolean isHungry = false;

	@Override
	public void changeState() {
		if (isHungry) {
			isHungry = false;
		}
			isHungry = true;
		//	isHungry  = !isHungry;
	}

	@Override
	public void printState() {
		System.out.println(this.toString());
		if(isHungry==!isHungry)
			System.out.println("Nije gladna !");
		else
			System.out.println("Gladna je !");
	}

	@Override
	public String toString() {
		return "Animal is hungry = " + isHungry;
	}

}