public class DataTypes {

    byte smallNum = 3;      
    short medNum = 100;     
    int num = 1000;         
    double bigNum = 100000; 
    float decimalNum = 33.1f;
    
    // Method to demonstrate operations
    public void demonstrateOperations() {
        // Arithmetic operations
        System.out.println("===== Arithmetic Operations =====");
        System.out.println("Addition: " + (smallNum + medNum));
        System.out.println("Subtraction: " + (bigNum - num));
        System.out.println("Multiplication: " + (smallNum * medNum));
        System.out.println("Division: " + (bigNum / num));
        System.out.println("Modulus: " + (num % smallNum));
        
        // Type promotion in expressions
        System.out.println("\n===== Type Promotion =====");
        System.out.println("byte + short -> int: " + ((Object)(smallNum + medNum)).getClass().getName());
        System.out.println("int + float -> float: " + ((Object)(num + decimalNum)).getClass().getName());
        System.out.println("float + double -> double: " + ((Object)(decimalNum + bigNum)).getClass().getName());
        
        // Explicit casting
        System.out.println("\n===== Explicit Casting =====");
        System.out.println("double to int: " + (int)bigNum);
        System.out.println("float to short: " + (short)decimalNum);
        
        // Increment/decrement
        System.out.println("\n===== Increment/Decrement =====");
        System.out.println("Original smallNum: " + smallNum);
        System.out.println("smallNum++: " + smallNum++);
        System.out.println("smallNum after post-increment: " + smallNum);
        System.out.println("++smallNum: " + ++smallNum);
        
        // Compound assignment
        System.out.println("\n===== Compound Assignment =====");
        System.out.println("Original num: " + num);
        num += smallNum;
        System.out.println("num += smallNum: " + num);
        
        // Overflow example
        System.out.println("\n===== Overflow Example =====");
        byte maxByte = 127;
        System.out.println("maxByte: " + maxByte);
        System.out.println("maxByte + 1 (with casting): " + (byte)(maxByte + 1));
    }
    
    // Main method to run everything
    public static void main(String[] args) {
        DataTypes dt = new DataTypes();
        dt.demonstrateOperations();
    }
}