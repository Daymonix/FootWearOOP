
public class Boots extends FootWear implements IBrandable {
	private int heellSize = 0;
	private String type = null;
	
	public Boots(int size, String vendor, String color, String brand, int hellSize, String type) {
		super(size, vendor, color, brand);
		this.heellSize = hellSize;
		this.type = type;
	}
	
	public int GetHeellSize() {
		return heellSize;
	}
	
	public String GetType() {
		return type;
	}
}
