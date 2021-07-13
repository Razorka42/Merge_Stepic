import java.util.Arrays;

public class AsciiCharSequence implements java.lang.CharSequence {
    private byte[] ascii;
    public AsciiCharSequence(byte[] ascii) {
        this.ascii = ascii;
    }


    @Override
    public int length() {
        return ascii.length;
    }

    @Override
    public char charAt(int index) {
        return (char) ascii[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte [] subAscii = Arrays.copyOfRange(ascii,start, end);
        return new AsciiCharSequence(subAscii);
    }

    @Override
    public String toString() {
       String str = new String (ascii);
        return str;
    }
}

