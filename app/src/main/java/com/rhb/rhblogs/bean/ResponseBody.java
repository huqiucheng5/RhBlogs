package com.rhb.rhblogs.bean;

import java.io.Serializable;

public class ResponseBody<T> implements Serializable {

    private Integer status;

    private T data;

    private String error;

    private long pageSize;

    private Integer total;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "ResponseBody{" +
                "status=" + status +
                ", data=" + data.toString() +
                ", error='" + error + '\'' +
                ", pageSize=" + pageSize +
                ", total=" + total +
                '}';
    }
}
