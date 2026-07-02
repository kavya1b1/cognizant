import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(105, "Keyboard", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(102, "Book", "Education"),
                new Product(104, "Phone", "Electronics")

        };

        System.out.println("===== Linear Search =====");

        Product linearResult = LinearSearch.search(products, 104);

        if (linearResult != null)
            System.out.println(linearResult);
        else
            System.out.println("Product not found");



        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

        System.out.println("\n===== Binary Search =====");

        Product binaryResult = BinarySearch.search(products, 104);

        if (binaryResult != null)
            System.out.println(binaryResult);
        else
            System.out.println("Product not found");

    }
}