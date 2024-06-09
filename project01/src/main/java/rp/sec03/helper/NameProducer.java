package rp.sec03.helper;



import courseUtil.Util;
import reactor.core.publisher.FluxSink;

import java.util.function.Consumer;

public class NameProducer implements Consumer<FluxSink<String>>{

    private FluxSink<String> stringFluxSink ;


    @Override
    public void accept(FluxSink<String> stringFluxSink) {

        this.stringFluxSink=stringFluxSink ;

    }

    public void produce()
    {
        String name = Util.faker().name().fullName() ;

        this.stringFluxSink.next(name) ;
    }
}
