package org.kitchen;

import org.model.Instruction;

enum Flavor{
    PIZZA_MEXICANA,
    PIZZA_HAWUAIANA,
    PIZZA_MARISCOS,
    ESO_NO_ES_PIZZA,
    PIZZA_CRUDA,
    PIZZA_QUEMADA
}

public class Kitchen {

    Flavor flavor = null;

    public String cookingInstruction(Instruction instruction) {

        String ingredient = instruction.getIngredient();
        int cookTime = instruction.getCookTime();

        if (isvalidCookTime(cookTime)) {
            return flavor.toString();
        }

        switch (ingredient) {
            case "ELOTE":
                if (cookTime == 15) {
                    flavor = Flavor.PIZZA_MEXICANA;
                }
                break;

            case "PINA":
                if (cookTime == 20) {
                    flavor  = Flavor.PIZZA_HAWUAIANA;
                }
                break;

            case "ATUN":
                if (cookTime == 30) {
                    flavor  = Flavor.PIZZA_MARISCOS;
                }
                break;

            default:
                flavor = Flavor.ESO_NO_ES_PIZZA;
        }

        return flavor.toString();
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
