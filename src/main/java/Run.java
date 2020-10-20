import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;



public class Run {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        System.out.print("Enter Something: ");
        String response = input.nextLine();
        System.out.printf("You Entered: %s\n", response);
        if(StringUtils.isNumeric(response)) {
            System.out.printf("%s is a number\n", response);
        }else {
            System.out.printf("%s is not a number\n", response);
        }
        System.out.printf("Flipped Case: %s\n",StringUtils.swapCase(response));
        System.out.printf("Reversed: %s\n", StringUtils.reverse(response));
        }
}
