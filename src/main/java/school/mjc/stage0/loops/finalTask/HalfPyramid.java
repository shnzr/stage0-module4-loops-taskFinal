package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int x = 1; x <= cathetusLength; x++) {
            for (int y = 1; y <= cathetusLength ; y++) {
                if (y <= cathetusLength - x)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
