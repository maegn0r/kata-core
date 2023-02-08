import java.math.BigInteger;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quiz {

    static int[] arrayWithOddNumbers = {1, 2, 3, 4, 110, 1119};
    static int[] array2 = {4, 6, 8, 10};

    static String[] roles = new String[]{
            "Городничий",
            "Аммос Федорович",
            "Артемий Филиппович",
            "Лука",
            "Без реплики",
            "Лука Лукич"

    };

    static String[] textLines = new String[]{
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
            "Лука: Господи боже! Я уронил своё пасхальное яйцо от неожиданности!"
    };

    public static void main(String[] args) throws Exception {
        System.out.println(findNumValues("tutABC_abc4aBc1ut2ut102sds", "aBC"));
        System.out.println(checkI(true, true));
        System.out.println(checkI(true, false));
        System.out.println(checkI(false, true));
        System.out.println(checkI(false, false));
        System.out.println(checkII(true, true));
        System.out.println(checkII(true, false));
        System.out.println(checkII(false, true));
        System.out.println(checkII(false, false));
        System.out.println(incTest(5, 5));
        System.out.println(doubleExpression(9.5, 9.2, 18.7));
        System.out.println(drawisMonitorsCounter(199, 20));
        System.out.println(charExpression(64));
        System.out.println(isPowerOfTwo(1));
        System.out.println('A' + "12");
        System.out.println(isPalindrome("Eva, Can I Stab Bats In A Cave?"));
//        System.out.println(factorial(50));
//        System.out.println(factorial(1));
        System.out.println(determineGroup(66));
        printOddNumbers(arrayWithOddNumbers);
        System.out.println(Arrays.toString(mergeArrays(arrayWithOddNumbers, array2)));
        System.out.println(printTextPerRole(roles, textLines));
        calcCircleRadius(3.0);
        maxLongSqr();
    }


    public static int findNumValues(String text, String findText) {
        int count = 0;
        Pattern pattern = Pattern.compile(findText.toLowerCase());
        Matcher matcher = pattern.matcher(text.toLowerCase());
        while (matcher.find()) count++;
        return count;
    }

    public static boolean checkI(boolean a, boolean b) {
        return (a | b);
    }

    public static boolean checkII(boolean a, boolean b) {
        return (a != b);
    }

    public static int incTest(int a, int b) {
        return ++a + b++;
    }

    public double priceCalculation(double price, int count) {
        return price * count;
    }

    public static boolean doubleExpression(double a, double b, double c) {
        double epsilon = 0.0001d;
        return Math.abs((a + b) - c) < epsilon;
    }

    public static int drawisMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }

    public static boolean isPalindrome(String text) {
        String maybePalindrome = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder(maybePalindrome);
        return maybePalindrome.equalsIgnoreCase(sb.reverse().toString());
    }


    public static BigInteger recFactorial(int value) {
        return (value <= 1) ? BigInteger.ONE : recFactorial(value--).multiply(BigInteger.valueOf(value));
    }

    public static BigInteger recFactorialForValidator(int value) {
        if (value == 0 || value == 1) {
            return BigInteger.ONE;
        }
        return recFactorialForValidator(value - 1).multiply(BigInteger.valueOf(value));
    }

    public static int determineGroup(int age) {
        int result = 0;
        if (age > 6 && age < 14) {
            result = 1;
        } else if (age > 13 && age < 18) {
            result = 2;
        } else if (age >= 18 && age <= 65) {
            result = 3;
        } else result = -1;
        return result;
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder sb = new StringBuilder();
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    sb.append(arr[i] + ",");
                }
            }
        }
        if (sb.length() != 0) {
            System.out.println(sb.deleteCharAt(sb.length() - 1));
        }
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i1 >= a1.length && i2 >= a2.length) {
                break;
            }
            if (i2 >= a2.length) {
                result[i] = a1[i1];
                i1++;
                continue;
            }
            if (i1 >= a1.length) {
                result[i] = a2[i2];
                i2++;
                continue;
            }
            if (a1[i1] < a2[i2]) {
                result[i] = a1[i1];
                i1++;
            } else if (a1[i1] >= a2[i2]) {
                result[i] = a2[i2];
                i2++;
            }
        }
        return result;
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder[] sbRoles = new StringBuilder[roles.length];
        for (int i = 0; i < roles.length; i++) {
            sbRoles[i] = new StringBuilder(roles[i] + ":");
            String sbRole = sbRoles[i].toString();
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(sbRole)) {
                    String replacedRoleFromTextString = textLines[j].replaceAll(sbRole, String.valueOf(j + 1) + "\\)");
                    sbRoles[i].append("\n").append(replacedRoleFromTextString);
                }
            }
        }
        for (int i = 1; i < sbRoles.length; i++) {
            sbRoles[0].append("\n").append("\n").append(sbRoles[i]);
        }
        return sbRoles[0].toString();
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) (age1 > age2 ? age1 - age2 : age2 - age1);
    }

    public static void calcCircleRadius(double area) {
        System.out.printf("%.3f%n", Math.sqrt(area / Math.PI));
    }

    public static void maxLongSqr() {
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println(maxLong.multiply(maxLong));
    }
}