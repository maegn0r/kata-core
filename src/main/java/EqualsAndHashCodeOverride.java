import java.util.Comparator;

public class EqualsAndHashCodeOverride {
    public static void main(String[] args) {

    }
    public static class ComplexNumber {
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
            return java.util.Objects.hash(re, im);
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
            return re == num.re && im == num.im;
        }
    }
}

