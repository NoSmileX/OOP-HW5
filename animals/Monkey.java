package org.example.zoo.animals;

import org.example.zoo.Food;

import java.util.Objects;

public class Monkey extends Animal{
    private Food food;

    public Monkey(String name, int age, Food food) {
        super(name, age);
        this.food = food;
    }

    public Monkey() {
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public void getVoice() {
        System.out.println("Уууу ааа аа ууу аа аа!");
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "food=" + food +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monkey monkey = (Monkey) o;
        return Objects.equals(food, monkey.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }
}
