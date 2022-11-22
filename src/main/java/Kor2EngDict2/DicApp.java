package Kor2EngDict2;

import Kor2EngDict.Dict;

import java.util.Scanner;

public class DicApp {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        Dict dict = new Dict();

        while(true) {
            System.out.print("한글 단어?");
            String inputWord = scanner.next();
            System.out.println(dict.kor2Eng(inputWord));
        }
    }
}
