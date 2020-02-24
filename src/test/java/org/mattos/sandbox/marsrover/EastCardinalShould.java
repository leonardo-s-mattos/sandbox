package org.mattos.sandbox.marsrover;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class EastCardinalShould {

    @Test
    public void be_facing_south_when_turned_right() {
          final Cardinal actual = new East().right();
          assertThat(actual.name(), is(new South().name()));
    }
    @Test
    public void be_facing_north_when_turned_left() {
          final Cardinal actual = new East().left();
          assertThat(actual.name(), is(new North().name()));
    }
    @Test
    public void give_cardinal_name() {
          final String actual = new East().name();
          assertThat(actual, is("E"));
    }
}
