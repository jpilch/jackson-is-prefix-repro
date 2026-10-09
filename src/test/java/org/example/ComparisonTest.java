package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComparisonTest {

    @Test
    void compareJackson2And3() throws Exception {

        var event = new TestEvent(false, false);

        var jackson2 =
            new com.fasterxml.jackson.databind.ObjectMapper();

        var jackson3 =
            new tools.jackson.databind.ObjectMapper();

        String json2 = jackson2.writeValueAsString(event);
        String json3 = jackson3.writeValueAsString(event);

        System.out.println("Jackson 2 = " + json2);
        System.out.println("Jackson 3 = " + json3);

        Assertions.assertEquals(json2, json3);
    }
}