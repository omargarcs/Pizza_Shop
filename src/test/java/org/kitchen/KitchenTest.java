package org.kitchen;

import org.junit.Assert;
import org.junit.Test;
import org.model.Flavor;
import org.model.Ingredient;
import org.model.Instruction;

public class KitchenTest {

    @Test
    public void cookingInstructionTest(){
        Flavor flavor;
        Ingredient ingredient;
        Kitchen kitchen = new Kitchen();

        Instruction mexicana = new Instruction(Ingredient.ELOTE,15);
        Instruction hawuaiana = new Instruction(Ingredient.PINA,20);
        Instruction mariscos = new Instruction(Ingredient.ATUN,30);

        Assert.assertEquals(Flavor.PIZZA_MEXICANA, kitchen.cookingInstruction(mexicana));
        Assert.assertEquals(Flavor.PIZZA_HAWUAIANA, kitchen.cookingInstruction(hawuaiana));
        Assert.assertEquals(Flavor.PIZZA_MARISCOS, kitchen.cookingInstruction(mariscos));
    }

/*    @Test
    public void cookingInstructionThisIsNoPizzaTest(){
        Flavor flavor;
        Ingredient ingredient;
        Kitchen kitchen = new Kitchen();
        Instruction noPizza = new Instruction(Ingredient,25);
        Assert.assertEquals(Flavor.ESO_NO_ES_PIZZA.toString(), kitchen.cookingInstruction(noPizza));
    }*/

    @Test
    public void cookingInstructionBurnPizzaTest(){
        Flavor flavor;
        Ingredient ingredient;
        Kitchen kitchen = new Kitchen();
        Instruction quemada = new Instruction(Ingredient.ATUN,31);
        Assert.assertEquals(Flavor.PIZZA_QUEMADA, kitchen.cookingInstruction(quemada));
    }

    @Test
    public  void cookingInstructionRawPizza(){
        Flavor flavor;
        Ingredient ingredient;
        Kitchen kitchen = new Kitchen();
        Instruction cruda = new Instruction(Ingredient.ATUN,14);
        Assert.assertEquals(Flavor.PIZZA_CRUDA, kitchen.cookingInstruction(cruda));

    }
}
