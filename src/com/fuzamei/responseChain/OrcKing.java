package com.fuzamei.responseChain;

/**
 * Created by fuzamei on 2018/8/21.
 */
public class OrcKing {

    RequestHandler chain;

    public OrcKing(){
        buildChain();
    }

    private void buildChain(){
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request request){
        chain.handleRequest(request);
    }

}
