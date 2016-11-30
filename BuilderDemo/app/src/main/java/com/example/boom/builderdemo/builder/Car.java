package com.example.boom.builderdemo.builder;


import android.app.Activity;
import android.widget.TextView;

/**
 * Created by Boom on 2016/11/29.
 */

public class Car {
    //净重
    private int mweight = 0;
    //类型
    private String mkind = "";
    //颜色
    private String mcolor = "";
    public Car setWeight(int weight) {
        this.mweight = weight;
        return this;
    }
    public Car setKind(String kind) {
        this.mkind = kind;
        return this;
    }
    public Car setColor(String color) {
        this.mcolor = color;
        return this;
    }

    private Builder mybd;
    public Builder builder(Activity activity) {
        mybd = new Builder(activity);
        mybd.setColor(mcolor);
        mybd.setKind(mkind);
        mybd.setWeight(mweight);
        return mybd;
    }
    public void show(TextView tv) {
        if (mybd != null) {
            //回归调用到builder中的show方法
            mybd.show(tv);
        }else {
            tv.setText("这是一款" + mkind + "类型" + mcolor + "颜色" + mweight + "重的轿车。");
        }
    }

    public static class Builder {
        //净重
        private int mweight = 0;
        //类型
        private String mkind = "";
        //颜色
        private String mcolor = "";
        private Activity mactivity;

        public Builder(Activity activity) {
            this.mactivity = activity;

        }

        public Car.Builder setWeight(int weight) {
            this.mweight = weight;
            return this;
        }

        public Car.Builder setKind(String kind) {
            this.mkind = kind;
            return this;
        }

        public Car.Builder setColor(String color) {
            this.mcolor = color;
            return this;
        }

        public void show(TextView v) {
            v.setText("这是一款" + mkind + "类型" + mcolor + "颜色" + mweight + "重的车。");
        }

    }
}
