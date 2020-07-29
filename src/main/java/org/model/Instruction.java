package org.model;

public class Instruction {

    private Ingredient ingredient;
    private int cookTime;

    public Instruction(){

    }

    public Instruction (Ingredient ingredient, int cookTime){
        this.ingredient = ingredient;
        this.cookTime = cookTime;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }
}
