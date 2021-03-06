package org.kitchen;

import org.model.Flavor;
import org.model.Ingredient;
import org.model.Instruction;

public class Kitchen {

    Flavor flavor;
    Ingredient ingredients;

    public Flavor cookingInstruction(Instruction instruction) {

        ingredients = instruction.getIngredient();

        int cookTime = instruction.getCookTime();

        if (isvalidCookTime(cookTime)) {
            return flavor;
        }

        switch (ingredients) {
            case ELOTE:
                if (cookTime == 15) {
                    flavor = Flavor.PIZZA_MEXICANA;
                }
                break;

            case PINA:
                if (cookTime == 20) {
                    flavor  = Flavor.PIZZA_HAWUAIANA;
                }
                break;

            case ATUN:
                if (cookTime == 30) {
                    flavor  = Flavor.PIZZA_MARISCOS;
                }
                break;

            default:
                flavor = Flavor.ESO_NO_ES_PIZZA;
        }

        return flavor;
    }

    private Boolean isvalidCookTime(int cookTime) {
        //POSIBLE REFACTOR
        if (cookTime <= 14) {
            flavor = Flavor.PIZZA_CRUDA;
            return true;
        } else if (cookTime >= 31) {
            flavor = Flavor.PIZZA_QUEMADA;
            return true;
        }
        return false;
    }
}
