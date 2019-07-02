package com.niulx;

import java.io.Serializable;

/**
 * @Date 2019-07-01 20:50
 * @Created by nlx
 */
public class User  implements Serializable {


    private static final long serialVersionUID = 4397913272647582332L;


    private String userName;
    private String passWord;
    private String adress;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
