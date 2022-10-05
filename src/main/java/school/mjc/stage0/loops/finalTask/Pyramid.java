package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int numb;
        for (int x = 1; x <= cathetusLength; x++) {
            numb = cathetusLength + 1;
            for (int y = 1; y <= 2 * cathetusLength - 1 ; y++) {
                if (numb > 1 && y<=cathetusLength)
                    --numb;
                else {
                    ++numb;
                    if (numb > x)
                        break;
                } // break inside else
                if (y <= cathetusLength - x)
                    System.out.print(" ");
                else
                    System.out.print(numb);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
