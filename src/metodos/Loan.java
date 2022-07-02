package metodos;

public class Loan {

    public static double loanCalculator(double value, double percent, int parcel){

        double result;

        result = (percent * value / 100 + value) / parcel;
        return result;
    }

    public static double percentCalc(int parcel){

        double percent;

        if(parcel >= 12)
            return percent = 5f;
        if(parcel >= 6)
            return percent = 10f;

        percent = 15f;

        return percent;
    }
}