package HelperFunctions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by Yekaterina on 8/11/2016.
 */
public class AnswerChecker {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> answers = new ArrayList<String>();

        File answersFile = new File("Answers");

        Scanner fileScanner = new Scanner(answersFile);

        while (fileScanner.hasNext()) {
            answers.add(fileScanner.next());
        }
        fileScanner.close();

        ListIterator<String> li = answers.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
    }

}
