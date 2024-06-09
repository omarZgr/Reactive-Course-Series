package rp.sec02;

import courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec03Range {

    public static void main(String[] args) {

        Flux.range(2,23)
                .subscribe(i-> System.out.println("data : "+i)) ;

        System.out.println("--------");

        Flux.range(1,4)
                .map(i-> Util.faker().name().fullName())
                .subscribe(
                        Util.onNext()
                );
    }
}
