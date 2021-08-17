package toolgood.textfilter.api.Interfaces;

import toolgood.textfilter.api.Datas.CommonResult;
import toolgood.textfilter.api.Datas.Sys.SysInfo;

public interface ISysProvider {

    /**
     * 更新系统
     * 
     * @param textFilterNoticeUrl    默认 文本检测异步地址
     * @param textReplaceNoticeUrl   默认 文本替换异步地址
     * @param imageFilterNoticeUrl   默认 图片检测异步地址
     * @param imageClassifyNoticeUrl 默认 图片分类异步地址
     * @param imageTempPath          图片临时保存地址
     * @param skipword               自定义跳词
     * @return
     */
    CommonResult UpdateSystem(String textFilterNoticeUrl, String textReplaceNoticeUrl, String imageFilterNoticeUrl,
            String imageClassifyNoticeUrl, String imageTempPath, String skipword);

    /**
     * 刷新缓存
     * 
     * @return
     */
    CommonResult Refresh();

    /**
     * 产品信息
     * 
     * @return
     */
    SysInfo Info();

    /**
     * 更新许可
     * 
     * @param lic
     * @return
     */
    CommonResult UpdateLicence(String lic);

    /**
     * 重载数据
     * 
     * @return
     */
    CommonResult InitData();

    /**
     * GC垃圾回收
     * 
     * @return
     */
    CommonResult GCCollect();

}
