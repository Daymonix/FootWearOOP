
public abstract class Brand implements IBrandable {
	private String brand = null;
	
	public Brand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String GetBrand() {
		return brand;
	}
	
}
