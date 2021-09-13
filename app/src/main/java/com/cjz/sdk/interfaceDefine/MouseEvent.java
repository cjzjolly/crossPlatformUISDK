package com.cjz.sdk.interfaceDefine;

import java.util.LinkedList;
import java.util.List;

public class MouseEvent {
    private final String mVersionName = "0.0.1";
    private List<Point> mPointList = new LinkedList<>();
    public enum Action {
        DOWN,
        MOVE,
        UP,
    }
    private Action mAction = Action.UP;

    public void addPoint(Point point, Action action) {
        mPointList.add(point);
        mAction = action;
    }


}
