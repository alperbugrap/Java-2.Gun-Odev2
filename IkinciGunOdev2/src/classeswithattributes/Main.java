package classeswithattributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setName("Laptop");
		product.setPrice(12999);
		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}

}
