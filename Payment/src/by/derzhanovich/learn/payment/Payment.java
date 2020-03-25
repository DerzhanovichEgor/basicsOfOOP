package by.derzhanovich.learn.payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Product> listOfProducts = new ArrayList<>();

    public Payment() {
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public class Product{
        private double price;
        private String name;
        private float amount;

        public Product() { }

        public Product(double price, String name, float amount) {
            this.price = price;
            this.name = name;
            this.amount = amount;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        public float getAmount() {
            return amount;
        }


        @Override
        public String toString() {
            return "Product{" +
                    "price=" + price +
                    ", name='" + name + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }

    public List<Payment.Product> addProduct(Payment.Product...products){
        for (int i = 0; i <products.length; i++) {
            listOfProducts.add(products[i]);
        }
        return listOfProducts;
    }


}
