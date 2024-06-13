import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GoodMorning {
    public static void main(String[] args) {

        LocalTime actualTime = getCurrentTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String name = getComputerName();

        if (actualTime.isBefore(LocalTime.NOON)) {
            System.out.println("Hello " + name + ", Good Morning!, it's " + actualTime.format(formatter));
        } else if (actualTime.isAfter(LocalTime.NOON)) {
            System.out.println("Hello " + name + ", Good Afternoon! , it's " + actualTime.format(formatter));
        } else {
            System.out.println("Hello " + name + ", Good Night! , it's " + actualTime.format(formatter));
        }
    }

    public static LocalTime getCurrentTime() {
        return LocalTime.now();
    }

    public static String getComputerName() {
        String computerName = System.getenv("COMPUTERNAME");
        if (computerName == null) {
            try {
                ProcessBuilder processBuilder = new ProcessBuilder();
                processBuilder.command("hostname");
                Process process = processBuilder.start();
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                computerName = reader.readLine().trim();
            } catch (IOException e) {
                computerName = "Unknown Computer";
            }
        }

        return computerName;
    }
}