package org.mattos.sandbox.marsrover;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WestCardinalShould {

    @Test
    public void be_facing_north_when_turned_right() {
          final Cardinal actual = new West().right();
          assertThat(actual.name(), is(new North().name()));
    }
    @Test
    public void be_facing_south_when_turned_left() {
          final Cardinal actual = new West().left();
          assertThat(actual.name(), is(new South().name()));
    }
    @Test
    public void give_cardinal_name() {
          final String actual = new West().name();
          assertThat(actual, is("W"));
    }
}
