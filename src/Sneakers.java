
public class Sneakers extends FootWear implements IBrandable {
	private String firm = null;
	private String protectorType = null;
	
	public Sneakers(int size, String vendor, String color, String brand, String firm, String protectorType) {
		super(size, vendor, color, brand);
		this.firm = firm;
		this.protectorType = protectorType;
	}
	
	public String GetFirm() {
		return firm;
	}
	
	public String GetProtectorType() {
		return protectorType;
	}
}
