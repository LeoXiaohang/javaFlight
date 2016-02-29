import java.util.ArrayList;

public class Main {
    public void FizzBuzz(){
        System.out.println("A number game named FizzBuzz");

        for (int i = 1; i < 101; i++) {
            if ((i%3 == 0) && (i%5 != 0)){
                System.out.println("Fizz");
            }
            else if ((i%3 != 0) && (i%5 == 0)){
                System.out.println("Buzz");
            }
            else if ((i%3 == 0) & (i%5 ==0)){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }

        }
    }

    public void generate(int number){
        System.out.println("Print a list of factors for a certain number!");

        ArrayList<Integer> list = new ArrayList();
        for (int i = 2; i < Math.sqrt(number) + 1; i++) {
            if ((number%i == 0) && isFactors(i)){
                list.add(i);
            }
        }

        printAllNumbers(list);
    }

    private boolean isFactors(int number){
        for (int i = 3; i < Math.sqrt(number) + 1; i++) {
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }

    private void printAllNumbers(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (i == 0){
                System.out.printf("" + list.get(i));
            }
            else {
                System.out.printf("," + list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Main.main");

        Asterisk asterisk = new Asterisk();
        asterisk.printOneAsterisk();
        asterisk.printHorizontalAsterisk(3);
        asterisk.printVerticalAsterisk(3);
        asterisk.printTriangleByAsterisk(3);

        Diamond diamond = new Diamond();
        diamond.printIsoscelesTriangle(3);
        diamond.printDiamondUsingAsterisk(3);
        diamond.printDiamondUsingBill(3);

        Main main = new Main();
        main.FizzBuzz();
        main.generate(30);

    }
}
