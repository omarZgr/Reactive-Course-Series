package rp.sec02;

import courseUtil.Util;
import rp.sec02.helper.GenerateName;

import java.util.List;

public class Lec05FluxVsList {

    public static void main(String[] args) throws InterruptedException {

        List<String> strings = GenerateName.getNames_List(5) ;

        System.out.println(strings);

        System.out.println("-----------------");

        GenerateName.getNames_Flux(5).subscribe(Util.onNext()) ;



    }
}
