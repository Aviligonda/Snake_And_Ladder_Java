public class Uc_5 {
    public static final int NO_PLAY = 0;

    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int START = 0;

    public static void main(String[] args) {
        int count=0,count1=0,count2=0;

        int pos = 0;
        System.out.println("Starting position of the player is : " + START);
        while (pos <= 100) {
            int roll = (int) (Math.random() * 6) + 1;
            System.out.println("Number on rolled dice is :" + roll);
            int con = (int) (Math.random() * 3) + 1;
            System.out.println("Condition :" + con);
            switch (con) {
                case NO_PLAY -> {
                    System.out.println("New position is :" + pos);
                     count++;
                    break;
                }
                case LADDER -> {
                    pos = pos + roll;
                    System.out.println("New position is :" + pos);
                    count++;
                    break;
                }
                case SNAKE -> {
                    pos = pos - roll;
                    if (pos >= 0) {
                        System.out.println("New position is :" + pos);
                    } else {
                        pos = 0;
                        System.out.println("New position is :" + pos);
                    }
                    count++;
                    break;
                }
                default -> {
                    System.out.println("Default");
                    break;
                }
            }
            System.out.println();
            if (pos == 100) {
                System.out.println("------------------");
                System.out.println("   PLAYER WON    ");
                break;
            }

        }
        System.out.println("No of time to play to reach the win position ="+count);

    }

}



