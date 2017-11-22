package cn.zhaokang555.spider.service;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhaokang
 * @date 2017/11/22
 */
public class Service {
    public static void main(String[] args) {
        try {
            String result = get("http://www.baidu.com");
            System.out.println(result);
            String imgSrc = matchStr(result, "id=");
            System.out.println(imgSrc);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * 读取文件,返回文件内容
     * @param path 文件路径
     * @return 文件内容
     * @throws IOException
     */
    public static String readFile(String path) throws IOException {
        File file = new File(path);
        if(!file.exists()||file.isDirectory()) {
            throw new FileNotFoundException();
        }
        StringBuffer sb = new StringBuffer();
        try {
            InputStreamReader read = new InputStreamReader(new FileInputStream(file),"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                sb.append(lineTxt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static String get(String url) {
        String result = "";
        InputStream in = null;

        try {
            URL realUrl = new URL(url);
            URLConnection connection = realUrl.openConnection();
            connection.connect();
            in = connection.getInputStream();
            byte[] bytes = readAllBytes(in);
            result = new String(bytes, "UTF-8");
        } catch (Exception e) {
            System.out.println("发送get请求出现异常" + e);
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private static String matchStr(String targetStr, String patternStr) {
        Pattern pattern = Pattern.compile(patternStr);
        // 定义一个matcher用来做匹配
        Matcher matcher = pattern.matcher(targetStr);
        // 如果找到了
        if (matcher.find()) {
            // 打印出结果
            System.out.println(matcher.group());
            return matcher.group();
        }
        return "Nothing";
    }

    private static byte[] readAllBytes(InputStream in) throws IOException {
        try(ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            copy(in, out);
            return out.toByteArray();
        }
    }

    private static void copy(InputStream in, OutputStream out) throws IOException {
        final int BLOCKKSIZE = 1024;
        byte[] bytes = new byte[BLOCKKSIZE];
        int len;
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }
    }
}
