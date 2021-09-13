package com.cjz.sdk.interfaceDefine;

import java.util.LinkedList;
import java.util.List;

public class KeyboardEvent {
    private final String mVersionName = "0.0.1";
    private List<Byte> mKeyASCIIList = new LinkedList<>();
    public enum Action {
        DOWN,
        UP,
    }
    private Action mAction = Action.UP;

    public void addPoint(char acsii, Action action) {
        mKeyASCIIList.add((byte) (acsii & 0xFF));
        mAction = action;
    }


}
