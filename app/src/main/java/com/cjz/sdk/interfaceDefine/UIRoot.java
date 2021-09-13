package com.cjz.sdk.interfaceDefine;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class UIRoot {
    private final String mVersionName = "0.0.1";
    private List<Widget> mUITree = new LinkedList<>();

    public void addChild(Widget widget) {
        mUITree.add(widget); //首层全是父控件
    }

    public void mouseEvent(MouseEvent event) {
        //层序遍历
        Queue<Widget> widgetQueue = new LinkedBlockingQueue<>();
        widgetQueue.addAll(mUITree);
        while(!widgetQueue.isEmpty()) {
            Widget w = widgetQueue.poll();
            if (w.getChild() != null) {
                widgetQueue.add(w.getChild());
            }
            //传递鼠标事件
            w.mouseEvent(event);
        }
    }

}
