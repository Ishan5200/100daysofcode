package Day_19;

    class evenNo implements runnable {
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println((2 * i)+" is even");
                }
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    class oddNo implements runnable {
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(((2 * i) - 1)+" is odd");
                }
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public class runnableinterface {
        public static void main(String[] args) {
            evenNo e =new evenNo();
            Thread t1 = new Thread();
            oddNo o = new oddNo();
            Thread t2 = new Thread();
            t1.start();
            t2.start();
        }
    }
    
    

