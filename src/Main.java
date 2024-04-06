public class Main {
    public static void main(String[] args) {

        //task1

        var firsName = "Ivan";
        var middName = "Ivanovich";
        var lastName = " Ivanov";
        var fullName = firsName + " " + middName + " " + lastName;
        System.out.println(fullName);

        //task2

        System.out.println(fullName.toUpperCase());

        //task3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println(fullName);
    }
}