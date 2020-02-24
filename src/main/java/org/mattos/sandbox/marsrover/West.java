package org.mattos.sandbox.marsrover;

public class West extends Cardinal {

    @Override
    public Cardinal left() {
        return new South();
    }

    @Override
    public Cardinal right() {
        return new North();
    }

    @Override
    public String name() {
        return "W";
    }
}
