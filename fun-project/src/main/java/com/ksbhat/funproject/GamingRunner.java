package com.ksbhat.funproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GamingRunner {
    @Autowired
    private GamingConsole gamingConsole;

    public GamingRunner(GamingConsole gamingConsole){
        this.gamingConsole = gamingConsole;
    }

    public void run(){
        this.gamingConsole.up();
        this.gamingConsole.down();
        this.gamingConsole.left();
        this.gamingConsole.right();
    }

}
