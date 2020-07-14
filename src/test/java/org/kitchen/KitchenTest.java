package org.kitchen;

import org.junit.Assert;
import org.junit.Test;
import org.model.Instruction;

public class KitchenTest {

    @Test
    public void cookingInstructionTest(){
        Kitchen kitchen = new Kitchen();
        Instruction mexicana = new Instruction("ELOTE",15);
        Instruction hawuaiana = new Instruction("PINA",20);
        Instruction mariscos = new Instruction("ATUN",30);

        Assert.assertEquals("PIZZA_MEXICANA", kitchen.cookingInstruction(mexicana));
        Assert.assertEquals("PIZZA_HAWUAIANA", kitchen.cookingInstruction(hawuaiana));
        Assert.assertEquals("PIZZA_MARISCOS", kitchen.cookingInstruction(mariscos));
    }

    @Test
    public void cookingInstructionThisIsNoPizzaTest(){
        Kitchen kitchen = new Kitchen();
        Instruction noPizza = new Instruction("PASTOR",25);
        Assert.assertEquals("ESO_NO_ES_PIZZA", kitchen.cookingInstruction(noPizza));
    }

    @Test
    public void cookingInstructionBurnPizzaTest(){
        Kitchen kitchen = new Kitchen();
        Instruction quemada = new Instruction("ATUN",31);
        Assert.assertEquals("PIZZA_QUEMADA", kitchen.cookingInstruction(quemada));
    }

    @Test
    public  void cookingInstructionRawPizza(){
        Kitchen kitchen = new Kitchen();
        Instruction cruda = new Instruction("ATUN",14);
        Assert.assertEquals("PIZZA_CRUDA", kitchen.cookingInstruction(cruda));

    }
}
