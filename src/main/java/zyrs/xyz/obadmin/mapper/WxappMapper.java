package zyrs.xyz.obadmin.mapper;

import org.apache.ibatis.annotations.Mapper;
import zyrs.xyz.obadmin.bean.Banner;
import zyrs.xyz.obadmin.bean.BannerChild;
import zyrs.xyz.obadmin.bean.Wxapp;
import zyrs.xyz.obadmin.bean.WxappMerchant;

import java.util.List;

@Mapper
public interface WxappMapper {
    Wxapp getWxappInfoByObId(Integer obId);


    void addOrUpdateWxapp(Wxapp wxapp);

    void addNewBannerModal(Banner banner);

    List<Banner> getWxappBannerByOid(Integer obId);
    

    void modifyBannerModalWithDescr(Integer id, String value);

    void modifyBannerModalWithWidth(Integer id, String value);

    void modifyBannerModalWithHeight(Integer id, String value);

    void deleteBannerModal(Integer id);

    void addNewBannerChild(BannerChild bannerChild);

    void deleteBannerChild(Integer id);

    void updateMerchant(WxappMerchant wxappMerchant);

    WxappMerchant getWxappMerchantInfo(Integer obId);
}
