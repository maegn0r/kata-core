package IO;

import java.io.*;
// 4.2.6
class SumOfStream {
    public static void main(String[] args) throws IOException {
        byte[] original = {11, -2, -3, 4, 6,14,14,14,14,15,16};
        InputStream inputStream = new ByteArrayInputStream(original);
        int ans = sumOfStream(inputStream);
        System.out.println(ans);
        String s = new String(original);
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int result = 0;
        int numVal;
        while ((numVal = inputStream.read()) != -1) {
            result = (byte) numVal + result;
        }
        return result;
    }
 // 4.2.7
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i;
        while ((i = inputStream.read()) != -1) {
            if (i % 2 == 0) {
                outputStream.write(i);
            }
        }
        outputStream.flush();
    }
}


