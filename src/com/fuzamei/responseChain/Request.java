package com.fuzamei.responseChain;

/**
 * Created by fuzamei on 2018/8/21.
 */
public class Request {

    private final RequestType requestType;

    private final String resuestDescription;

    public Request(final RequestType requestType,final String resuestDescription) {
        this.requestType = requestType;
        this.resuestDescription = resuestDescription;
    }

    private boolean handled;

    public String getResuestDescription(){
        return this.resuestDescription;
    }
    public RequestType getRequestType(){
        return this.requestType;
    }

    public void markHandled(){
        this.handled = true;
    }

    public boolean isHandled(){
        return this.handled;
    }

    @Override
    public String toString() {
        return getResuestDescription();
    }
}
