package com.demo.service;

public class DemoService {
    private String demoMsg;

    public String getDemoMsg() {
        return demoMsg;
    }

    public void setDemoMsg(String demoMsg) {
        this.demoMsg = demoMsg;
    }

    public DemoService(String demoMsg) {
        this.demoMsg = demoMsg;
    }

    private String SaySomething(){
        return demoMsg;
    }
}
