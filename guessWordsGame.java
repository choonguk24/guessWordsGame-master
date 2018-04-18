package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ttc on 18-1-16.
 */
public class guessWordsGame {
        static boolean isContain(char[] ch, char ch1) {
            boolean info = false;
            for (int i = 0; i < ch.length; i++) {
                if (ch1 == ch[i]) {
                    info = true;
                }
            }
            return info;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] words = {"dog", "cat", "apple", "unique", "sound", "love", "people", "good", "like"};
            Random random = new Random();
            int Index = random.nextInt(words.length);
            String choose = words[Index];
            char[] wordss = new char[choose.length()];
            for (int i = 0; i < wordss.length; i++) {
                wordss[i]='-';
                System.out.print("-");
            }
            int guessTime = 5;
            while (guessTime > 0 && isContain(wordss, '-')) {
                boolean info = false;
                char ch = sc.next().charAt(0);
                for (int i = 0; i < wordss.length; i++) {
                    if (choose.charAt(i)== ch) {
                        info = true;
                        wordss[i]=ch;
                        System.out.println(wordss);
                    }
                }
                if (!info) {
                    guessTime--;
                    int k=guessTime;
                    System.out.println("你还有" + k+ "次机会");
                    System.out.println(wordss);
                }
            }
            if (guessTime >0) {
                System.out.println("you are winner");
            } else {
                System.out.println("you are loser");
                System.out.println("该单词是"+choose);
            }
        }
    }

