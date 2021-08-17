package toolgood.textfilter.api.Datas.Images;

public class ImageFilterResult {

    /**
     * 返回码：0) 成功，1) 失败
     */
    public int code;

    /**
     * 返回码详情描述
     */
    public String message;

    /**
     * 请求标识
     */
    public String requestId;

    /**
     * 不安全系数
     */
    public Float unsafe;
}
