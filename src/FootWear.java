
public class FootWear extends Brand{
	private int size = 0;
	private String vendor = null;
	private String color = null;
	
	
	public FootWear() {
		super("");
		vendor = "";
		color = "";
	}
	
	public FootWear(int size) {
		super("");
		this.size = size;
		vendor = "";
		color = "";
	}
	
	public FootWear(int size, String vendor, String color, String brand) {
		super(brand);
		this.size = size;
		this.vendor = vendor;
		this.color = color;
	}
	
	public int GetSize() {
		return size;
	}

	public String GetVendor() {
		return vendor;
	}
	
	public String GetColor() {
		return color;
	}

}
