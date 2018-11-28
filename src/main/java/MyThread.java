public class MyThread implements Runnable
{

    synchronized public void run()
            //public void run()
    {
        //Task of this thread is to print multiplication of successive numbers up to 1000 numbers
        for(int i = 0; i < 6; i++)
        {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("I was interrupted!");
                e.printStackTrace();
            }

        }
    }


}

