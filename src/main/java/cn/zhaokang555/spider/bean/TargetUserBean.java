package cn.zhaokang555.spider.bean;

/**
 * 每个用户
 *
 * @author zhaokang
 * @date 2017/11/22
 */
public class TargetUserBean {
    private String name;
    private String url;
    private String activityTable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getActivityTable() {
        return activityTable;
    }

    public void setActivityTable(String activityTable) {
        this.activityTable = activityTable;
    }
}
