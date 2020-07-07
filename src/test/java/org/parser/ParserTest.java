package org.parser;

import org.junit.Assert;
import org.junit.Test;
import org.model.Instruction;

public class ParserTest {

    @Test
    public void parseLineTest(){
        Parser parser = new Parser();
        Instruction instruction = parser.readLine("PEPERONI 15");
        Assert.assertEquals("PEPERONI", instruction.getIngredient());
        Assert.assertEquals(15,instruction.getCookTime());
    }

    @Test
    public void parseLineOnlyIngredientTest(){
        Parser parser = new Parser();
        Instruction instruction = parser.readLine("PEPERONI");
        Assert.assertNull(instruction);
    }

    @Test
    public void parseLineSecondElementIntTest(){
        Parser parser = new Parser();
        Instruction instruction = parser.readLine("15 HAWUAIANA");
        Assert.assertNull(instruction);
    }
}
