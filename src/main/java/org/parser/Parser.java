package org.parser;

import org.model.Instruction;

public class Parser {

    public Instruction readLine(String line) {

        String[] parseLine = line.split(" ");

        if (!isValidateReadLine(parseLine)) {
            return null;
        }

        Instruction instruction = new Instruction();
        instruction.setIngredient(parseLine[0]);
        instruction.setCookTime(Integer.parseInt(parseLine[1]));

        return instruction;
    }

    public boolean isValidateReadLine(String[] readLine) {

        if (readLine.length > 2) {
            return false;
        }

        try{
            Integer.parseInt(readLine[1]); // TIME OF COOKING
        }catch (Exception e){
            return false;
        }

        return true;

    }
}
