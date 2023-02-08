
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private byte[] byteArr;

    public AsciiCharSequence(byte[] byteArr) {
        this.byteArr = byteArr;
    }

    @Override
    public int length() {
        return byteArr.length;
    }

    @Override
    public char charAt(int index) {
        return (char) byteArr[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(byteArr, start, end));
    }

    @Override
    public String toString() {
        return new String(byteArr);
    }
}
