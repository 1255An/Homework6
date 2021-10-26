package ru.skypro;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //task2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase(Locale.ROOT));

        //task3
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName.replace(" ", "; "));

        //task4
        String fullName1 = "Иванов Семён Семенович";
        if (fullName1.contains("ё")) {
            System.out.println("Данные ФИО сотрудника — " + fullName1.replace('ё', 'е'));
        } else {
            System.out.println("Данные ФИО сотрудника — " + fullName1);
        }

        //task5
        int lastNameIndex = fullName.indexOf(' ');
        int middleNameIndex = fullName.lastIndexOf(' ');
        System.out.println("Имя сотрудника — " + fullName.substring(lastNameIndex + 1, middleNameIndex));
        System.out.println("Фамилия сотрудника — " + fullName.substring(0, lastNameIndex));
        System.out.println("Отчество сотрудника — " + fullName.substring(middleNameIndex));

        //task6
      //  String originalFullName = "ivanov ivan ivanovich";
        // String [] words = originalFullName.split (" ");
      //  char[] arr = words.toCharArray(); ?
       // for (int i =0; i<arr.length; i++) {

        // task7
       // String string1 = "135";
        //String string2 = "246";
      //  StringBuilder result = new StringBuilder();
       // for (int i=0; i< (string1.length() + string2.length()); i++) {


        //task8
       // String string = "abccddefgghiijjkk";
     //   char [] separate = string.toCharArray();
       // boolean repeated = true;
       // for (int i = 0; i < separate.length; i++ ) {
        //    if (separate[i] == separate [i+1]) {
         //       String result = string.replace('i', '');
         //   } else  {
         //       System.out.println(string);
         //   }

         //   }

    }

    }





