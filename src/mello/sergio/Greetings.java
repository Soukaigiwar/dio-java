package mello.sergio;

public class Greetings {

    public static String getGreetings(int hour){

        String greeting;

        if(hour > 6 && hour < 12)
            greeting = "bom dia!!!";
        else if (hour > 11 && hour < 18)
            greeting = "boa tarde!!!";
        else
            greeting = "boa noite!!!";

        return (greeting);
    }
}
