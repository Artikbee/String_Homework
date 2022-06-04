import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        taskOne(); // 1 задание
        taskTwo(); // 2 задание
        taskThree(); // 3 задание
    }
    public static void taskOne() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName +" "+firstName+" "+middleName;
        System.out.println(fullName);
    }

    public static void taskTwo() {
        String fullName = "Ivanov Ivan Ivanovich";
        String s1 = fullName.toUpperCase();
        System.out.println("Data full name: "+s1);
    }

    public static void taskThree() {
        String fullName = "Иванов Семён Семёнович";
        String s2 = fullName.replace("ё","е");
        System.out.println(s2);
    }
}