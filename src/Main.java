
public class Main {
	
	public static void main(String[] args) {
		Boots b = new Boots(43, "V", "Red", "BONA", 5, "Min");
		System.out.println("Size " + b.GetSize());
		System.out.println("Vendor " + b.GetVendor());
		System.out.println("Color " + b.GetColor());
		System.out.println("Brand " + b.GetBrand());
		System.out.println("HeellSize " + b.GetHeellSize());
		System.out.println("Type " + b.GetType());
		
		System.out.println();
		
		Sandals s = new Sandals(40, "B", "Green", "ASS", false);
		System.out.println("Size " + s.GetSize());
		System.out.println("Vendor " + s.GetVendor());
		System.out.println("Color " + s.GetColor());
		System.out.println("Brand " + s.GetBrand());
		System.out.println("Opened " + s.IsOpened());
		
		System.out.println();
		
		Sneakers sn = new Sneakers(40, "B", "Green", "ASS", "Dal", "Height");
		System.out.println("Size" + sn.GetSize());
		System.out.println("Vendor " + sn.GetVendor());
		System.out.println("Color" + sn.GetColor());
		System.out.println("Brand " + sn.GetBrand());
		System.out.println("Firm " + sn.GetFirm());
		System.out.println("ProtectorType " + sn.GetProtectorType());
	}
}
