package IO;

import java.io.*;

public class notOddNumbers {
    public static void main(String[] args) throws IOException {
        byte[] original = {1, -2, 0, 4, 6,14,14,14,14,15,16};
        InputStream inputStream = new ByteArrayInputStream(original);
        OutputStream outputStream = new ByteArrayOutputStream();
//        int ans = sumOfStream(inputStream);
        print(inputStream,outputStream);
    }
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i = 0;
        while (inputStream.available() > 0) {
            i = inputStream.read();
            if (i % 2 == 0){
                outputStream.write(i);
            }
        }
        outputStream.flush();
    }
}
