import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

    /**
     * This main method reads in a superhero database file and creates objects out of them.
     * It also instantiates our Hashing class and hashes them. The resultant output will print
     * the number of collisions.
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{

        Scanner scanner = new Scanner(new File("superheroes.csv"));
        scanner.useDelimiter(",");

    }

}
