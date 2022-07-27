package com.androide;

public class ListenMusic {
    private AndroideHeadset headset;

    public LsitenMusic(AndroideHeadset headset){
        this.headset = headset;
    }
    public void listenSong(String str){
        headset.giveSound(str);
    }
}