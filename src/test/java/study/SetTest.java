package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    private Set number;

    @BeforeEach
    void setUp() {
        number = new HashSet();
        number.add(1);
        number.add(1);
        number.add(2);
        number.add(3);
    }

    @Test
    void size() {
        assertThat(number).hasSize(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(int value) {
        assertThat(number.contains(value)).isTrue();
    }
}
