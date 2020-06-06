package org.parser;

import org.junit.Assert;
import org.junit.Test;
import org.model.Instruction;

public class ParserTest {

    @Test
    public void parseLineTest(){
        Parser parser = new Parser();
        Instruction instruction = parser.readLine("PEPERONI 15");
        Assert.assertEquals(instruction.getIngredient(), "PEPERONI");
        Assert.assertEquals(instruction.getCookTime(), 15);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void parseLineOnlyIngredientTest(){
        Parser parser = new Parser();
        Instruction instruction = parser.readLine("PEPERONI");

    }
}
