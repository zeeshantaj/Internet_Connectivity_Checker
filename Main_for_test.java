package Internet_Check;

public class Main_for_test {
    public static void main(String[] args) {
        NetworkUtils networkUtils = new NetworkUtils();
        if (networkUtils.InternetAvailable()){
            System.out.println("Internet Available");
        }
        else if (!networkUtils.InternetAvailable()){
            System.out.println("Internet not Available");
        }
        else if (networkUtils.InternetTurnedOff()){
            System.out.println("Internet turned on");
        }
        else if (!networkUtils.InternetTurnedOff()){
            System.out.println("Internet is off");
        }
    }
}
