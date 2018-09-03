package com.demo.user.api.dto;


/**
 * ctrl json返回格式统一基类
 *
 * @param <E>
 */
public class ActionResponse<E> {

    /**
     * 默认返回成功，成功值0
     */
    private int code = 0;

    /**
     * 返回的提示消息
     */
    private String message;

    /**
     * 返回的数据
     */
    private E data;

    public ActionResponse() {
    }

    public ActionResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ActionResponse(E result) {
        this.data = result;
    }

    /**
     * 请求结果是否成功
     */
    public boolean succ() {
        return this.code == 0;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

}