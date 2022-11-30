package org.example.zoo;

import java.util.Objects;

public class Food {
    private KindOfFood food;

    enum KindOfFood{
        CARROT, BANANA, FRUITS
    }

    public Food(KindOfFood food) {
        this.food = food;
    }

    public Food() {
    }

    public KindOfFood getFood() {
        return food;
    }

    public void setFood(KindOfFood food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Food{" +
                "food=" + food +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food1 = (Food) o;
        return food == food1.food;
    }

    @Override
    public int hashCode() {
        return Objects.hash(food);
    }
}
