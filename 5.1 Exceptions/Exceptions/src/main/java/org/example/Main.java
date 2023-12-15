package org.example;

import org.example.impl.Ilya;
import org.example.impl.YandexWork;
import org.example.model.Money;

import java.io.*;

public class Main {
    // Проверяемые Exception
    // Не проверяемые RuntimeException
    public static void main(String[] args) {
        Work work = new YandexWork();
        Person person = new Ilya();
        Money money = work.doWork(person);
        System.out.println("Заработано " + money.getAmount() + " " + money.getCurrency());

        File file = new File("input.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
            return;
        } finally {
            System.out.println("Конец");
        }
    }
}