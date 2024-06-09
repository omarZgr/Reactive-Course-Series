package rp.sec02;

import courseUtil.Util;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;

import java.util.concurrent.atomic.AtomicReference;

public class Lec04CustomerSubscriber {

    public static void main(String[] args) throws InterruptedException {

        AtomicReference<Subscription> atomicReference = new AtomicReference<>() ;

        Flux.range(1,20)
                .log()
                .subscribeWith(new Subscriber<Integer>() {
                    @Override
                    public void onSubscribe(Subscription subscription) {
                        System.out.println("Received : "+subscription);
                        atomicReference.set(subscription);
                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println("onNext : "+integer);


                    }

                    @Override
                    public void onError(Throwable throwable) {
                        System.out.println("onError : "+throwable);


                    }

                    @Override
                    public void onComplete() {
                        System.out.println("onComplete ");


                    }
                });

        Util.sleepSeconds(3);
        atomicReference.get().request(3);

        System.out.println("------");

        Util.sleepSeconds(5);
        atomicReference.get().request(3);

        System.out.println("------");


        Util.sleepSeconds(5);
        atomicReference.get().request(3);

        System.out.println("------");


        System.out.println("Am going to cancel...");
        atomicReference.get().cancel();

        System.out.println("------");


        Util.sleepSeconds(5);
        atomicReference.get().request(3);

    }
}
