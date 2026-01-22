import java.util.*;

public class Decision {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("WARNING: AlL QUESTIONS REQUIRE ONE TANGIBLE ANSWER MAXIMUM");
        System.out.println();

        System.out.println("Whats the main thing to work on right now");
        String MainTask = input.nextLine();

        System.out.println("Main thing you do for fun?");
        String MainHobby = input.nextLine();

        System.out.println("Secondary thing you do when you aren't at your main chill spot");
        String SecondaryHobby = input.nextLine();

        System.out.println("Whatchu do when out of energy? (Can be sleep or something else)");
        String SleepyNightNight = input.nextLine();


        System.out.println("Are you tired and have the option for resting up? (y or n)");
        String Energy = input.nextLine();

        if (Energy.equals("n")){
            System.out.println("In the Mood for some work? (y or n)");
            String Worktime = input.nextLine();

            if (Worktime.equals("y")){
                System.out.println("Do your Task: "+MainTask);
            }
            else{
                System.out.println("Do you have Access to your Main chill Space? (y or n)");
                String MainChillAccess = input.nextLine();

                if(MainChillAccess.equals("y")){
                    System.out.println(MainHobby+ " time!");
                }
                else{
                    System.out.println(SecondaryHobby+ " time!");
                }

            }
        }
        else{
            System.out.println( SleepyNightNight + " time!");
        }

    }
}
