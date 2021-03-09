package com.woniuxy.service.impl;

import com.woniuxy.domain.Parking;
import com.woniuxy.mapper.ParkingMapper;
import com.woniuxy.service.ParkingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxy.vo.ParkingVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author clk
 * @since 2021-03-06
 */
@Service("parkingService")
public class ParkingServiceImpl extends ServiceImpl<ParkingMapper, Parking> implements ParkingService {

    @Resource
    private ParkingMapper parkingMapper;

    //推荐车位
    @Override
    public List<ParkingVO> findParkingRecommend() {
        List<ParkingVO> parkingRecommends = parkingMapper.findParkingRecommend();
        return parkingRecommends;
    }

    //搜索车位
    @Override
    public List<ParkingVO> findParkingByTitle(String title) {
        List<ParkingVO> parkingByTitle = parkingMapper.findParkingByTitle(title);
        return parkingByTitle;
    }
}
