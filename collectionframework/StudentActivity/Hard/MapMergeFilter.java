import java.util.HashMap;
import java.util.Map;

public class MapMergeFilter {
    public static void main(String[] args) {
        Map<Integer, String> products = new HashMap<>();
        products.put(1, "Laptop");
        products.put(2, "Mouse");
        products.put(3, "Keyboard");
        products.put(4, "Monitor");

        Map<Integer, Double> prices = new HashMap<>();
        prices.put(1, 1200.00);
        prices.put(2, 15.50);
        prices.put(3, 85.00);
        prices.put(4, 250.00);
        
        Map<String, Double> expensiveProducts = new HashMap<>();
        
        for (Map.Entry<Integer, String> productEntry : products.entrySet()) {
            Integer productId = productEntry.getKey();
            String productName = productEntry.getValue();
            Double productPrice = prices.get(productId);
            
            if (productPrice != null && productPrice > 20.0) {
                expensiveProducts.put(productName, productPrice);
            }
        }
        
        System.out.println("Products with prices > $20: " + expensiveProducts);
    }
}
