package org.mattos.sandbox.util;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerMatrixConverter extends SimpleArgumentConverter  {

    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        if (source instanceof String && List.class.isAssignableFrom(targetType)) {
            List<List<Integer>> result = new ArrayList<>();

            String[] lines = ((String) source).split("\\s*;\\s*");
            for (String line:lines)
                result.add(Stream.of(line.split("\\s*,\\s*"))
                        .map(x -> Integer.valueOf(x)).collect(Collectors.toList()));


            return result;

        } else
            throw new IllegalArgumentException("Conversion from " + source.getClass() + " to "
                    + targetType + " not supported.");
    }

}