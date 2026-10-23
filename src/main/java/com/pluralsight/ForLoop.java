package com.pluralsight;

public class ForLoop {

    public static void main(String[] args) throws InterruptedException {

        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String YELLOW = "\u001B[33m";
        String CYAN = "\u001B[36m";

        // 1) Use a for loop to display a countdown from 10 to 1
        // 2) then end by displaying the word "Launch!"
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            //display launch when we get to 1
            if(i == 1){
                //System.out.println("launch");

                System.out.printf("""
                %s        /\\
                       /  \\
                      /    \\
                     |  ()  |
                     | JAVA |
                     |      |
                    /|      |\\
                   / |      | \\
                  /__|______|__\\%s
                      ) )( (
                    ( ( )( ) )%s
                   ( ( (  ) ) )
                  (  )  ()  (  )%s
                *  .  * ** *  .  *
                *  ~ LAUNCH! ~  *
                *  .  * ** *  .  *%s
                """, CYAN, YELLOW, RED, YELLOW, RESET);
            }
            //slow down the loop
            Thread.sleep(1000);

        }

        //for Shashwut
        System.out.println("the rocket launched");

    }

}
