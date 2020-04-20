package org.mattos.sandbox.marsrover;

public abstract class Cardinal {

    public abstract Cardinal left();
    public abstract Cardinal right();
    public abstract String name();

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Cardinal)
            return name().equals(((Cardinal)obj).name());
        return false;
    }

}
