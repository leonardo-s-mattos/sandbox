package org.mattos.sandbox.marsrover;

public class Plateau {

    private Rover rover;

    private static final String MOVE = "M";
    private static final String TURN_LEFT = "L";
    private static final String TURN_RIGHT = "R";

    private static final String INTO_CHARACTERS = "";
    private static final String COORDINATE_FORMAT = "%d %d %s";


    public Plateau(Rover rover){
        this.rover = rover;
    }

    public String execute(String input){


        for (String command :
                commandsFrom(input)) {
            if (command.equals(MOVE)) {
                rover = rover.move();
            }
            if (command.equals(TURN_RIGHT)) {
                rover = rover.turnRight();
            }
            if (command.equals(TURN_LEFT)) {
                rover = rover.turnLeft();
            }
        }

        return formatCoordinate();
    }

    private String[] commandsFrom(String input){
        return input.split(INTO_CHARACTERS);
    }

    private String formatCoordinate() {
        return String.format(COORDINATE_FORMAT, rover.getX(), rover.getY(), rover.getCardinal());
    }


}
