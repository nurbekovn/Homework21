package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        fileWriter();
        fileReader();
    }

   public static void fileWriter(){
        try (FileWriter writer = new FileWriter("text.txt")){
            writer.write("A\n");
            writer.write("b\n");
            writer.write("c\n");
            writer.write("d\n");
            writer.write("e\n");
            writer.write("f\n");
            writer.write("j\n");
            writer.write("h\n");
            writer.write("i\n");
            writer.write("j\n");
            writer.write("k\n");
            writer.write("l\n");
            writer.write("m\n");
            writer.write("n\n");
            writer.write("o\n");
            writer.write("p\n");
            writer.write("q\n");
            writer.write("r\n");
            writer.write("s\n");
            writer.write("t\n");
            writer.write("u\n");
            writer.write("v\n");
            writer.write("y\n");
            writer.write("w\n");
            writer.write("x\n");
            writer.write("y\n");
            writer.write("z\n");

            System.out.println();

            writer.write("1\n");
            writer.write("2\n");
            writer.write("3\n");
            writer.write("4\n");
            writer.write("5\n");
            writer.write("6\n");
            writer.write("7\n");
            writer.write("8\n");
            writer.write("9\n");


        } catch (IOException e) {
            e.printStackTrace();

        }

   }
   public static void fileReader(){
        try (FileReader reader = new FileReader("text.txt")) {
            Scanner scanner = new Scanner(reader);

            int counter=1;

            while (scanner.hasNextLine()){
                System.out.println(counter+ " "+ scanner.nextLine());
                counter++;
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
   }
}
