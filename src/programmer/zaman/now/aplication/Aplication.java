package programmer.zaman.now.aplication;

import programmer.zaman.now.data.*;

public class Aplication {
    public static void main(String[] args) {
        Product product = new Product("laptop", 2000);

        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
