package org.mattos.sandbox.marsrover;

public class East extends Cardinal {

    @Override
    public Cardinal left() {
        return new North();
    }

    @Override
    public Cardinal right() {
        return new South();
    }

    @Override
    public String name() {
        return "E";
    }



}
