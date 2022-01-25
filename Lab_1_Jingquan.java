import java.util.Scanner;

class Lab_1_Jingquan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Question 2a Output");
        System.out.println("Hello, I am Jingquan!");   
        System.out.println("\n");

        System.out.println("Question 2b Output");
        System.out.println("Input Module Code");
        String[] userinput = {input.nextLine()};
        classify(userinput[0]);
        System.out.println("\n");

        System.out.println("Question 2c Output");
        for (int i = 102; i >= 66; i = i - 1) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + "\n");
        }
        System.out.println("\n");
        input.close();
    }

    public static void classify(String module) {
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
