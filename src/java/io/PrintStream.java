package java.io;

public class PrintStream {
    public void println(String x) {
        write0(x);
    }
    private native void write0(String x);
}
