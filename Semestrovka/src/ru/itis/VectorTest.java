package ru.itis;

import org.junit.Test;

public class VectorTest {
    @Test
    public void TestVectorCode() {
        String expected = "(0;1) (2;2)";
        int testArray[] = {1, 0, 2};
        VectorCode vectorCode = new VectorCode(testArray);
    }

    public void testDecoding() {
        int expected[] = {1, 0, 2};

    }

}
