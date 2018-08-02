package main.java.hof.flow_control.loops;

public class PreconditionLoop {

    public static void main(String[] args) {
        int i = 0;
        while(i < args.length){
            System.out.println(args[i++]);
//            i = i + 1;
        }
    }

}
