package classeswithattributes;

public class ProductManager {
	public void Add(Product product) {
		System.out.println("Urun Eklendi: " + product.getName() + " " + product.getKod());
	}
}
