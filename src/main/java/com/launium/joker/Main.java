package com.launium.joker;

import com.sun.jna.Native;

public class Main {
    public static final String VERSION = "1.0";

    public static void main(String[] args) {
        System.out.println("===== Joker v" + VERSION + " | Author: GitHub@layou233 =====");
        System.out.println("Directory: " + System.getProperty("user.dir"));

        Native.load(args[0], Joke.class).JokerMain();
    }
}
