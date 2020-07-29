package org.parser;

import org.junit.Assert;
import org.junit.Test;
import org.model.Instruction;

public class ParserTest {

    @Test (expected = IllegalArgumentException.class)
    public void parseLineTest(){
        Parser parser = new Parser();
        Instruction instruction = parser.readLine("PEPERONI 15");
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
