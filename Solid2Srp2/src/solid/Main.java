package solid;

import solid.srp.models.FactoryCreator;
import solid.srp.models.Order;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        //Order order = new Order("", "", 0, 0);

        Order order = new FactoryCreator().inputFromConsole();

        order.saveToJson();
    }
}
