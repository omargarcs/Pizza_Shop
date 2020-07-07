package org.kitchen;

import org.junit.Assert;
import org.junit.Test;
import org.model.Instruction;

public class CookTest {

    @Test
    public void cookingInstructionTest(){
        Cook cook = new Cook();
        Instruction mexicana = new Instruction("ELOTE",15);
        Instruction hawuaiana = new Instruction("PINA",20);
        Instruction mariscos = new Instruction("ATUN",30);
        Instruction quemada = new Instruction("ATUN",31);
        Instruction cruda = new Instruction("ATUN",14);
        Instruction noPizza = new Instruction("PASTOR",25);

        Assert.assertEquals("PIZZA MEXICANA", cook.cookingInstruction(mexicana));
        Assert.assertEquals("PIZZA HAWUAIANA", cook.cookingInstruction(hawuaiana));
        Assert.assertEquals("PIZZA MARISCOS", cook.cookingInstruction(mariscos));
        Assert.assertEquals("Pizza Quemada", cook.cookingInstruction(quemada));
        Assert.assertEquals("Pizza Cruda", cook.cookingInstruction(cruda));
        Assert.assertEquals("ESO NO ES PIZZA", cook.cookingInstruction(noPizza));

        /* HOMEWORK
        - Separar Pruebas
        - Cambiar if -> ValidateCook
        - Investigar y aplicar Enums */
    }
}
