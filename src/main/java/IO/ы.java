package IO;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ы {

    public static void main(String[] args) {
        String s = "Ы";
        byte[] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.print(((int) b[i] ^ -1 << 8) + " ");

        }
    }
    private static void logging(){
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.log(Level.INFO,"Все хорошо");
        logger.log(Level.WARNING,"Произошла ошибка");
    }

}