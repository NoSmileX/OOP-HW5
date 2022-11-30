package org.example.zoo.animals;

import org.example.zoo.Food;

import java.util.Objects;

public class Horse extends Animal {
    private Food food;

    public Horse(String name, int age, Food food) {
        super(name, age);
        this.food = food;
    }

    public Horse() {
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public void getVoice() {
        System.out.println("Игого!");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food=" + food +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(food, horse.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }
}
