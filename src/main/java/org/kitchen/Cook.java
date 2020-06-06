package org.kitchen;

import org.model.Instruction;

public class Cook {

    public String cookingInstruction(Instruction instruction) {

        String ingredient = instruction.getIngredient();
        int cookTime = instruction.getCookTime();
        String flavor = "";

        if (validateCookTime(cookTime) != null) {

            return validateCookTime(cookTime);
        }

        switch (ingredient) {
            case "ELOTE":
                if (cookTime == 15) {
                    flavor  =  "PIZZA MEXICANA";
                }
                break;

            case "PINA":
                if (cookTime == 20) {
                    flavor  = "PIZZA HAWUAIANA";
                }
                break;

            case "ATUN":
                if (cookTime == 30) {
                    flavor  = "PIZZA MARISCOS";
                }
                break;

            default:
                flavor  = "ESO NO ES PIZZA";
        }

        return flavor;
    }

    private String validateCookTime(int cookTime) {

        if (cookTime <= 14) {
            return "Pizza Cruda";
        } else if (cookTime >= 31) {
            return "Pizza Quemada";
        }
        return null;
    }
}
