package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    /* The function BalancedBrackets should return true if and only if
       * the input string has a set of "balanced" brackets.
    * That is, whether it consists entirely of pairs of opening/closing
       * brackets (in that order), none of which mis-nest. We consider a bracket
       * to be square-brackets: [ or ].*/
    @Test
    public void onlyBracketsReturnTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));

       // assertFalse(BalancedBrackets.hasBalancedBrackets("{}")); /* the curly brackets here are just characters so it would be assertTrue */

    }
    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""
        ));
    }

    @Test
    public void testOpenBracketOnly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["
        ));

    }
    @Test
    public void testClosedBracketOnly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"
        ));

    }
    @Test
    public void testMultipleOpenClose() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"
        ));
    }
    @Test
    public void testUnbalancedMultipleOpenClose() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"
        ));
    }

    /*   The string may contain non-bracket characters as well. */
    @Test
    public void testOtherCharactersOnly() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"
        ));
    }
    @Test
    public void testOtherCharactersWithBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"
        ));
    }
    @Test
    public void testUnbalancedWithOtherCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"
        ));
    }
    @Test
    public void testOutOfOrderBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["
        ));
    }
    @Test
    public void testOutOfOrderBracketsWithOtherCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["
        ));
    }

}

/*
 * The function BalancedBrackets should return true if and only if
 * the input string has a set of "balanced" brackets.
 *
 * That is, whether it consists entirely of pairs of opening/closing
 * brackets (in that order), none of which mis-nest. We consider a bracket
 * to be square-brackets: [ or ].
 *
 * The string may contain non-bracket characters as well.
 *
 * These strings have balanced brackets:
 *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
 *
 * While these do not:
 *   "[LaunchCode", "Launch]Code[", "[", "]["
 *
 * @param str - to be validated
 * @return true if balanced, false otherwise
 */
