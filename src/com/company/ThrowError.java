package com.company;

public class ThrowError {
    public static void Error() {
        String[] arr = new String[3];
        for (int i = 0; i < 6; i++) {
            arr[i] = arr[i];
        }
    }
}

class Main {
    public static void main(String[] args) {
        try {
            ThrowError.Error();
        } catch (ArrayIndexOutOfBoundsException arr) {
            arr.getMessage();
        } finally {
            System.out.println("Finally block has been run already");
        }
    }
}
