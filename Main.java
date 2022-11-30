package org.example.zoo;

import org.example.zoo.animals.Horse;
import org.example.zoo.animals.Kangaroo;
import org.example.zoo.animals.Monkey;

public class Main {
    public static void main(String[] args) {
        Food carrot = new Food(Food.KindOfFood.CARROT);
        Food fruits = new Food(Food.KindOfFood.FRUITS);
        Food banana = new Food(Food.KindOfFood.BANANA);

        Monkey monkey = new Monkey("Bob", 6, banana);
        Kangaroo kangaroo = new Kangaroo("Piter", 5, fruits);
        Horse horse = new Horse("Penny", 10, carrot);

        TicketShop ticketShop = new TicketShop(12, monkey, kangaroo, horse);

        Customer customer = new Customer("Посетитель", 100);

        ticketShop.buyTicketForEnter(customer);

    }
}
