package com.woniuxy.service;

import com.woniuxy.domain.Parking;
import com.baomidou.mybatisplus.extension.service.IService;
import com.woniuxy.vo.ParkingVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author clk
 * @since 2021-03-06
 */
public interface ParkingService extends IService<Parking> {

    //推荐车位
    public List<ParkingVO> findParkingRecommend();

    //搜索车位
    public List<ParkingVO> findParkingByTitle(String title);
}
