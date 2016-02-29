public class Diamond {
    public void printIsoscelesTriangle(int floor){
        System.out.println("Print a isosceles triangle by a certain number!");
        for (int i = 1; i < floor + 1; i++) {
            for (int j = 0; j < floor - i; j++) {
                System.out.printf(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.printf("*");
            }

            System.out.println("");
        }
    }

    public void printDiamondUsingAsterisk(int number){
        System.out.println("Print a diamind by a certain number!");
        for (int i = 1; i < 2 * number; i++) {

            for (int j = 0; j < Math.abs(number - i); j++) {
                System.out.printf(" ");
            }

            for (int k = 0; k < 2 * (number - Math.abs(number - i)) - 1; k++) {
                System.out.printf("*");
            }

            System.out.println(" ");
        }
    }

    public void printDiamondUsingBill(int number){
        System.out.println("Print a diamind by a certain number instead of the central line by Bill!");
        for (int i = 1; i < 2 * number; i++) {
            if (i == number){
                System.out.println("Bill");
                continue;
            }

            for (int j = 0; j < Math.abs(number - i); j++) {
                System.out.printf(" ");
            }

            for (int k = 0; k < 2 * (number - Math.abs(number - i)) - 1; k++) {
                System.out.printf("*");
            }

            System.out.println("");
        }
    }
}
