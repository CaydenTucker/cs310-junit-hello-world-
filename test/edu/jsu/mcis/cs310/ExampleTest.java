package edu.jsu.mcis.cs310;
import org.junit.*;

import static org.junit.Assert.*;

public class ExampleTest {

    private Main main;
    private String expectedGreeting, expectedReverseGreeting;
    private String expectedReverse1, expectedReverse2, expectedReverse3;
    private String expectedReverse4, expectedReverse5;
    
    @Before
    public void setUp() {
        main = new Main();
        
        expectedGreeting = "Hello, World!";
        expectedReverseGreeting = "!dlroW ,olleH";
        expectedReverse1 = "topaeT elttiL a m'I";
        expectedReverse2 = "elddiD elddiD yeH";
        expectedReverse3 = "kcoD yrokciD yrokciH";
        expectedReverse4 = "yaD retteB a eB lliW worromoT";
        expectedReverse5 = "eseehC tnemniatretnE selrahC";
        
    }
        
    @Test
    public void testGreeting() {
        String actual = main.getGreeting();
        assertEquals(expectedGreeting, actual);
        
        StringBuilder sb = new StringBuilder(actual);
        System.out.println(actual);
        System.out.println(sb.reverse().toString());
        System.out.println("\n");
    }
    
    @Test
    public void testReverseGreeting() {
        String actual = main.reverse(expectedGreeting);
        assertEquals(expectedReverseGreeting, actual);
        
       StringBuilder sb = new StringBuilder(expectedGreeting);
       System.out.println(expectedGreeting);
       System.out.println(sb.reverse().toString());
       System.out.println("\n");
    }
    
    @Test
    public void testReverseMessage1() {
        String message = "I'm a Little Teapot";
        String actual = main.reverse(message);
        assertEquals(expectedReverse1, actual);

        StringBuilder sb = new StringBuilder(message);
        System.out.println(message);
        System.out.println(sb.reverse().toString());
        System.out.println("\n");
    }
    
    @Test
    public void testReverseMessage2() {
        String message = "Hey Diddle Diddle";
        String actual = main.reverse(message);
        assertEquals(expectedReverse2, actual);
       
        StringBuilder sb = new StringBuilder(message);
        System.out.println(message);
        System.out.println(sb.reverse().toString());
        System.out.println("\n");
    }
    
    @Test
    public void testReverseMessage3() {
        String message = "Hickory Dickory Dock";
        String actual = main.reverse(message);
        assertEquals(expectedReverse3, actual);
        
        StringBuilder sb = new StringBuilder(message);
        System.out.println(message);
        System.out.println(sb.reverse().toString());
        System.out.println("\n");
    }
    
    @Test
    public void testReverseMessage4(){
        String message = "Tomorrow Will Be a Better Day";
        String actual = main.reverse(message);
        assertEquals(expectedReverse4, actual);
        
        StringBuilder sb = new StringBuilder(message);
        System.out.println(message);
        System.out.println(sb.reverse().toString());
        System.out.println("\n");
    }
    
    @Test
    public void testReverseMessage5(){
        String message = "Charles Entertainment Cheese";
        String actual = main.reverse(message);
        assertEquals(expectedReverse5, actual);
        
        StringBuilder sb = new StringBuilder(message);
        System.out.println(message);
        System.out.println(sb.reverse().toString());
        System.out.println("\n");
    }
}