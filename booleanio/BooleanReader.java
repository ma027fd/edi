package booleanio;


/**
 * Write a description of class boolean1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import inout.Console;

public class BooleanReader
{
    public static void main (String args[]){
        System.out.println("Wert für lichtschalter_1 eingeben:");
        boolean lichtschalter_1 = Console.readBoolean();
        System.out.println("Wert für lichtschalter_2 eingeben:");
        boolean lichtschalter_2 = Console.readBoolean();
        boolean licht_an = lichtschalter_1 || lichtschalter_2;
        System.out.println("licht_an hat den wert: "+licht_an);
        return;
    }
}
