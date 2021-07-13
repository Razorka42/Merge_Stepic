public class Main {
    public static void main (String[] args) {
        ComplexNumber one = new ComplexNumber(-2155893648.15, 4.10);
        ComplexNumber two = new ComplexNumber(-2155893648.15, 4.10);
        String str = null;
        boolean result = one.equals(two);
        System.out.println(result);
        System.out.println(one.hashCode());
       System.out.println(two.hashCode());
            }
}
