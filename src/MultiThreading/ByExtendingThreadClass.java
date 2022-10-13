package MultiThreading;

public class ByExtendingThreadClass extends Thread {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 0 ; i < n;i++){
            ByExtendingThreadClass object = new ByExtendingThreadClass();
            object.start();
        }
    }

    public void run(){
        try {
            System.out.println("Thread "+Thread.currentThread()+"is running");
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
