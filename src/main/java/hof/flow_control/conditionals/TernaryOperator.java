package main.java.hof.flow_control.conditionals;

public class TernaryOperator {

    public static void main(String[] args) {
        String shouldBePrinted;

//        if(args.length == 0)
//            shouldBePrinted = "No parameters passed";
//        else
//            shouldBePrinted = "Parameters were passed to program";

        shouldBePrinted = (args.length == 0) ? "No parameters passed" : "Parameters were passed to program";


        System.out.println(shouldBePrinted);
    }

}
