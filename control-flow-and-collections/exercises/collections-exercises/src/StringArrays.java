import java.util.Arrays;

public class StringArrays {
    public static void main(String[] args) {
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = greenEggs.split(" ");
        System.out.println(Arrays.toString(words));

    }
}

