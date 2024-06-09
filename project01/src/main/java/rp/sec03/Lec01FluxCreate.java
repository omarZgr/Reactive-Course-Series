package rp.sec03;

import courseUtil.Util;
import reactor.core.publisher.Flux;
import rp.sec03.helper.NameProducer;

public class Lec01FluxCreate {

    public static void main(String[] args) {

        NameProducer nameProducer = new NameProducer() ;

        Flux.create(nameProducer).subscribe(Util.onNext()) ;

        nameProducer.produce();
    }
}
