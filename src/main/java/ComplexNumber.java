

import static java.lang.Double.NaN;
public class ComplexNumber {
    public static void main(String[]args){
        ComplexNumber complexNumber = new ComplexNumber(NaN,Double.POSITIVE_INFINITY);
        System.out.println(complexNumber.hashCode());
    }
    private double re;
    private double im;

    public ComplexNumber() {
    }

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
    public int hashCode() {
        int result;

        result = 31 + (im == 0.0 ? 0 : Double.valueOf(im).hashCode());
        result = 31 * result + (re == 0.0 ? 0 : Double.valueOf(re).hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ComplexNumber num = (ComplexNumber) obj;
        return (Double.compare(re, num.re) == 0) && (Double.compare(im, num.im) == 0);
    }
}
