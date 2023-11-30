package etu.unilim.fr;

import etu.unilim.fr.rover.Rover;

public class MoveRover {
    public static String moveWithText(Rover rover, String string){
        int i;
        for (i=0; i<=string.length(); i++){
            convertTextInDirection(string[i]);
        }
    }

    public static void convertTextInDirection(Rover rover, String c){
        switch (c) {
            case "f":
                rover.forward();
                break;
            case "b":
                rover.backward();
                break;
            case "l":
                rover.turnLeft();
                break;
            case "r":
                rover.turnLeft();
                break;
            default:
                System.out.println("Lettre incorrect");
                break;
        }
    }
}

