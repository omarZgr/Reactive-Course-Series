package rp.sec02;

import courseUtil.Util;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Lec06Switch_Flux_Mono {

    public static void main(String[] args) {

        Mono<String> mono = Mono.just("omar 78") ;

        Flux<String> flux = Flux.from(mono) ;

        flux.subscribe(Util.onNext()) ;

        Flux.just("Salam","cv","bikhir","hamdulh")
                .filter(i->!i.equals("salam"))
                .next()
                .subscribe(Util.onNext()) ;
    }
}
