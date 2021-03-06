package com.woniuxy.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author clk
 * @since 2021-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_order")
@ApiModel(value="Order对象", description="")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

        @ApiModelProperty(value = "订单id")
        @TableId(value = "order_id", type = IdType.ID_WORKER)
    private Integer orderId;

        @ApiModelProperty(value = "车位id")
        private Integer parkingPlaceId;

        @ApiModelProperty(value = "订单详细表id")
        private Integer orderInfoId;

        @ApiModelProperty(value = "订单总价")
        private Double total;


}
