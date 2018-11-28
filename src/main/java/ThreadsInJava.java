public class ThreadsInJava  {
    //Main Thread
    public static void main(String[] args)
    {
        MyThread myThread = new MyThread();    //instantiating your thread class that implements Runnable interface

        Thread t = new Thread(myThread);       //Creating an object to Thread class by passing your thread as an argument

       // Thread t2 = new Thread(myThread);

        t.start();

        Thread t2 = new Thread(myThread);
        t2.start();


        //Here the two threads are working on the same objects so they were able to synchronize easily.

        //If they are working on different objects then then we need to synchronize them on a common object.


    }
}
