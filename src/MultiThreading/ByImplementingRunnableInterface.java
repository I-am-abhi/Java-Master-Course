package MultiThreading;

public class ByImplementingRunnableInterface implements Runnable {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 0 ; i < n;i++){
            Thread object = new Thread(new ByImplementingRunnableInterface());
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
