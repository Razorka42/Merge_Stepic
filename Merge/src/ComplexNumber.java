public final class ComplexNumber {
    private final double re;
    private final double im;


    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object anObject) {
        boolean result = false;
        if (this == anObject) {
            result = true;
        }

        if (anObject instanceof ComplexNumber) {
            ComplexNumber other = (ComplexNumber) anObject;
            result = re == other.re && im == other.im;
        }

        return result;
    }

    @Override

    public int hashCode() {
        int result = 0;
        long rasniza = Long.MAX_VALUE - Integer.MIN_VALUE;

        long re1 = Double.doubleToRawLongBits(re);
        long im1 = Double.doubleToRawLongBits(im);
        long summa = re1 + im1;
        if (summa < 0) {
            if (summa >= Integer.MIN_VALUE) {
                result = (int) summa;
            } else {
                result = (int) (summa + rasniza);
            }
        }
        if (summa >= 0) {
            if (summa < Integer.MAX_VALUE) {
                result = (int) summa;
            } else {
                result = (int) (summa - rasniza);
            }


        }
        return result;
    }
}