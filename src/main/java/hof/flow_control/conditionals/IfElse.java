package main.java.hof.flow_control.conditionals;

public class IfElse {

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Parameters were not passed to method");
        } else if(args.length == 1) {
            System.out.println("You wanted to print this: " + args[0]);
        } else {
            System.out.println("You wanted to print this: " + args[0] + " and lots of other stuff");
        }

    }

}
