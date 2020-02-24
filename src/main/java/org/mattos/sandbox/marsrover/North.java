package org.mattos.sandbox.marsrover;


public class North extends Cardinal {


    @Override
    public Cardinal left() {
        return new West();
    }

    @Override
    public Cardinal right() {
        return new East();
    }

    @Override
    public String name() {
        return "N";
    }

}
