package by.derzhanovich.learn.logic;

import by.derzhanovich.learn.payment.Payment;

import java.util.Date;
import java.util.List;

public class Action {



    public double totalSum(Payment payment)
    {
         double sumOfProducts = 0;
        for (int i = 0; i <payment.getListOfProducts().size() ; i++) {
            if(payment.getListOfProducts().size() < 0){
                throw new NullPointerException();
            }
            else if (payment.getListOfProducts().get(i).getAmount() == 1)
            {
                sumOfProducts += payment.getListOfProducts().get(i).getPrice();
            }
            else if(payment.getListOfProducts().get(i).getAmount() != 1){
                sumOfProducts += payment.getListOfProducts().get(i).getPrice() *
                        payment.getListOfProducts().get(i).getAmount();
            }
        }
        return sumOfProducts;
    }


    public  double discount(Payment payment){
        double sumOfProducts = totalSum(payment);
         double discountSum = 0;
         discountSum = sumOfProducts - (sumOfProducts * 0.05);
        return discountSum;
    }


    public void printTotalSum(Payment payment){
        System.out.printf("Итого: %.2f\n" ,totalSum(payment));
    }

    public void printTotalSumWithDiscount(Payment payment){
        System.out.printf("Итого: %.2f \n", totalSum(payment));
        System.out.println("Скидка: 5%");
        System.out.printf("Итого со скидкой: %.2f\n", discount(payment));
    }

    public void printReceipt(Payment payment){
        System.out.println("Дата: " + new Date() + "\n");
        System.out.println("Минск, ул. Вчерашняя, 25");
        System.out.println("Касса №2");
        System.out.println("=====ПЛАТЕЖНЫЙ ДОКУМЕНТ=====");
        System.out.println("Получатель платежа: Сеть торговых \nцентров 'Корона'" );
        for (int i = 0; i < payment.getListOfProducts().size(); i++) {
            System.out.println(payment.getListOfProducts().get(i).getName() +":\n" +
                    "Кол-во: " + payment.getListOfProducts().get(i).getAmount() + "\nЦена: " +
                    payment.getListOfProducts().get(i).getPrice());
        }
        printTotalSumWithDiscount(payment);
        System.out.println("Кассир ГАЛЯ");
        System.out.println("=====СПАСИБО ЗА ПОКУПКУ!=====");
    }
}
