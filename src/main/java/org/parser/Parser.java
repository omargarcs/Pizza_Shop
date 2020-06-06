package org.parser;

import org.model.Instruction;

public class Parser {

    public Instruction readLine(String line) {

        String[] parseLine = line.split(" ");

        if (!validateReadLine(parseLine)) {
            return null;
        }

        Instruction instruction = new Instruction();
        instruction.setIngredient(parseLine[0]);
        instruction.setCookTime(Integer.parseInt(parseLine[1]));

        return instruction;
    }

    public boolean validateReadLine(String[] readLine) {

        if (readLine.length <= 2) {
            return true;
        }

        //Only validate the Int value
        Integer.parseInt(readLine[1]);

        return false;

    }
}
