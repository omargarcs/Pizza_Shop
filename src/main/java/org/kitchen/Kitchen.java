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

    public String cookingInstruction(Instruction instruction) {

        String ingredient = instruction.getIngredient();
        int cookTime = instruction.getCookTime();
        Flavor flavor = null;

        if (validateCookTime(cookTime) != null) {

            return validateCookTime(cookTime);
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

    private String validateCookTime(int cookTime) {

        //POSIBLE REFACTOR
        if (cookTime <= 14) {
            return "Pizza Cruda";
        } else if (cookTime >= 31) {
            return "Pizza Quemada";
        }
        return null;
    }
}
