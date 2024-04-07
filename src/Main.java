public class Main {
    public static void main(String[] args) {

        //task1

        var firstName = "Ivan";
        var middlName = "Ivanovich";
        var lastName = "Ivanov";
        var fullName = firstName + " " + middlName + " " + lastName;
        System.out.println(fullName);

        //task2

        System.out.println(" Ф. И. О. сотрудника " + fullName.toUpperCase());

        //task3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println(fullName);
    }
}