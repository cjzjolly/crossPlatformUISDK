package com.cjz.sdk.interfaceDefine;

import android.view.MotionEvent;

public abstract class Canvas {

    public abstract void drawUIToSystem(Canvas c);

    public abstract void keyboardEvent(KeyboardEvent keyboardEvent);

    public abstract void mouseEvent(MouseEvent mouseEvent);
}
