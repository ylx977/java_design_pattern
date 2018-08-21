package com.fuzamei.responseChain;

/**
 *
 * @author ylx
 * @date 2018/8/21
 */
public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next){
        this.next = next;
    }

    public void handleRequest(Request request){
        if(next != null){
            next.handleRequest(request);
        }
    }

    protected  void printHandling(Request request){
        System.out.println(this.toString()+" handling request "+request);
    }

}
