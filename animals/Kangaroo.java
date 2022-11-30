package org.example.zoo.animals;

import org.example.zoo.Food;

import java.util.Objects;

public class Kangaroo extends Animal {
    private Food food;

    public Kangaroo(String name, int age, Food food) {
        super(name, age);
        this.food = food;
    }

    public Kangaroo() {
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public void getVoice() {
        System.out.println("Звук похожий на покашливание простуженного старика");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "food=" + food +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kangaroo kangaroo = (Kangaroo) o;
        return Objects.equals(food, kangaroo.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }
}
