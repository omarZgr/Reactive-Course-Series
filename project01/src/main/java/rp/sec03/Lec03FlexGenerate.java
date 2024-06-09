package rp.sec03;

import courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec03FlexGenerate {

    public static void main(String[] args) {

        Flux.generate(synchronousSink ->
        {
            String country = Util.faker().country().name() ;
            System.out.println("Emiting : "+country);
            synchronousSink.next(country);

            if (country.toLowerCase().equals("canada"))
                synchronousSink.complete();
        }).subscribe(Util.subscriber()) ;
    }
}
