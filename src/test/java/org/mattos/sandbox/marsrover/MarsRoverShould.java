package org.mattos.sandbox.marsrover;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MarsRoverShould {

    @ParameterizedTest
    @CsvSource({"1, 2, 'N', '1 2 N'"})
    public void returnInitialPosition_whenNoCommandsGiven(int initialX, int initialY, String initialCardinal, String expectedPosition){
        final String emptyCommand = "";
        assertThat(new Plateau(new Rover(initialX, initialY, cardinalFor(initialCardinal))).execute(emptyCommand), is(expectedPosition));
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 'N', 'M', '1 3 N'",
                "1, 2, 'N', 'MMM', '1 5 N'",
                "1, 2, 'S', 'M', '1 1 S'",
                "2, 2, 'W', 'M', '1 2 W'"})
    public void move_whenGivenTheMoveCommand(int initialX, int initialY, String initialCardinal, String commands,  String expectedPosition){

        String actualPosition = new Plateau(new Rover(initialX, initialY, cardinalFor(initialCardinal))).execute(commands);
        assertThat(actualPosition, is(expectedPosition));

    }

    @ParameterizedTest
    @CsvSource({"1, 2, 'N', 'R', '1 2 E'",
                "1, 2, 'S', 'RR', '1 2 N'",
                "1, 1, 'N', 'RRRR', '1 1 N'"})
    public void turnRight_whenGivenTheRightCommand(int initialX, int initialY, String initialCardinal, String commands,  String expectedPosition){

        String actualPosition = new Plateau(new Rover(initialX, initialY, cardinalFor(initialCardinal))).execute(commands);
        assertThat(actualPosition, is(expectedPosition));

    }

    @ParameterizedTest
    @CsvSource({"1, 2, 'E', 'L', '1 2 N'",
                "1, 1, 'S', 'LLLL', '1 1 S'"})
    public void turnLeft_whenGivenLeftCommand(int initialX, int initialY, String initialCardinal, String commands,  String expectedPosition){

        String actualPosition = (new Plateau(new Rover(initialX, initialY, cardinalFor(initialCardinal))).execute(commands));
        assertThat(actualPosition, is(expectedPosition));

    }

    @ParameterizedTest
    @CsvSource({
              "1, 2, N, LMLMLMLMM, '1 3 N'",
            })
    public void move_and_turn(int initialX, int initialY, String initialCardinal,
                                String commands,
                                String expectedCoordinate
                                ) {
          final Rover initialRover = new Rover(initialX, initialY, cardinalFor(initialCardinal));
          final Plateau rover = new Plateau(initialRover);

          String actualCoordinate = rover.execute(commands);
          assertThat(actualCoordinate, is(expectedCoordinate));
        }


    private Cardinal cardinalFor(String cardinal) {
        if (cardinal.equals("N"))
              return new North();
        if (cardinal.equals("E"))
              return new East();
        if (cardinal.equals("S"))
              return new South();
        return new West();
    }

}
