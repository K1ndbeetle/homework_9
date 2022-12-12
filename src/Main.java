public class Main {
    public static void main(String[] args) {
        //task №1
        System.out.println("Задача №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println(" ");

        //task №2
        System.out.println("Задача №2");
        String NameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + NameUpper);
        System.out.println();
    }
}