package com.androide;

import com.ios.IphoneHeadset;

public class HeadsetAdapter implements AndroideHeadset{
    IphoneHeadset ihs = new IphoneHeadset();

    public IphoneHeadset getIhs() {
        return ihs;
    }

    @Override
    public void giveSound(String str){
        ihs.giveQualitySound(str);
    }
}