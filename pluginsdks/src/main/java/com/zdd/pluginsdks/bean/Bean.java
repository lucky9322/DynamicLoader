package com.zdd.pluginsdks.bean;

/**
 * Project: DynamicLoader
 * Created by lucky on 2017/12/14.
 */

public class Bean implements com.zdd.pluginimpl.IBean{

    /**
     *
     */
    private String name = "这是来自于插件工程中设置的初始化的名字";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


