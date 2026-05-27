//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
// Task_1
    System.out.println("Task_1");
    String firstName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = (lastName + " " + firstName + " " + middleName);
    System.out.println("Ф. И. О. сотрудника — " + fullName);

    // Task_2
    System.out.println("Task_2");
    System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + (fullName.toUpperCase()));

    // Task_3
    System.out.println("Task_3");
    fullName = "Иванов Семён Семёнович";
    fullName = fullName.replace("ё", "е");
    System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
}
