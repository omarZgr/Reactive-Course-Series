package rp.sec04;

import courseUtil.Util;
import reactor.core.publisher.Flux;
import rp.sec04.helper.Person;

public class Lec03Transform {

    public static void main(String[] args) {

        getPerson()
                .subscribe(Util.subscriber()) ;

    }

    private static Flux<Person> getPerson()
    {
        return Flux.range(1,10)
                .map(i -> new Person()) ;
    }
}
