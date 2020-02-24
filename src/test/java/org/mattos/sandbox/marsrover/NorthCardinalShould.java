package org.mattos.sandbox.marsrover;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NorthCardinalShould {

    @Test
    public void be_facing_east_when_turned_right() {
          final Cardinal actual = new North().right();
          assertThat(actual.name(), is(new East().name()));
    }
    @Test
    public void be_facing_west_when_turned_left() {
          final Cardinal actual = new North().left();
          assertThat(actual.name(), is(new West().name()));
    }
    @Test
    public void give_cardinal_name() {
          final String actual = new North().name();
          assertThat(actual, is("N"));
    }
}
