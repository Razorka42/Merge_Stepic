public class TestAscii {
    public static void main(String[] args) {
byte [] ascii = {37, 40, 41, 16, 19, 27};
        AsciiCharSequence das = new AsciiCharSequence(ascii);
        System.out.println(das.length());
        System.out.println(das.charAt(2));
        System.out.println(das.subSequence(2, 5));
        System.out.println(das.toString());
    }
}
