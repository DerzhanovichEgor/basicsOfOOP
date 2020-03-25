package by.derzhanovich.learn.main;

import by.derzhanovich.learn.logic.Action;
import by.derzhanovich.learn.payment.Payment;

public class Main {


    public static void main(String[] args) {
        Payment.Product tea = new Payment().new Product(4.99,"Чай.Зеленый.Липтон",1);
        Payment.Product sugar = new Payment().new Product(3.20,"Сахар",2);
        Payment.Product milk = new Payment().new Product(2.59,"Молоко 3.5%", 2);
        Payment.Product cucumber = new Payment().new Product(1.99, "Огурец",2.55f);
        Payment.Product grape = new Payment().new Product(4.75,"Виноград зеленый", 1.542f);

        Payment payment = new Payment();

        payment.addProduct(tea,sugar,milk,cucumber,grape);

        Action act = new Action();

       // act.totalSum(payment);
        act.discount(payment);
      //  act.printTotalSumWithDiscount(payment);
        act.printReceipt(payment);

    }
}
