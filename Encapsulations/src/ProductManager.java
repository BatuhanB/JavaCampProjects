public class ProductManager {
    public static void Encapsulate(Product product){
        System.out.println("You can access this key only in class => " + product.ProtectedKey
                + " \n You can always access this key in everywhere => " + product.PublicKey);
    }
}
