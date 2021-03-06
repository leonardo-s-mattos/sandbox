package org.mattos.sandbox.problemsolving;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.mattos.sandbox.util.IntegerCollectionsConverter;

import java.util.List;


public class CollisionDetectionShould {

    CollisionDetection target = new CollisionDetection();

    @ParameterizedTest
    @CsvSource({"'5,8,7,3,1', 0, 2"})
    public void detect_numberOfPossibleCollisions_forSlowerCarsInFrontOfMe(@ConvertWith(IntegerCollectionsConverter.class) List<Integer> speeds, Integer myPosition, Integer expectedCollisions){

        Integer actualCollisions = target.detect(speeds, myPosition);
        assertThat(actualCollisions, is(expectedCollisions));

    }

    @ParameterizedTest
    @CsvSource({"'1,2,10,5', 3, 1"})
    public void detect_numberOfPossibleCollisions_forFasterCarsBehindMe(@ConvertWith(IntegerCollectionsConverter.class) List<Integer> speeds, Integer myPosition, Integer expectedCollisions){
        Integer actualCollisions = target.detect(speeds, myPosition);
        assertThat(actualCollisions, is(expectedCollisions));

    }
}
