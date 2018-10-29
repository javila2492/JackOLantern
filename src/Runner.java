import java.util.Scanner;

public abstract class Runner
{
    public static void main(String[] args)
    {
        String statement = "";
        Scanner in = new Scanner(System.in);
        String[][] features = {
                {" ", "O", "O", "O", "O", "O", "O", " "},
                {"O", "O", "O", "O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O", "O", "O", "O"},
                {" ", "O", "O", "O", "O", "O", "O", ""}
        };
        JackOLantern Jacko = new JackOLantern(features);
        Jacko.toString();
        System.out.println("\n");
        Jacko.edit("U", 1, 2);
        Jacko.edit("U", 1, 5);
        Jacko.edit("V", 3, 3);
        Jacko.edit("V", 3, 4);
        Jacko.toString();
        System.out.println("\n");
        Jacko.fill("-");
        Jacko.toString();
    }
}

