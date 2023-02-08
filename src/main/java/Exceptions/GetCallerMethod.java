package Exceptions;

import java.util.Arrays;

public class GetCallerMethod {
    public static void main(String[] args) {
        //System.out.println(getCallerClassAndMethodName());
        System.out.println(result1());


    }
    public static String getCallerClassAndMethodName() {
        RuntimeException exception = new GetStackTraceException();
        exception.printStackTrace();
        if (exception.getStackTrace().length < 1){
            return null;
        } else {
            return exception.getStackTrace()[2].getClassName() + "#" + exception.getStackTrace()[2].getMethodName();
        }
    }

    public static String result1(){
        return result2();
    }
    public static String result2(){
        return result3();
    }
    public static String result3(){
        return getCallerClassAndMethodName();
    }
    static class GetStackTraceException extends RuntimeException {
    }
//    public static String printTrace() {
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        StringBuilder sb = new StringBuilder();
//        for (int i = stackTraceElements.length - 1; i >= 0; i--) {
//            if (stackTraceElements.length <= 1){
//                return null;
//            }
//            sb.append(stackTraceElements[i].getMethodName()).append("\n");
//        }
//        return sb.toString();
//    }
public static void method5() {
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element:stackTraceElements) {
        System.out.println(element.getMethodName());
    }

}



}
