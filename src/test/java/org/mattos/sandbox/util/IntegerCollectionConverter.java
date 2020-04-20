package org.mattos.sandbox.util;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerCollectionConverter extends SimpleArgumentConverter  {

    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        if (source instanceof String && List.class.isAssignableFrom(targetType)) {
            return Stream.of(((String) source).split("\\s*,\\s*"))
                    .map(x -> Integer.valueOf(x)).collect(Collectors.toList());
        } else {
            throw new IllegalArgumentException("Conversion from " + source.getClass() + " to "
                    + targetType + " not supported.");
        }
    }

}