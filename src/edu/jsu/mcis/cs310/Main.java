package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        /*String[] messages = {m.getGreeting(), "I'm a little teapot", "Hey Diddle Diddle", "Hickory Dickory Dock"};
        
        for (String message : messages){
        System.out.println(message);
        System.out.println(m.reverse(message));
        }*/
        /* Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));*/
        String[] messages = {
            m.getGreeting(),
            "I'm a Little Teapot",
            "Hey Diddle Diddle",
            "Hickory Dickory Dock"
        };
        
        // Print each string and its reversed version
        for (String message : messages) {
            System.out.println("Original: " + message);
            System.out.println("Reversed: " + m.reverse(message));
            System.out.println(); // Add a blank line for better readability
        }
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        /*StringBuilder sb = new StringBuilder(message);
        sb.reverse();
        return sb.toString();*/
        //return message;
        StringBuilder sb = new StringBuilder(message);
        
        // Reverse the characters using StringBuilder's reverse() method
        sb.reverse();
        
        // Return the reversed string
        return sb.toString();
    }
    
}