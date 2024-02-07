package hw_13.task_03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<User> userList = Arrays.asList(
                new User("John", "Smith", 25),
                new User("Alice", "Johnson", 30),
                new User("Michael", "Adams", 20),
                new User("Emma", "Brown", 35),
                new User("James", "Anderson", 18),
                new User("Sophia", "Clark", 22),
                new User("William", "Sanders", 28),
                new User("Olivia", "Allen", 19),
                new User("Ethan", "Stewart", 26),
                new User("Ava", "Baker", 21)
        );

        System.out.println("Список пользователей:");
        userList.forEach(user -> System.out.println(user.getFirstName() + " " + user.getSecondName() + ", возраст: " + user.getAge()));


        List<User> sortedByAge = userList.stream()
                .sorted((u1, u2) -> Integer.compare(u1.getAge(), u2.getAge()))
                .collect(Collectors.toList());
        System.out.println("\nПользователи, отсортированные по возрасту:");
        sortedByAge.forEach(user -> System.out.println(user.getFirstName() + " " + user.getSecondName() + ", возраст: " + user.getAge()));


        double averageAge = userList.stream()
                .mapToDouble(User::getAge)
                .average()
                .orElse(0);
        System.out.println("\nСредний возраст пользователей: " + averageAge);


        List<User> sortedByFirstNameAndAge = userList.stream()
                .sorted((u1, u2) -> {
                    if (u1.getFirstName().equals(u2.getFirstName())) {
                        return Integer.compare(u1.getAge(), u2.getAge());
                    } else {
                        return u1.getFirstName().compareTo(u2.getFirstName());
                    }
                })
                .collect(Collectors.toList());
        System.out.println("\nПользователи, отсортированные по firstName и возрасту:");
        sortedByFirstNameAndAge.forEach(user -> System.out.println(user.getFirstName() + " " + user.getSecondName() + ", возраст: " + user.getAge()));


        boolean hasUserWithSA = userList.stream()
                .anyMatch(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"));
        System.out.println("\nНаличие пользователей с фамилией, начинающейся с 'S' или 'A': " + hasUserWithSA);

        boolean allUsersOlderThan18 = userList.stream()
                .allMatch(user -> user.getAge() > 18);
        System.out.println("\nВсе ли пользователи старше 18 лет? " + allUsersOlderThan18);
    }
}

