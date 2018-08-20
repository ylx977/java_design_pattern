package com.fuzamei.balk;

/**
 * Created by fuzamei on 2018/8/20.
 */
public class WashingMachine {

    private WashingMachineState washingMachineState;

    public WashingMachine(){
        this.washingMachineState = WashingMachineState.ENABLED;
    }

    public WashingMachineState getWashingMachineState(){
        return this.washingMachineState;
    }

    public void wash(){
        synchronized (this){
            System.out.println("state:"+washingMachineState+",thread:"+Thread.currentThread().getName());

            if(washingMachineState == WashingMachineState.WASHING){
                System.err.println("ERROR: Cannot wash if the machine has been already washing!");
                return;
            }
            washingMachineState = WashingMachineState.WASHING;
        }

        System.out.println("doing washing:" + Thread.currentThread().getName());

        try {
            Thread.sleep(50);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        endOfWashing();

    }

    public synchronized void endOfWashing(){
        washingMachineState = WashingMachineState.ENABLED;
        System.out.println("Washing completed."+ Thread.currentThread().getName());
    }

}
