package edu.codeschool.training.classes_objects.homework21_MultiplyThread;

public class Writer implements Runnable{
    Writer writer;
    boolean write=true;

    public boolean isWrite() {
        return write;
    }
    public synchronized void writePing(){
        if(isWrite()==true){
            System.out.print("Ping");
            write=false;
        }
    }
    public synchronized void writePong(){
        if(isWrite()==false){
            System.out.print("-Pong");
            System.out.print("\n");
            write=true;
        }
    }
    @Override
    public void run() {
            while(true){
                try {
                    Thread.sleep(1000);
                    writePing();
                    writePong();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
