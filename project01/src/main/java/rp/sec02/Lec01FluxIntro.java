package rp.sec02;

import reactor.core.publisher.Flux;

public class Lec01FluxIntro {

    public static void main(String[] args) {

        Flux<Integer> numberFlux =  Flux.just(1,2,3,4) ;

        numberFlux.subscribe(i -> System.out.println("Data :: " + i))   ;

    }


}
