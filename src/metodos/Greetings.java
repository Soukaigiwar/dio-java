package metodos;

public class Greetings {

    public static String getGreetings(int hour){

        String greeting;

        if(hour >= 1 && hour <= 11)
            greeting = "bom dia!!!";
        else if (hour >= 12 && hour <= 17)
            greeting = "boa tarde!!!";
        else if (hour >= 18 && hour <= 24)
            greeting = "boa noite!!!";
        else
            greeting = "Hora inválida!!";

        return (greeting);
    }
}
