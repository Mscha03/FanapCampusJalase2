package org.example;

public class HandsOn2 {
    public static void main(String[] args) {

        String name = "MohammadSaleh";
        int age = 20;

        String nameAge = String.format("%s %d", name, age);

        nameAge = nameAge.toUpperCase();

        String replaceWord = "fanap";

        nameAge = nameAge.replace(name.toUpperCase(),replaceWord);

        // نگهداری یک کلمه و حذف بقیه نوشته ها
        nameAge = nameAge.substring(replaceWord.indexOf(replaceWord.charAt(0)),replaceWord.length());

        System.out.print(nameAge.toLowerCase());
    }
}
