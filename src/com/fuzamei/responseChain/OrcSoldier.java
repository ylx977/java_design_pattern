package com.fuzamei.responseChain;

/**
 * Created by fuzamei on 2018/8/21.
 */
public class OrcSoldier extends RequestHandler {

    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType().equals(RequestType.COLLECT_TAX)){
            printHandling(request);
            request.markHandled();
        }else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc soldier";
    }
}
