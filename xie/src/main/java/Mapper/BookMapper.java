package Mapper;

import org.apache.ibatis.annotations.Param;

public interface BookMapper {
	
	public int insert(@Param("id") int id, @Param("name") String name);
}
