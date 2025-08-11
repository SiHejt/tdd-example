package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        new App().run();

        String input = """
                등록
                너 자신을 알라
                """;
        Scanner sc = new Scanner(input);
        String cmd = sc.nextLine();

        System.out.println("입력한 명령어: " + cmd);
    }
}