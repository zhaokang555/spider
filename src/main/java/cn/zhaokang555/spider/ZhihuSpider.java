package cn.zhaokang555.spider;

/**
 * @author zhaokang
 * @date 2017/11/22
 */
public class ZhihuSpider extends Spider {
    @Override
    protected void runOnce() {
        super.runOnce();

        String className = this.getClass().getName();
        System.out.println(className + " runOnce");
    }
}
