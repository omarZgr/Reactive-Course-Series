package rp.sec04;

import courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec02DefaultItEmpty {

    public static void main(String[] args) {

        getOrderNumber().filter(i->i>77)
                .defaultIfEmpty(-1)
                .subscribe(Util.subscriber());

    }

    private static Flux<Integer> getOrderNumber()
    {
        return Flux.range(0,10) ;
    }
}
