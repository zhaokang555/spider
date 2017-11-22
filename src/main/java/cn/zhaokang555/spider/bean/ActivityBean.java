package cn.zhaokang555.spider.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用户的一条动态
 *
 * @author zhaokang
 * @date 2017/11/22
 */
public class ActivityBean {
    private Long timestamp;
    private String when;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getWhen() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date(timestamp));
    }

    public String getWhen(String format) {
        return new SimpleDateFormat(format).format(new Date(timestamp));
    }
}
