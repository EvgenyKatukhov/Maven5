package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    void shouldfindaccount() {
        SQRServiceTest service = new SQRServiceTest();
        int expected = 4;
        int actual = service.sqrtCeil(4);
        Assertions.assertEquals(expected, actual);


        System.out.println();
    }

    private int sqrtCeil(int i) {
        return i;
    }
}