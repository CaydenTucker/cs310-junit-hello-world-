package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        char[] charArray = message.toCharArray();
        
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            left++;
            right--;
        }
        return new String(charArray);
    }
    
}