package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final Bread bread;
    private final Integer burgers;
    private final String sauce;
    private final List<String> ingredients;


    public static class BigmacBuilder {
        private Bread bread;
        private Integer burgers = 0;
        private String sauce = "";
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bread(Bread bread) {
            this.bread = bread;
            return this;
        }

        public BigmacBuilder burgers(Integer burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bread, burgers, sauce, ingredients);
        }
    }

    private Bigmac(Bread bread, Integer burgers, String sauce, List<String> ingredients) {
        this.bread = bread;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public Bread getBread() {
        return bread;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bread='" + bread.getName() + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
