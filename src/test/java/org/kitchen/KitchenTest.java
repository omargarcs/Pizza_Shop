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

        Instruction mexicana = new Instruction(Ingredient.ELOTE.toString(),15);
        Instruction hawuaiana = new Instruction(Ingredient.PINA.toString(),20);
        Instruction mariscos = new Instruction(Ingredient.ATUN.toString(),30);

        Assert.assertEquals(Flavor.PIZZA_MEXICANA.toString(), kitchen.cookingInstruction(mexicana));
        Assert.assertEquals(Flavor.PIZZA_HAWUAIANA.toString(), kitchen.cookingInstruction(hawuaiana));
        Assert.assertEquals(Flavor.PIZZA_MARISCOS.toString(), kitchen.cookingInstruction(mariscos));
    }

    @Test
    public void cookingInstructionThisIsNoPizzaTest(){
        Kitchen kitchen = new Kitchen();
        Instruction noPizza = new Instruction("PASTOR",25);
        Assert.assertEquals(Flavor.ESO_NO_ES_PIZZA.toString(), kitchen.cookingInstruction(noPizza));
    }

    @Test
    public void cookingInstructionBurnPizzaTest(){
        Kitchen kitchen = new Kitchen();
        Instruction quemada = new Instruction(Ingredient.ATUN.toString(),31);
        Assert.assertEquals(Flavor.PIZZA_QUEMADA.toString(), kitchen.cookingInstruction(quemada));
    }

    @Test
    public  void cookingInstructionRawPizza(){
        Kitchen kitchen = new Kitchen();
        Instruction cruda = new Instruction(Ingredient.ATUN.toString(),14);
        Assert.assertEquals(Flavor.PIZZA_CRUDA.toString(), kitchen.cookingInstruction(cruda));

    }
}
