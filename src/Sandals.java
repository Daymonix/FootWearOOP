
public class Sandals extends FootWear implements IOpenable, IBrandable {
	private boolean isOpened = false;
	
	public Sandals(int size, String vendor, String color, String brand, boolean isOpened) {
		super(size, vendor, color, brand);
		this.isOpened = isOpened;
	}
	
	@Override 
	public boolean IsOpened() {
		return isOpened;
	}
}
