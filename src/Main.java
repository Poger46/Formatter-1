

public class Main {
    public static void main(String[] args){
        FormattedInput input = new FormattedInput();
         input.sscanf("%d %s %c %f", "1 qwerty d 1.999999999999999999999");
        FormattedInput input2 = new FormattedInput();
         input2.scanf("%d %s %c %f");

        if(input.equals(input2))
            System.out.println(1);
        else
            System.out.println(0);

    }

}
