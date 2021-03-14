package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringManipulationTest {

    //test for each string contains one word only
    @Test
    public void TestForString() {
        StringManipulation TestStringObj = new StringManipulation();
        String str = TestStringObj.interf.modifyString("This","lambda","expression","contains","lot","of","arguments");
        Assertions.assertEquals("THISLAMBDAEXPRESSIONCONTAINSLOTOFARGUMENTS",str);
    }

    //test for strings contains more than one word
    @Test
    public void TestForLongString() {
        StringManipulation TestStringObj = new StringManipulation();
        String str = TestStringObj.interf.modifyString("Hello everyone this","lambda","expression","really contains","lot","of","arguments");
        Assertions.assertEquals("HELLOEVERYONETHISLAMBDAEXPRESSIONREALLYCONTAINSLOTOFARGUMENTS",str);
    }

    //test for if user has passed null value
    @Test
    public void TestForNullValue() {
        StringManipulation TestStringObj = new StringManipulation();
        Assertions.assertThrows(NullPointerException.class,()->TestStringObj.interf.modifyString(null,"lambda","expression",null,"lot","of","arguments"));
    }


}