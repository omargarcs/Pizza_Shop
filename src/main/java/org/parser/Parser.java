package org.parser;

public class Parser {


    public void readLine(String line) {

        String[] parseLine = line.split(" ");
    }

    public boolean validateReadLine(String[] readLine) {

        if (readLine.length != 2) {
            return false;
        }

        //Only validate the Int value
        Integer.parseInt(readLine[1]);

        return true;

    }
}
