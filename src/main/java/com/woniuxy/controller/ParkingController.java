package com.woniuxy.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniuxy.dto.Result;
import com.woniuxy.dto.StatusCode;
import com.woniuxy.service.ParkingService;
import com.woniuxy.vo.PageParkingVO;
import com.woniuxy.vo.ParkingVO;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author clk
 * @since 2021-03-06
 */
@RestController
@RequestMapping("/parking")
@CrossOrigin
public class ParkingController {

    @Resource
    private ParkingService parkingService;

    @GetMapping("findParkingRecommend")
    public Result findParkingRecommend(){
        Random random = new Random();
        //分页
//        PageHelper.startPage(1, 2);
        List<ParkingVO> parkingRecommend = parkingService.findParkingRecommend();
//        PageInfo pageInfo = new PageInfo(parkingRecommend);
//        System.out.println(pageInfo+"-----");
        List<ParkingVO> parkingVOList = new ArrayList<>();
        int num = 0;
            for (int i = 0; i < 4; i++) {
                //产生随机数
                num=random.nextInt(parkingRecommend.size());
                if(!parkingVOList.contains(parkingRecommend.get(num))){
                    parkingVOList.add(parkingRecommend.get(num));
                }else {
                    i--;
                }
            }
        return new Result(true, StatusCode.OK,"推荐车位",parkingVOList);
    }

    @PostMapping("findParkingByTitle")
    public Result findParkingByTitle(@RequestBody PageParkingVO pageParkingVO){
        System.out.println("进来了"+pageParkingVO.getTitle());
        PageHelper.startPage(pageParkingVO.getCurrent(), 8);
        List<ParkingVO> parkingByTitle = parkingService.findParkingByTitle("%"+pageParkingVO.getTitle()+"%");
        //分页
        PageInfo pageInfo = new PageInfo(parkingByTitle);
        return new Result(true, StatusCode.OK,"搜索成功",pageInfo);
    }
}

