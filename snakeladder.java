package snakeladder;
	
	
	public class SnakeAndLadder {

        public static void main(String[] args) {


                int position1 = 0;

                int position2 = 0;

                   System.out.println("  Welcome to the game ! ");


                                        int dice;
                                        int option;

                                         //no. of time for Rolling of dice
                                        int times = 0;
                                        int roll1 = 0;
                                        int roll2 = 0;


                                                 while (position1 < 100 && position2 < 100) {

                                                 if (roll1 == 0)
                                                       System.out.println(" 1st Player is Playing");
                                               else
                                                       System.out.println(" 2nd Player is playing");



                                            dice = (int)Math.floor( (Math.random() * 10) % 6 + 1);

                                                              System.out.println(" Value of Dice is " + dice);

                                                 option = (int)Math.floor(Math.random() * 3);


                                switch(option) {
                        case 0:
                                System.out.println("No Movement Stay the same");
                                break;
                                 case 1:
                                           System.out.println("ladder Oh yes !");

                                        if (roll1 == 0)
                                        position1 += dice;

                                      else
                                        position2 += dice;

                                      if (position1 > 100) {
                                        position1 -= dice;
                                        System.out.println(" 1st Player counting not more than 100 ");
                                }


                                        if (position2 > 100) {
                                        position2 -= dice;
                                        System.out.println(" 2nd Player counting not more than 100 ");
                                                }
                                         break;

                                                 case 2:
                                                        System.out.println(" Oh no ! snake");

                                                          if (roll1 != 0)
                                                          position1 -= dice;

                                                       else
                                                        position2 -= dice;


                                                       if (position1 < 0) {
                                                          position1 = 0;
                                                      System.out.println(" 1st Player1 back to 0");
                                }

                                                       if (position2 < 0) {
                                                           position2 = 0;
                                                       System.out.println(" 2nd Player back to 0");
                                }

                                                      roll1= (roll1 + 1) % 2;
                                                      break;

                        }

                                         if (roll2 == 0)
                                             System.out.println(" Current position of 1st Player- " + position1 + "\n");
                                          else
                                             System.out.println(" Current position of 2nd Player- " + position2 + "\n");
                                              times++;

                        roll2 = roll1;
                }

                                                       System.out.println(" Congratulation Player" + (roll1 + 1) + "\n");
                                                       System.out.println(" it takes " + times + " roll times to win the game");
  }

}
        
}   

