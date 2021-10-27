package singleton.patterns.code;

public class MyThread extends Thread{
    public String threadId;
    public MyThread(String threadId){
       this.threadId =  threadId;
    }

    @Override
    public void run(){
        Singleton object = Singleton.getInstance();
        System.out.println(threadId + " --> SingletonInstance: " + object);
    }
}
