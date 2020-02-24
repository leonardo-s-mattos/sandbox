package org.mattos.sandbox.marsrover;

public class South extends Cardinal {

    @Override
    public Cardinal left() {
        return new East();
    }

    @Override
    public Cardinal right() {
        return new West();
    }

    @Override
    public String name() {
        return "S";
    }
}
