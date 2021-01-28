package com.pardxa.springcorexml;

public class Consumer {
    private Service svr;

    public void consume() {
        svr.doIt();
    }

    public void setSvr(Service svr) {
        this.svr = svr;
    }
}
