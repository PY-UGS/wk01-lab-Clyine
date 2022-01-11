import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Lab_1_Jingquan {
    public static void main(String[] args)
        throws IOException {

        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        
        System.out.println("Question 2a Output");
        Example1.main(args);
        System.out.println("\n");

        System.out.println("Question 2b Output");
        System.out.println("Input Module Code");
        String[] input = {reader.readLine()};
        Example3.main(input);
        System.out.println("\n");

        System.out.println("Question 2c Output");
        Example4.main(args);
        System.out.println("\n");
    }
}

class Example1 {
    public static void main(String[] args) {
        System.out.println("Hello, I am Jingquan!");
    }
}

class Example3 {
    public static void main(String[] args) {
        String module = args[0];
        switch (module) {
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;

            case "CSC1007":
                System.out.println("Operating Systems");
                break;

            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;

            case "CSC1009":
                System.out.println("Object-oriented Programming");
                break;

            case "CSC1010":
                System.out.println("Computer Networks");
                break;

            default:
                System.out.println("InvalidCode");
                break;
        }

    }
}

class Example4 {
    public static void main(String[] args) {
        for (int i = 102; i >= 66; i = i - 1) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + "\n");
        }
    }
}