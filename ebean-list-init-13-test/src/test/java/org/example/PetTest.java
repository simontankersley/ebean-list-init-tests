package org.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.example.model.Pet;
import org.junit.jupiter.api.Test;

public class PetTest {

    @Test
    void testList() {
        assertNotNull(new Pet().getList());
    }

}
