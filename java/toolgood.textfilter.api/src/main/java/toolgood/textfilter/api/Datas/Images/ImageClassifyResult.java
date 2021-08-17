package toolgood.textfilter.api.Datas.Images;

public class ImageClassifyResult {

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
     * 色情系数
     */
    public Float porn;

    /**
     * 血腥系数
     */
    public Float bloody;

    /**
     * 变态系数
     */
    public Float hentai;

    /**
     * 引诱系数
     */
    public Float lure;

    /**
     * 性感系数
     */
    public Float sexy;

    /**
     * 正常系数
     */
    public Float normal;

}
