package org.parser;

public class Parser {


    public void readLine(String line) {

        String[] parseLine = line.split(" ");

    }

    public boolean validateReadLine(String[] readLine) {

        if (readLine.length != 2) {
            return false;
        }

        String ingredient = readLine[0];
        int timeCook = Integer.parseInt(readLine[1]);

        return true;

    }
}
