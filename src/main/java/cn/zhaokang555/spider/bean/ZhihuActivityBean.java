package cn.zhaokang555.spider.bean;

/**
 * 知乎用户的每条动态
 *
 * @author zhaokang
 * @date 2017/11/22
 */
public class ZhihuActivityBean extends ActivityBean {
    private String who;
    private String action;
    private String what;
    private String content;

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
