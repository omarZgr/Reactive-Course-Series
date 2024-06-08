package rp.sec02;

import reactor.core.publisher.Flux;

public class Lec02MultipleSub {

    public static void main(String[] args) {

        Flux<Integer> allNumber = Flux.just(1,2,3,4) ;
        Flux<Integer> pairNumber = allNumber.filter(i-> i%2 == 0)  ;

        allNumber.subscribe(i-> System.out.println("sub 1 >> "+i)) ;
        pairNumber.subscribe(i-> System.out.println("sub 2 >> "+i)) ;

    }
}
