package com.cjz.sdk.interfaceDefine;

public class Point {
    private final String mVersionName = "0.0.1";
    private float mPointFloat[];
    private int mPointInt[];

    public Point(int x, int y) {
        mPointInt = new int[] {x, y};
    }

    public Point(float x, float y) {
        mPointFloat = new float[] {x, y};
    }

    public void setPoint(int x, int y) {
        mPointInt[0] = x;
        mPointInt[1] = y;
    }

    public void setPoint(float x, float y) {
        mPointFloat[0] = x;
        mPointFloat[1] = y;
    }

    public float getX() {
        if (mPointFloat != null) {
            return mPointFloat[0];
        } else {
            return mPointInt[0];
        }
    }

    public int getXInt() {
        if (mPointInt != null) {
            return mPointInt[0];
        } else {
            return (int) mPointFloat[0];
        }
    }

    public float getY() {
        if (mPointFloat != null) {
            return mPointFloat[1];
        } else {
            return mPointInt[1];
        }
    }

    public int getYInt() {
        if (mPointInt != null) {
            return mPointInt[1];
        } else {
            return (int) mPointFloat[1];
        }
    }
}
