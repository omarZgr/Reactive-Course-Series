package rp.sec03;

import courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec02FlexCreate_Try {

    public static void main(String[] args) {

        int count=0;

        Flux.create(fluxSink ->
                {
                    String country ;
                    do {
                         country = Util.faker().country().name() ;
                        fluxSink.next(country) ;
                        System.out.println("Emitting : " +country);
                    }while (!country.toLowerCase().equals("canada")) ;

                }
        )
                //.take(5)
                .subscribe(Util.subscriber()) ;
    }
}
