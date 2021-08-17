package toolgood.textfilter.api.Datas.Texts;

public class TextFilterContactItem {

    /**
     * 联系方式类型 0)手机号 1)qq号 2)微信号 3) 微博号 4)微信号公众号
     */
    public String contactType;
    /**
     * 联系方式串
     */
    public String contactString;
    /**
     * 联系方式串位置，例：1,3,5,7-12,15
     */
    public String position;

}
