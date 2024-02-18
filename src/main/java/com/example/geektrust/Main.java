package com.example.geektrust;

import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(@NotNull String[] args) {

        Date startDate = new Date();
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            while (sc.hasNextLine()) {
               String str  = sc.next();
               String startDateStr = sc.next();
               String subcriptionType =sc.next();
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
        }

    }
}
