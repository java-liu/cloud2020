package com.ljava.springcloud.config;


import lombok.Getter;

/**
 * @Description: java类作用描述
 * @Author: Liuys
 * @CreateDate: 2021/6/29 17:40
 * @Version: 1.0
 */
public class Utils {
    /*ORDER(1,"order");

    @Getter private int code;
    @Getter private String msg;

    Utils(int i, String msg) {
        this.code = i;
        this.msg = msg;
    }
    public static Utils getMsg(int index){
        Utils[] array = Utils.values();
        for (Utils utils : array) {
            if(index == utils.code){
                return utils;
            }
        }
        return null;
    }*/
    private static final String RESOURCE_ID = "order";
    public static String getResourceId(){
        return RESOURCE_ID;
    }
}
