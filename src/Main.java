public class Main {
    public static void main(String[] args) {
// Task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middlName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName +" " + firstName + " " + middlName;
        System.out.println("Ф. И. О.  сотрудника - " +fullName);

// Task 2
        System.out.println("Task 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

 // Task 3
        System.out.println("Task 3");
        firstName = "Семён";
        middlName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstName + " " + middlName;
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);

    }
}