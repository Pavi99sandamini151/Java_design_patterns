package com.androide;

import com.ios.IphoneHeadset;

public class Runner {
    public static void main(String[] args)
    {
        AndroideHeadset an =newHeadsetAdapter();
        ListenMusic lm = new ListenMusic();

        lm.listenSong("hello");
    }
}