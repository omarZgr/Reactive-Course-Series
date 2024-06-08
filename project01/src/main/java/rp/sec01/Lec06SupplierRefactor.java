package rp.sec01;

import courseUtil.Util;
import reactor.core.publisher.Mono;

public class Lec06SupplierRefactor {

    public static void main(String[] args) {

        getName();
        getName().subscribe(Util.onNext());
        getName();
    }


    public static Mono<String> getName()
    {
        System.out.println("entering getMethod()...");
        return Mono.fromSupplier(() ->
        {
            System.out.println("Generating name...");
            try {
                Util.sleepSeconds(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return Util.faker().name().fullName() ;
        }).map(String::toUpperCase);
    }
}
