package rp.sec04.helper;

import courseUtil.Util;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class User {

    private int userId;
    private String name ;

    public User(int userId)
    {
        this.userId=userId ;
        this.name = Util.faker().name().fullName() ;
    }

    public int getUserId()
    {
        return this.userId ;
    }

    public String getName()
    {
        return this.name ;
    }
}
