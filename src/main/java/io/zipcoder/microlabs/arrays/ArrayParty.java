package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray){
        String output = "*** Output ***";
        for(String input : inputArray) {
            output += String.format("\n" + input);
        }
        return output;
    }

    public String lastElement(String[] inputArray){
        int length = inputArray.length;
        String output = "*** Output ***";
        output += "\n" + inputArray[length - 1];
        return output;
    }

    //TODO Define the method lastButOne
    public String lastButOne(String[] inputArray) {
        int length = inputArray.length;
        String output = "*** Output ***";
        output += "\n" + inputArray[length - 2];
        return output;
    }

    //TODO Define the method reverse
    public String reverse(String[] inputArray) {
        int length = inputArray.length;
        String output = "*** Output ***";
        for(int i = length - 1; i >= 0; i--) {
            output += String.format("\n" + inputArray[i]);
        }
        return output;
    }

    //TODO Define the method isPalindrome
    public boolean isPalindrome(String[] inputArray) {
        int length = inputArray.length;
        for(int i = 0; i < length/2; i++) {
            if(inputArray[i] != inputArray[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    //TODO Define the method compress
    public String compress(int[] inputArray) {
        int length = inputArray.length;
        String output = "*** Output ***";
        for(int i = 0; i < length; i++) {
            if(i == 0 || inputArray[i] != inputArray[i-1]) {
                output += String.format("\n" + inputArray[i]);
            }
        }
        return output;
    }

    //TODO Define the method pack
    public String pack(char[] inputArray) {
        int length = inputArray.length;
        String output = "*** Output ***\n";
        for(int i = 0; i < length; i++) {
            if(i != 0 && inputArray[i] != inputArray[i-1]) {
                output += ", ";
            }
            output += inputArray[i];
        }
        return output;
    }


}
