public class Asterisk {
    public void printLineSpace(){
        System.out.println("");
    }

    public void printOneAsterisk(){
        printLineSpace();
        System.out.println("Only print one asterisk!");
        System.out.println("*");
    }

    public void printHorizontalAsterisk(int line){
        printLineSpace();
        System.out.println("Print a horizontal asterisks by a certain number!");
        for (int i = 0; i < line; i++) {
            System.out.printf("*");
        }
    }

    public void printVerticalAsterisk(int row){
        printLineSpace();
        System.out.println("Print a vertical asterisk by a certain number!");
        for (int i = 0; i < row; i++) {
            System.out.println("*");
        }
    }

    public void printTriangleByAsterisk(int floor){
        printLineSpace();
        System.out.println("Print a triangle by asterisks!");
        for (int i = 0; i < floor; i++) {

            for (int j = 0; j < i+1; j++) {
                System.out.printf("*");
            }

            System.out.println("");
        }
    }
}
