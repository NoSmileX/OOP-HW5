package org.example.zoo;

import org.example.zoo.animals.Animal;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class TicketShop {
    private double price;
    private Animal[] animals;

    public TicketShop(double price, Animal... animals) {
        this.price = price;
        this.animals = animals;
    }

    public TicketShop() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void feedAnimals(String animal) {
        for (Animal a :
                animals) {
            if (a.getName().equalsIgnoreCase(animal)) {
                System.out.println(a.getName() + " очень понравился Ваш корм.");
                a.getVoice();
                return;
            }else
                System.out.println(animal + " не найден в зоопарке.");
            return;
        }
    }

    public void feedAllAnimals() {
        for (Animal a :
                animals) {
            System.out.println(a.getName() + " очень понравился Ваш корм.");
            System.out.println();
            a.getVoice();
            System.out.println();
        }
    }

    public void buyTicketForEnter(Customer customer) {
        if (customer.getMoney() < price) {
            System.out.println("Не достаточно денег для посещения Зоопарка.");
        } else dialogWindow();
    }

    public void dialogWindow() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Покормить животное \n2. Покормить всех животных \n3. Выход");
            System.out.println("Введите число: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Для кормления доступны такие животные: ");
                    for (Animal a :
                            animals) {
                        System.out.println(a.getName() + ", возраст " + a.getAge() + ".");
                    }
                    String animal;
                    do {
                        System.out.println("Какое животное будем кормить?");
                        System.out.println("Введите имя животного или введите 0 для выхода: ");
                        animal = scanner.nextLine();
                        if (animal.equals("0")) {
                            System.out.println("Приходите еще!");
                            break;
                        } else {
                            feedAnimals(animal);
                        }
                    } while (true);
                }
                case 2 -> feedAllAnimals();
                case 3 -> {
                    System.out.println("Приходите еще!");
                    return;
                }
            }
        } while (true);

    }

    @Override
    public String toString() {
        return "TicketShop{" +
                "price=" + price +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketShop that = (TicketShop) o;
        return Double.compare(that.price, price) == 0 && Arrays.equals(animals, that.animals);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(price);
        result = 31 * result + Arrays.hashCode(animals);
        return result;
    }
}
