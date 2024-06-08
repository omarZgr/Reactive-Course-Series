package rp.sec01;

import courseUtil.Util;
import reactor.core.publisher.Mono;

public class Lec03MonoSubscibe {

    public static void main(String[] args) {

<<<<<<< HEAD
        Mono<String> mono = Mono.just("Hello this is our data");
=======
        Mono<String> mono = Mono.just("Hello this is our data.txt erger");
>>>>>>> bb064ab (first)

       /* mono.subscribe(
                item -> System.out.println("Value :: " +item),
                err -> System.out.println("This is error :: "+err),
                () -> System.out.println("Completed")
        ) ;

        */

        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        ) ;

    }
}
