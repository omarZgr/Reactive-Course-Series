package rp.sec04;

import courseUtil.Util;
import rp.sec04.helper.OrderService;
import rp.sec04.helper.UserService;

public class Lec04FlatMap {

    public static void main(String[] args) {

        UserService.getUsers()
                .flatMap(user -> OrderService.getOrders(user.getUserId()))
                .subscribe(Util.subscriber()) ;
    }
}
