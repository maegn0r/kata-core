package Tasks1;

public class Student {

    protected final String studying;
    protected Student(String work) {
        this.studying = work;
    }
    public Student() {
        this.studying = "Прохожу тестовое задание.";
    }
    public void study() {
        System.out.println("Я очень занят. " + studying);
    }
}
    class JavaStudent extends Student {
        public static void main(String[] args) {
            JavaStudent s = new JavaStudent();
            s.study();
        }
        JavaStudent(){
            super("Прохожу курс по Java.");
        }
    }
