package rp.sec05.assignment;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Objects;

public class OrderService {


    private Flux<PurchaseOrder> flux ;

    public Flux<PurchaseOrder> orderStream()
    {
        if (Objects.isNull(flux))
            flux=getPurchaseOrder() ;
        return flux ;
    }
    private Flux<PurchaseOrder> getPurchaseOrder()
    {
        return Flux.interval(Duration.ofMillis(400))
                .map(i->new PurchaseOrder())
                .publish()
                .refCount(2);
    }
}
