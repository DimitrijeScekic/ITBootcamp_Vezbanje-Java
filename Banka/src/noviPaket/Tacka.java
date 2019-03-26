package noviPaket;

public class Tacka implements IMovable {

	public double x, y;

	@Override
	public void printLocation() {
		System.out.println(this.toString());
	}

	@Override
	public void moveUP(double value) {
		y += value;
	}

	@Override
	public void moveDown(double value) {
		y -= value;
	}

	@Override
	public void moveRight(double value) {
		x += value;
	}

	@Override
	public void moveLeft(double value) {
		x -= value;
	}

	@Override
	public String toString() {
		return "T[" + x + ", " + y + "]";
	}

}
