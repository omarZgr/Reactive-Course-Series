package rp.sec05;

import courseUtil.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.stream.Stream;

public class Lec04HotPublisherAutoConnect {

    public static void main(String[] args) throws InterruptedException {

        // share = publish().refCount()

        Flux<String> flux = Flux.fromStream(() -> getDataStream()).delayElements(Duration.ofSeconds(1)).publish().autoConnect(2);

        flux.subscribe(Util.subscriber("user 1 - "));

        Util.sleepSeconds(5);

        flux.subscribe(Util.subscriber("user 2 - "));



        //just for give chance to flux send or emit all data ...
        Util.sleepSeconds(60);


    }




    private static Stream<String> getDataStream()
    {
        System.out.println("Got the movie streaming req");

        return Stream.of(
                "Scene 1",
                "Scene 2",
                "Scene 3",
                "Scene 4",
                "Scene 5",
                "Scene 6",
                "Scene 7"

        ) ;

    }


}
