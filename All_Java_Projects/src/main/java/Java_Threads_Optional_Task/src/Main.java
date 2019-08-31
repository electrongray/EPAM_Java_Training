package Java_Threads_Optional_Task.src;

public class Main {

    public static class RunWayQueueClass {
        int n;
        boolean airLine_available = false;
        synchronized int get() {
            if(!airLine_available)
                try {
                    wait(10000);
                } catch(InterruptedException e) {
                    System.out.println("InterruptedException caught");
                }
            System.out.println("Location of Runway for Plane is NOT FREE: " + n);
            airLine_available = false;
            notify();
            return n;
        }
        synchronized void put(int n) {
            if(airLine_available)
                try {
                    wait(10000);
                } catch(InterruptedException e) {
                    System.out.println("InterruptedException caught");
                }
            this.n = n;
            airLine_available = true;
            System.out.println("Free Runway for Plane : " + n);
            notify();
        }
    }
    public static class RunWay implements Runnable {
        RunWayQueueClass q;
        RunWay(RunWayQueueClass queue){
            this.q=queue;
            new Thread(this, "Runway").start();
        }
        @Override
        public void run() {
            for(int i=1;i< 6;i++)
                q.get();
        }
    }
    public static class Plane implements Runnable {
        RunWayQueueClass q;
        Plane(RunWayQueueClass queue){
            this.q=queue;
            new Thread(this, "Plane").start();
        }
        @Override
        public void run() {
            int count =1;
            try {
                while(count< 11){
                    Thread.sleep(2000);
                    q.put(count++);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        RunWayQueueClass q = new RunWayQueueClass();
        new Plane(q);
        new RunWay(q);
        System.out.println("Press Control-C to stop.");
        PlaneRunnable autoRunnable = new PlaneRunnable();
        Thread plane1 = new Thread(autoRunnable);
        plane1.setName("Plane 1");
        Thread plane2 = new Thread(autoRunnable);
        plane2.setName("Plane 2");
        Thread plane3 = new Thread(autoRunnable);
        plane3.setName("Plane 3");
        Thread plane4 = new Thread(autoRunnable);
        plane4.setName("Plane 4");
        Thread plane5 = new Thread(autoRunnable);
        plane5.setName("Plane 5");
        Thread plane6 = new Thread(autoRunnable);
        plane6.setName("Plane 6");
        Thread plane7 = new Thread(autoRunnable);
        plane7.setName("Plane 7");
        Thread plane8 = new Thread(autoRunnable);
        plane8.setName("Plane 8");
        Thread plane9 = new Thread(autoRunnable);
        plane9.setName("Plane 9");
        Thread plane10 = new Thread(autoRunnable);
        plane10.setName("Plane 10");

        System.out.println("Thread State of Plane before calling start: "
                +plane1.getState());
        plane1.start();
        plane2.start();
        plane3.start();
        plane4.start();
        plane5.start();
        plane6.start();
        plane7.start();
        plane8.start();
        plane9.start();
        plane10.start();

        System.out.println("Thread State of Plane1 in Main method before Sleep: "
                + plane1.getState());
        System.out.println("Thread State of Plane2 in Main method before Sleep: "
                + plane2.getState());
        System.out.println("Thread State of Plane3 in Main method before Sleep: "
                + plane3.getState());
        System.out.println("Thread State of Plane4 in Main method before Sleep: "
                + plane4.getState());
        System.out.println("Thread State of Plane5 in Main method before Sleep: "
                + plane5.getState());
        System.out.println("Thread State of Plane6 in Main method before Sleep: "
                + plane6.getState());
        System.out.println("Thread State of Plane7 in Main method before Sleep: "
                + plane7.getState());
        System.out.println("Thread State of Plane8 in Main method before Sleep: "
                + plane8.getState());
        System.out.println("Thread State of Plane9 in Main method before Sleep: "
                + plane9.getState());
        System.out.println("Thread State of Plane10 in Main method before Sleep: "
                + plane10.getState());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread State of Plane1 in Main method after sleep: "
                + plane1.getState());
        System.out.println("Thread State of Plane2 in Main method after sleep: "
                + plane2.getState());
        System.out.println("Thread State of Plane3 in Main method after sleep: "
                + plane3.getState());
        System.out.println("Thread State of Plane4 in Main method after sleep: "
                + plane4.getState());
        System.out.println("Thread State of Plane5 in Main method after sleep: "
                + plane5.getState());
        System.out.println("Thread State of Plane6 in Main method after sleep: "
                + plane6.getState());
        System.out.println("Thread State of Plane7 in Main method after sleep: "
                + plane7.getState());
        System.out.println("Thread State of Plane8 in Main method after sleep: "
                + plane8.getState());
        System.out.println("Thread State of Plane9 in Main method after sleep: "
                + plane9.getState());
        System.out.println("Thread State of Plane10 in Main method after sleep: "
                + plane10.getState());

    }
}
class PlaneRunnable implements Runnable {
    @Override
    public void run() {
        for (int x = 1; x < 4; x++) {
            System.out.println("Run by "
                    + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Thread State of: "
                + Thread.currentThread().getName()
                + " - "+Thread.currentThread().getState());
        System.out.println("Exit of Thread: "
                + Thread.currentThread().getName());
    }
}
