package Thread06;

public class MyThread extends Thread {
    public static int ticket = 0;
    @Override
    public void run() {
        while(true) {
            if(ticket < 100) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (this.getClass()) {
                    if(ticket < 100) { //双重校验，不然ticket会有可能超出100
                        ticket++;
                        System.out.println(getName() + " is selling ticket：" + ticket);
                    }
                }

            } else {
                break;
            }

        }
    }

}
