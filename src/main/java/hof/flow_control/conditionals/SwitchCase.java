package main.java.hof.flow_control.conditionals;

public class SwitchCase {

    public static void main(String[] args) {
        switch(args.length){
            case 0:
                System.out.println("No parameters passed");
                break;
            case 1:
                System.out.println("You wanted to print this: " + args[0]);
                break;
            case 2:
            case 3:
                System.out.println("You wanted to print this: " + args[0] + " and this: " + args[1]);
                break;
            default:
                System.out.println("You wanted to print this: " + args[0] + " and lots of other stuff");
        }
    }

}
