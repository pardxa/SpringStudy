package com.pardxa.springcoreanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @Autowired
    private Service svr;

    public void consume() {
        svr.doIt();
    }

    // public void setSvr(Service svr) {
    //     this.svr = svr;
    // }
}