import java.util.concurrent.TimeUnit;

public class Timer {
    public void timer() {
        char[] three_dots = {'.', '.', '.'};
        for(char i: three_dots) {
            try {
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.print(i);
            }
            catch(InterruptedException ie) {
                System.err.format("IOException %s%n", ie);
            }
        }
    }
}

