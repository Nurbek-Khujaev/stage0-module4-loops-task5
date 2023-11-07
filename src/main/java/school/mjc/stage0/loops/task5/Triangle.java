package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {

        for (int i = 0; i < cathetusLength; i++) {
            int counter = 0;
            for (int j = 0; j < cathetusLength; j++) {

                if (i >= counter) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }

                counter++;


            }

            System.out.print("\n");

        }
    }
}
