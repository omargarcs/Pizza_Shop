package org.model;

public class Instruction {

    private String ingredient;
    private int cookTime;

    public Instruction(){

    }

    public Instruction (String ingredient, int cookTime){
        this.ingredient = ingredient;
        this.cookTime = cookTime;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }
}
