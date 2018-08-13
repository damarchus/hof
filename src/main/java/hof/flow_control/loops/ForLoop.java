package main.java.hof.flow_control.loops;

public class ForLoop {

    public static void main(String[] args) {
        for(int i = 0; i<args.length; i++){
            System.out.println(args[i]);
            System.out.println("No bla should be printed here");
            System.out.println("bla-bla-bla");
        }
    }

}
