package rp.sec02.assignment;

import courseUtil.Util;
import reactor.core.publisher.Flux;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class randomNumbers {

    public static void main(String[] args) throws InterruptedException {

        Flux.range(0, 10)
                .map(i -> {
                    try {
                        return generateRandomData();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                })
                .subscribe(data -> System.out.println("This is actual data : " + data));
    }

    private static String generateRandomData() throws InterruptedException {
        Thread.sleep(1000);
        int randomNumber = Util.faker().number().randomDigit();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss.SSS");
        String formattedDate = now.format(formatter);
        return "Date: " + formattedDate + " :: Price: " + randomNumber;
    }
}
