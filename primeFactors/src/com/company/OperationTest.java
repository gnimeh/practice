package com.company;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class OperationTest {
    @Test
    public void generate() throws Exception {
        Operation operation = new Operation();
        Integer excepted[] = {3, 5, 7};
        assertArrayEquals(excepted, operation.generate(525).toArray());
    }

}