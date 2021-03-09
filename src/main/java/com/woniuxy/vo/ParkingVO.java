package com.woniuxy.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class ParkingVO implements Serializable {
    @ApiModelProperty(value = "车位id")
    private Integer id;

    @ApiModelProperty(value = "出租id")
    private Integer rentalPriceId;

    @ApiModelProperty(value = "车位号")
    private Integer parkingNumber;

    @ApiModelProperty(value = "车位地址")
    private String parkingAddress;

    @ApiModelProperty(value = "车位产权信息")
    private String ownshipParking;

    @ApiModelProperty(value = "车位面积")
    private String parkingArea;

    @ApiModelProperty(value = "联系方式")
    private String tel;

    @ApiModelProperty(value = "车位图片")
    private String parkingImage;

    @ApiModelProperty(value = "起始出租时间")
    private Date startTime;

    @ApiModelProperty(value = "结束出租时间")
    private Date endTime;

    @ApiModelProperty(value = "车位状态分为：上架(0)和下架(1)")
    private Integer parkingStatus;

    @ApiModelProperty(value = "点击量")
    private Integer hits;

    @ApiModelProperty(value = "车位标题")
    private String title;

    @ApiModelProperty(value = "出租状态id")
    private Integer rentalStatusId;

    @ApiModelProperty(value = "出租方式")
    private String rentalType;

    @ApiModelProperty(value = "出租价格")
    private Double rentalPrice;

}
