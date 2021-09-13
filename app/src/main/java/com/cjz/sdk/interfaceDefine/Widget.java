package com.cjz.sdk.interfaceDefine;

public abstract class Widget {

    public abstract void mouseEvent(MouseEvent event);

    public abstract void keyEvent(KeyboardEvent event);

    public abstract Widget getChild();

    public abstract void drawUI(Canvas c);
}
