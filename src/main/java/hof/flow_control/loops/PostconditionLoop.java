package main.java.hof.flow_control.loops;

public class PostconditionLoop {

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(args[i++]);
        } while(i < args.length);
    }

}
