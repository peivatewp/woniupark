package com.woniuxy.mapper;

import com.woniuxy.domain.Parking;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.woniuxy.vo.ParkingVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author clk
 * @since 2021-03-06
 */
public interface ParkingMapper extends BaseMapper<Parking> {
    //推荐车位
    @Select("SELECT\n" +
            "        p.id,\n" +
            "        title,\n" +
            "        parking_number,\n" +
            "        parking_address,\n" +
            "\t\t\t\ttitle,\n" +
            "        ownship_parking,\n" +
            "        parking_area,\n" +
            "        tel,\n" +
            "        parking_image,\n" +
            "        start_time,\n" +
            "        end_time,\n" +
            "        parking_status,\n" +
            "\t\t\t\tr.rental_price,\n" +
            "\t\t\t\tr.rental_type\n" +
            "    FROM\n" +
            "        `t_parking`AS p \n" +
            "\t\tJOIN \n" +
            "\t\t\tt_rental AS r\n" +
            "\t\tON p.id=r.id\t\t\n" +
            "    JOIN\n" +
            "       t_parking_recommend AS pr \n" +
            "    ON pr.parking_id=p.id\n")
    public List<ParkingVO> findParkingRecommend();


    //搜索车位
    @Select("\tSELECT\n" +
            "        p.id,\n" +
            "        title,\n" +
            "        parking_number,\n" +
            "        parking_address,\n" +
            "\t\t\t\ttitle,\n" +
            "        ownship_parking,\n" +
            "        parking_area,\n" +
            "        tel,\n" +
            "        parking_image,\n" +
            "        start_time,\n" +
            "        end_time,\n" +
            "        parking_status,\n" +
            "\t\t\t\tr.rental_price,\n" +
            "\t\t\t\tr.rental_type\n" +
            "    FROM\n" +
            "        `t_parking`AS p \n" +
            "\t\tJOIN \n" +
            "\t\t\tt_rental AS r\n" +
            "\t\tON p.id=r.id\n" +
            "\t\tWHERE title LIKE #{title}")
    public List<ParkingVO> findParkingByTitle(String title);

}
