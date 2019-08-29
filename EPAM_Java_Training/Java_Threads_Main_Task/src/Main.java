
        public class Main {
            public static class CarQueueClass {
                int n;
                boolean parking_available = false;
                synchronized int get() {
                    if(!parking_available)
                        try {
                            wait(10000);
                        } catch(InterruptedException e) {
                            System.out.println("InterruptedException caught");
                        }
                    System.out.println("Location of Parking for Car is NOT FREE: " + n);
                    parking_available = false;
                    notify();
                    return n;
                }
                synchronized void put(int n) {
                    if(parking_available)
                        try {
                            wait(10000);
                        } catch(InterruptedException e) {
                            System.out.println("InterruptedException caught");
                        }
                    this.n = n;
                    parking_available = true;
                    System.out.println("Free Parking for Car : " + n);
                    notify();
                }
            }
            public static class CarParking implements Runnable {
                CarQueueClass q;
                CarParking(CarQueueClass queue){
                    this.q=queue;
                    new Thread(this, "CarParking").start();
                }
                @Override
                public void run() {
                    for(int i=1;i< 8;i++)
                        q.get();
                }
            }
            public static class Car implements Runnable {
                CarQueueClass q;
                Car(CarQueueClass queue){
                    this.q=queue;
                    new Thread(this, "Car").start();
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
            public static void main(String[] args) throws Exception{
                CarQueueClass q = new CarQueueClass();
                new Car(q);
                new CarParking(q);
                System.out.println("Press Control-C to stop.");

                AutoRunnable autoRunnable = new AutoRunnable();
                Thread auto1 = new Thread(autoRunnable);
                auto1.setName("Auto 1");
                Thread auto2 = new Thread(autoRunnable);
                auto2.setName("Auto 2");
                Thread auto3 = new Thread(autoRunnable);
                auto3.setName("Auto 3");
                Thread auto4 = new Thread(autoRunnable);
                auto4.setName("Auto 4");
                Thread auto5 = new Thread(autoRunnable);
                auto5.setName("Auto 5");
                Thread auto6 = new Thread(autoRunnable);
                auto6.setName("Auto 6");
                Thread auto7 = new Thread(autoRunnable);
                auto7.setName("Auto 7");
                Thread auto8 = new Thread(autoRunnable);
                auto8.setName("Auto 8");
                Thread auto9 = new Thread(autoRunnable);
                auto9.setName("Auto 9");
                Thread auto10 = new Thread(autoRunnable);
                auto10.setName("Auto 10");

                System.out.println("Thread State of Car before calling start: "
                        +auto1.getState());
                auto1.start();
                auto2.start();
                auto3.start();
                auto4.start();
                auto5.start();
                auto6.start();
                auto7.start();
                auto8.start();
                auto9.start();
                auto10.start();

                System.out.println("Thread State of Auto1 in Main method before Sleep: "
                        + auto1.getState());
                System.out.println("Thread State of Auto2 in Main method before Sleep: "
                        + auto2.getState());
                System.out.println("Thread State of Auto3 in Main method before Sleep: "
                        + auto3.getState());
                System.out.println("Thread State of Auto4 in Main method before Sleep: "
                        + auto4.getState());
                System.out.println("Thread State of Auto5 in Main method before Sleep: "
                        + auto5.getState());
                System.out.println("Thread State of Auto6 in Main method before Sleep: "
                        + auto6.getState());
                System.out.println("Thread State of Auto7 in Main method before Sleep: "
                        + auto7.getState());
                System.out.println("Thread State of Auto8 in Main method before Sleep: "
                        + auto8.getState());
                System.out.println("Thread State of Auto9 in Main method before Sleep: "
                        + auto9.getState());
                System.out.println("Thread State of Auto10 in Main method before Sleep: "
                        + auto10.getState());
                Thread.sleep(10000);
                System.out.println("Thread State of Auto1 in Main method after sleep: "
                        + auto1.getState());
                System.out.println("Thread State of Auto2 in Main method after sleep: "
                        + auto2.getState());
                System.out.println("Thread State of Auto3 in Main method after sleep: "
                        + auto3.getState());
                System.out.println("Thread State of Auto4 in Main method after sleep: "
                        + auto4.getState());
                System.out.println("Thread State of Auto5 in Main method after sleep: "
                        + auto5.getState());
                System.out.println("Thread State of Auto6 in Main method after sleep: "
                        + auto6.getState());
                System.out.println("Thread State of Auto7 in Main method after sleep: "
                        + auto7.getState());
                System.out.println("Thread State of Auto8 in Main method after sleep: "
                        + auto8.getState());
                System.out.println("Thread State of Auto9 in Main method after sleep: "
                        + auto9.getState());
                System.out.println("Thread State of Auto10 in Main method after sleep: "
                        + auto10.getState());
            }
        }
        class AutoRunnable implements Runnable {
            @Override
            public void run() {
                for (int x = 1; x < 11; x++) {
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
