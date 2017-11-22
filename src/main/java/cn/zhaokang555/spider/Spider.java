package cn.zhaokang555.spider;

/**
 * @author zhaokang
 * @date 2017/11/22
 */
public class Spider {
    public static void main(String[] args) {
        new Spider().run();
    }

    public void run() {
        while (true) {
            runOnce();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    protected void runOnce() {
        String className = this.getClass().getName();
        System.out.println(className + " runOnce");
    }

}
