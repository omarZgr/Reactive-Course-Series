package rp.sec02.helper;

import com.github.javafaker.Faker;
import courseUtil.Util;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class GenerateName {


    public static List<String> getNames_List(int count) throws InterruptedException {
        List<String> strings = new ArrayList<>(count) ;

        for (int i=0;i<count;i++)
            strings.add(getName()) ;

        return strings ;
    }

    public static Flux<String> getNames_Flux(int count)
    {
        return Flux.range(0,count)
                .map(i-> {
                    try {
                        return getName();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }) ;
    }
    private static String getName() throws InterruptedException {
        Thread.sleep(1000);

        return Util.faker().name().fullName() ;
    }
}
