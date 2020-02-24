package org.mattos.sandbox.marsrover;

public class Rover {

    private int x;
    private int y;
    private Cardinal cardinal;

    private static final int UP = +1;
    private static final int DOWN = -1;
    private static final int RIGHT = +1;
    private static final int LEFT = -1;

    private static final Cardinal NORTH = new North();
    private static final Cardinal SOUTH = new South();
    private static final Cardinal EAST = new East();
    private static final Cardinal WEST = new West();

    public Rover(int x, int y, Cardinal cardinal) {
        this.x = x;
        this.y = y;
        this.cardinal = cardinal;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Cardinal getCardinal() {
        return cardinal;
    }

    public Rover turnLeft() {
        if(cardinal.equals(NORTH))
            return new Rover(x, y, WEST);
        if(cardinal.equals(SOUTH))
            return new Rover(x, y, EAST);
        if(cardinal.equals(EAST))
            return new Rover(x, y, NORTH);
        return new Rover(x, y, SOUTH);

    }

    public Rover turnRight() {
        if(cardinal.equals(NORTH))
            return new Rover(x, y, EAST);
        if(cardinal.equals(SOUTH))
            return new Rover(x, y, WEST);
        if(cardinal.equals(EAST))
            return new Rover(x, y, SOUTH);
        return new Rover(x, y, NORTH);

    }

    public Rover move() {
        if(facing(NORTH.name()))
            return moveVertically(UP);
        if(facing(SOUTH.name()))
            return moveVertically(DOWN);
        if(facing(EAST.name()))
            return moveHorizontally(RIGHT);
        return moveHorizontally(LEFT);
    }

    private Rover moveVertically(int i) {
       return new Rover(x, y + i,
                cardinal);
    }

    private Rover moveHorizontally(int i) {
        return new Rover(x + i, y,
                cardinal);
    }

    private boolean facing( String direction) {
        return cardinal.equals(direction);
    }

}
