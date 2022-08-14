package OOPs;

class Bank
{
    double rateOfiInterest()
    {
        return 0;
    }
}

class SBI extends Bank
{
    double rateOfiInterest()
    {
        return 10.5;
    }
}

class ICICI extends Bank
{
    double rateOfiInterest()
    {
        return 9.7;
    }
}

class AXIS extends Bank
{
    double rateOfiInterest()
    {
        return 8.5;
    }
}

public class MethodOveridingDemo {

    public static void main(String[] args) {

        SBI sbi = new SBI();
        System.out.println(sbi.rateOfiInterest());

        ICICI icici = new ICICI();
        System.out.println(icici.rateOfiInterest());

        AXIS axis = new AXIS();
        System.out.println(axis.rateOfiInterest());

    }
}
