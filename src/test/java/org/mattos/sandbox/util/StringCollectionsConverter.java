package org.mattos.sandbox.util;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCollectionsConverter extends SimpleArgumentConverter  {

    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        if (source instanceof String) {
            if (List.class.isAssignableFrom(targetType))
                return Arrays.stream(((String) source).split("\\s*,\\s*")).collect(Collectors.toList());

            if (String[].class.isAssignableFrom(targetType))
                return Arrays.stream(((String) source).split("\\s*,\\s*")).toArray();

        }

        throw new IllegalArgumentException("Conversion from " + source.getClass() + " to "
                + targetType + " not supported.");

    }

}