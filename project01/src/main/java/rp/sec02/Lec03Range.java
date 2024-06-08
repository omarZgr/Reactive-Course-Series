package rp.sec02;

import reactor.core.publisher.Flux;

public class Lec03Range {

    public static void main(String[] args) {

        Flux.range(2,23)
                .subscribe(i-> System.out.println("data : "+i)) ;
    }
}
