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
        Instruction quemada = new Instruction("ATUN",31);
        Instruction cruda = new Instruction("ATUN",14);
        Instruction noPizza = new Instruction("PASTOR",25);

        Assert.assertEquals("PIZZA_MEXICANA", kitchen.cookingInstruction(mexicana));
        Assert.assertEquals("PIZZA_HAWUAIANA", kitchen.cookingInstruction(hawuaiana));
        Assert.assertEquals("PIZZA_MARISCOS", kitchen.cookingInstruction(mariscos));
        Assert.assertEquals("PIZZA_QUEMADA", kitchen.cookingInstruction(quemada));
        Assert.assertEquals("PIZZA_CRUDA", kitchen.cookingInstruction(cruda));
        Assert.assertEquals("ESO_NO_ES_PIZZA", kitchen.cookingInstruction(noPizza));

        /* HOMEWORK
        - Separar Pruebas
        - Cambiar if -> ValidateCook
        - Investigar y aplicar Enums */
    }
}
