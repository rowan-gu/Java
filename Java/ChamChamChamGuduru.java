import java.util.Scanner;
import java.util.Random;

public class ChamChamChamGuduru{
    //attributes

    public int userPlay, daehyunPlay, seulgiPlay, jeonseolPlay;
    public int userScore, daehyunScore, seulgiScore, jeonseolScore;
    Random rand;
    Scanner scan;

    //-------------------
    // Constructor
    //-------------------

    public ChamChamChamGuduru(){
        rand = new Random();
        scan = new Scanner(System.in);
    }
    //methods

    public void welcomeMessage(){
        System.out.println("Welcome to ChamChamCham!");
        System.out.println("");
        System.out.println("Daehyun: Let's have a fair game!");
        System.out.println("");
        System.out.println("Seulgi: I'll erase you from reality.");
        System.out.println("");
        System.out.println("Jeonseol27: ez money <3");
        System.out.println("");

    }

    public void setCompPlays(){
        daehyunPlay = (rand.nextInt(3) + 1);

        seulgiPlay = (rand.nextInt(3) + 1);

        jeonseolPlay = (rand.nextInt(3) + 1);

        displayPlays();

    }

    public void setUserPlay(){
        System.out.println("Enter which direction you would like to point in.");
        System.out.println("1 = up, 2 = left, 3 = down, 4 = right");
        boolean invalid = true;
        while (invalid){
            userPlay = scan.nextInt();
            if (userPlay==(1)){
                System.out.println("You point up!");
                invalid = false;
            }else if (userPlay==(2)){
                System.out.println("You point left!");
                invalid = false;
            }else if (userPlay==(3)){
                System.out.println("You point down!");
                invalid = false;
            }else if (userPlay==(4)){
                System.out.println("You point right!");
                invalid = false;
            }else{
                System.out.println("Invalid command.");
            }
        }
        System.out.println("");

    }

    public void displayPlays(){
        if (daehyunPlay==(1)){
            System.out.println("Daehyun points up!");
        }else if (daehyunPlay==(2)){
            System.out.println("Daehyun points left!");
        }else if (daehyunPlay==(3)){
            System.out.println("Daehyun points down!");
        }else if (daehyunPlay==(4)){
            System.out.println("Daehyun points right!");
        }

        if (seulgiPlay==(1)){
            System.out.println("Seulgi points up!");
        }else if (seulgiPlay==(2)){
            System.out.println("Seulgi points left!");
        }else if (seulgiPlay==(3)){
            System.out.println("Seulgi points down!");
        }else if (seulgiPlay==(4)){
            System.out.println("Seulgi points right!");
        }

        if (jeonseolPlay==(1)){
            System.out.println("jeonseol27 points up!");
        }else if (jeonseolPlay==(2)){
            System.out.println("jeonseol27 points left!");
        }else if (jeonseolPlay==(3)){
            System.out.println("jeonseol27 points down!");
        }else if (jeonseolPlay==(4)){
            System.out.println("jeonseol27 points right!");
    }
}


    public void displayScores(){
        System..out.println("");
        System.out.println("Your score is "+ userScore);
        System.out.println("Daehyun's score is "+ daehyunScore);
        System.out.println("Seulgi's score is "+ seulgiScore);
        System.out.println("jeonseol27's score is "+ jeonseolScore);
    }

    public void playAgain(){
        System.out.println("Press 1 if you want to play again, or any other key to exit.");
        userPlay = scan.nextInt();
        if (userPlay==(1)){
            oneRound();
        }
        else{
            System.out.println("Goodbye!");
        }
    }

    public void oneRound(){
        int scoreTally;
        for (int i = 1; i < 5; i++){
            scoreTally = 0;
            System.out.println("");
            System.out.println("Start of round " + i + "!");
            if (i==(1)){
                System.out.println("You are the picker!");
            } else if (i==(2)){
                System.out.println("Daehyun is the picker!");
            }
            else if (i==(3)){
                System.out.println("Seulgi is the picker!");
            }
            else if (i==(4)){
                System.out.println("jeonseol27 is the picker!");
            }
            setUserPlay();
            setCompPlays();
            if (i==(1)){
                if (userPlay==(daehyunPlay)){
                    scoreTally += 1;
                }
                if (userPlay==(seulgiPlay)){
                    scoreTally += 1;
                }
                if (userPlay==(jeonseolPlay)){
                    scoreTally += 1;
                }
                System.out.println("You earned "+ scoreTally+ " points!");
                userScore += scoreTally;
            } else if (i==(2)){
                if (daehyunPlay==(userPlay)){
                    scoreTally += 1;
                }
                if (daehyunPlay==(seulgiPlay)){
                    scoreTally += 1;
                }
                if (daehyunPlay==(jeonseolPlay)){
                    scoreTally += 1;
                }
                System.out.println("Daehyun earned " + scoreTally + " points!");
                daehyunScore += scoreTally;
            }
            else if (i==(3)){
                if (seulgiPlay==(userPlay)){
                    scoreTally += 1;
                }
                if (seulgiPlay==(daehyunPlay)){
                    scoreTally += 1;
                }
                if (seulgiPlay==(jeonseolPlay)){
                    scoreTally += 1;
                }
                System.out.println("Seulgi earned "+ scoreTally+ " points!");
                seulgiScore += scoreTally;
            }
            else if (i==(4)){
                if (jeonseolPlay==(userPlay)){
                    scoreTally += 1;
                }
                if (jeonseolPlay==(daehyunPlay)){
                    scoreTally += 1;
                }
                if (jeonseolPlay==(seulgiPlay)){
                    scoreTally += 1;
                }
                System.out.println("jeonseol27 earned "+ scoreTally+ " points!");
                jeonseolScore += scoreTally;

            }
        }
        displayScores();
        if (userScore > daehyunScore && userScore > seulgiScore && userScore > jeonseolScore){
            System.out.println("You win!!");
        }
        else {
            System.out.println("You lost....");
        }
        playAgain();


    }

    public static void main(String[] args) {
        ChamChamChamGuduru game = new ChamChamChamGuduru();
        game.welcomeMessage();
        game.oneRound();
    }







}
