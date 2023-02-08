package IO;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadAsString {
    public static void main(String[] args) throws IOException {
        byte[] bb = new byte[]{48, 49, 50, 51};
        ByteArrayInputStream bis = new ByteArrayInputStream(bb);
        System.out.println(readAsString(bis, Charset.forName("ASCII")));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(inputStream, charset);
        for (int numRead; (numRead = in.read()) != -1; ) {
            out.append((char)numRead);
        }
        return out.toString();
    }

    public static String readAsString2(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder sb = new StringBuilder();
        int numsRead;
        Reader in = new InputStreamReader(inputStream,charset);
        char[] buffer = new char[1024];
        while (in.read(buffer,0,buffer.length) != -1) {
            sb.append(buffer,0,buffer.length);
        }
        inputStream.close();
        return sb.toString();
    }
    //1
//        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, charset));
//        StringBuilder sb = new StringBuilder();
//        while (inputStream.available() > 0) {
//            sb.append(br.readLine());
//        }
//        return sb.toString();
    //2
//        StringBuilder sb = new StringBuilder();
//        int byteValue;
//        while ((byteValue = inputStream.read()) != -1) {
//            sb.appendCodePoint((char)byteValue);
//        }
//        inputStream.close();
    //3
//        Scanner s = new Scanner(inputStream).useDelimiter("\\A");
//        String result = s.hasNext() ? s.next() : "";
}
