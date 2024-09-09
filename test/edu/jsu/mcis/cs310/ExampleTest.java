package edu.jsu.mcis.cs310;
import org.junit.*;

import static org.junit.Assert.*;

public class ExampleTest {

    private Main main;
    private StringBuilder sb;
    private String expectedGreeting, expectedReverseGreeting;
    private String expectedReverse1, expectedReverse2, expectedReverse3;
    
    @Before
    public void setUp() {
        main = new Main();
        sb = new StringBuilder();
        
        expectedGreeting = "Hello, World!";
        expectedReverseGreeting = "!dlroW ,olleH";
        expectedReverse1 = "topaeT elttiL a m'I";
        expectedReverse2 = "elddiD elddiD yeH";
        expectedReverse3 = "kcoD yrokciD yrokciH";
    }
        
    @Test
    public void testGreeting() {
        /*String actual = main.getGreeting();
        assertEquals(expectedGreeting, actual);*/
        String actual = main.getGreeting();
        assertEquals(expectedGreeting, actual);

        // Using StringBuilder to build and print the result
        sb.setLength(0); // Clear StringBuilder
        sb.append("Greeting Test:\n");
        sb.append("Expected: ").append(expectedGreeting).append("\n");
        sb.append("Actual: ").append(actual).append("\n");
        System.out.println(sb.toString());
    }
    
    @Test
    public void testReverseGreeting() {
        /*String actual = main.reverse(expectedGreeting);
        assertEquals(expectedReverseGreeting, actual);*/
         String actual = main.reverse(expectedGreeting);
        assertEquals(expectedReverseGreeting, actual);

        // Using StringBuilder to build and print the result
        sb.setLength(0); // Clear StringBuilder
        sb.append("Reverse Greeting Test:\n");
        sb.append("Expected: ").append(expectedReverseGreeting).append("\n");
        sb.append("Actual: ").append(actual).append("\n");
        System.out.println(sb.toString());
    }
    
    @Test
    public void testReverseMessage1() {
        /*String actual = main.reverse("I'm a Little Teapot");
        assertEquals(expectedReverse1, actual);*/
        String message = "I'm a Little Teapot";
        String actual = main.reverse(message);
        assertEquals(expectedReverse1, actual);

        // Using StringBuilder to build and print the result
        sb.setLength(0); // Clear StringBuilder
        sb.append("Reverse Message 1 Test:\n");
        sb.append("Original: ").append(message).append("\n");
        sb.append("Expected: ").append(expectedReverse1).append("\n");
        sb.append("Actual: ").append(actual).append("\n");
        System.out.println(sb.toString());
    }
    
    @Test
    public void testReverseMessage2() {
        /*String actual = main.reverse("Hey Diddle Diddle");
        assertEquals(expectedReverse2, actual);*/
        String message = "Hey Diddle Diddle";
        String actual = main.reverse(message);
        assertEquals(expectedReverse2, actual);

        // Using StringBuilder to build and print the result
        sb.setLength(0); // Clear StringBuilder
        sb.append("Reverse Message 2 Test:\n");
        sb.append("Original: ").append(message).append("\n");
        sb.append("Expected: ").append(expectedReverse2).append("\n");
        sb.append("Actual: ").append(actual).append("\n");
        System.out.println(sb.toString());
    }
    
    @Test
    public void testReverseMessage3() {
        /*String actual = main.reverse("Hickory Dickory Dock");
        assertEquals(expectedReverse3, actual);*/
        String message = "Hickory Dickory Dock";
        String actual = main.reverse(message);
        assertEquals(expectedReverse3, actual);

        // Using StringBuilder to build and print the result
        sb.setLength(0); // Clear StringBuilder
        sb.append("Reverse Message 3 Test:\n");
        sb.append("Original: ").append(message).append("\n");
        sb.append("Expected: ").append(expectedReverse3).append("\n");
        sb.append("Actual: ").append(actual).append("\n");
        System.out.println(sb.toString());
    }
    
}