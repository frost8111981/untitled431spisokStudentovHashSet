package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Student> students = new HashSet<>();
        while (true) {
            System.out.println("Введите информацию о студенте: Имя, id билета. Для завершения работы программы введите (end)");
            String input = sc.nextLine();
            String[] part = input.split(" ");
            if ("end".equals(input)) {
                break;
            }
            Student student = new Student(part[0], part[1]); // Сначала создаем объект
            if (students.contains(student)) { // Проверяем наличие id объекта в коллекции
                System.out.println("Студент с таким id билета уже существует.");
            }
            students.add(student);
        }
        for (Student student : students) {
            System.out.println(student.getName() + " c id " + student.getId());
        }
    }
}