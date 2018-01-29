package cn.nanhuaren.freeshuttle.dal.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.nanhuaren.freeshuttle.dal.domain.Hotel;

@Mapper
public interface HotelMapper {

	Hotel selectByCityId(int city_id);

}
