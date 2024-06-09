package courseUtil;

import com.github.javafaker.Faker;
import org.reactivestreams.Subscriber;

import java.util.Objects;
import java.util.function.Consumer;

public class Util {

    private static final Faker FAKER = Faker.instance() ;
    public static Consumer<? super String> onNext()
    {
        return o -> System.out.println("Received : "+o) ;
    }

    public static void sleepSeconds(int seconde) throws InterruptedException {
         Thread.sleep(seconde * 1000);
    }

    public static Consumer<Throwable> onError()
    {
        return e -> System.out.println("Error : "+e) ;
    }

    public static Runnable onComplete()
    {
        return () -> System.out.println("Completed") ;
    }

    public static Faker faker()
    {
        return FAKER;
    }

    public static Subscriber<Object> subscriber()
    {
        return new DefaultSubscriber()  ;
    }


    public static Subscriber<Object> subscriber(String name)
    {
        return new DefaultSubscriber(name)  ;
    }
}
