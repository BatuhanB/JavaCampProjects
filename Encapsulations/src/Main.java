public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.PublicKey = "This is a public key!";
        product.ProtectedKey = "This is a protected key!";

        ProductManager.Encapsulate(product);
    }
}
