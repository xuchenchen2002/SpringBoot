package com.xcy.controller.utils;

/**
 * @author 小晨Yu呀!
 * @time 2022-04-18
 * 任务：
 *  本类的作用，就是封装 执行结果数据，想前端发送统一的结果数据（资源对象）
 *
 */
public class R {
    private Boolean flag;
    private int status;
    private Object data;

    public R() { }

    public R(Boolean flag) {
        this.flag = flag;
    }
    public R(Boolean flag, int status, Object data) {
        this.flag = flag;
        this.status = status;
        this.data = data;
    }

    @Override
    public String toString() {
        return "R{" +
                "flag=" + flag +
                ", status=" + status +
                ", data=" + data +
                '}';
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
