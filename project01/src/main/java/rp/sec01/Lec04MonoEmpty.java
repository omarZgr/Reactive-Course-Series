package rp.sec01;

import courseUtil.Util;
import reactor.core.publisher.Mono;

public class Lec04MonoEmpty {

    public static void main(String[] args) {

        userRepository(1).subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        )  ;


    }

    public static Mono<String> userRepository(int userID)
    {
        if (userID==1)

            return Mono.just(Util.faker().name().firstName()) ;

        else
            if (userID==2)
                return Mono.empty() ;
            else
                return Mono.error(new RuntimeException("Not in the allowed range")) ;
    }
}
