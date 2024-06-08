package assignment;

import courseUtil.Util;

public class Start {

    public static void main(String[] args) {


        FileService.read("data.txt")
                .subscribe(Util.onNext(),
                            Util.onError(),
                            Util.onComplete());
    }
}
