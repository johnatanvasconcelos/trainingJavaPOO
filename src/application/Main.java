package application;

import entities.Person;
import entities.PersonFinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many persons will you insert? ");
        int n = sc.nextInt();
        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Insert the person number #" + (i+1));
            sc.nextLine();
            System.out.println("Person name: ");
            String name = sc.nextLine();
            System.out.println("Person age: ");
            int age = sc.nextInt();
            System.out.println("Person height: ");
            double height = sc.nextDouble();
            people[i] = new Person(name, age, height);
        }

        PersonFinder personFinder = new PersonFinder();

        Person tallestPerson = personFinder.findTallestPerson(people);

        System.out.println("The tallest person is: " + tallestPerson.getName() + ", with "
                + tallestPerson.getHeight() + " cm.");

        Person oldestPerson = personFinder.findOldestPerson(people);

        System.out.println("The oldest person is: " + oldestPerson.getName() + ", with "
                + oldestPerson.getAge() + " years old.");

    sc.close();
    }
}