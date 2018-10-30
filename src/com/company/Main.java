package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	Scanner kbInput = new Scanner(System.in);

        String[] names = {"John", "Todd", "Hawthorne", "Gene", "Jakey", "Shnoober", "IDriveAMovieTheater", "Daniel", "Yeet",
                        "Jeff", "Luca", "Dave", "John", "Bikey", "Sam", "Boy", "Jim", "Neutron", "Baddie", "Trump", "Holo", "Jeffei", "Rob", "JDK", "Homunculus",
                        "Ryan", "Winston", "JEEEE", "Wiz Khalifa", "COD", "Dupey", "Cinderella", "Jim", "Penne", "Backer", "Geoff", "Vondy", "BLundell",
                          "Tik Tok", "VJ", "Sammy", "Bois", "MrTLexify", "Etika", "Michael", "YEE", "Oof", "Roblox", "RedDead", "Brian"};
	        int i = 1;
	        for (String indice : names)
            {
                System.out.println(i + ")" + names[i-1]);
                i++;
            }

        System.out.println("Guess who's name is in the middle!, Pick a name");
	        Arrays.sort(names);

	        while(true) {
	            String input = kbInput.next();
	            if (input.equals(names[24])) {
                    System.out.println("Yes!!!");
                    break;
                }

	        else {

	                boolean onList = false;
	                for (String indice : names) {
	                    if (Arrays.asList(names).indexOf(input) > 24){
                            System.out.println("The name is closer to A!!");
                            System.out.println("Please try again");
                            onList = true;
                        }
                    else {
                            System.out.println("The name is closer to Z");
                            System.out.println("Try again!");
                            onList = true;
                        }

	                }


                }





	        }





	        
    }
}
