import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Write a java program to count the total number of occurrences of a given character in a string without using any loop?
 * For Example- Java is java again java again count number of occurrence of a in the given string
 */

public class CharacterOccurenceTest {


    @Test
        public void testNumberOfCharacters() throws Exception {
        //Arranga

        CharacterOccurence obj = new CharacterOccurence();
        //Act

        //Assert
        assertEquals(8, obj.countCharacters("Java is java again java again",'j'));
    }

}