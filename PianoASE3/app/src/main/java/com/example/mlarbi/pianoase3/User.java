package com.example.mlarbi.pianoase3;

import java.io.Serializable;

/**
 * Created by m.larbi on 5/10/2017.
 */

public class User implements Serializable {

    public String name="";
    public String userName = "";
    public String pass = "";
    public boolean val = false;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
