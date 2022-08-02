package koreanAir.copy.mapper;

import java.util.List;

import koreanAir.copy.model.Board;
import koreanAir.copy.model.Criteria;

public interface BoardMapper {
	
	List<Board> getList(Criteria criteria);
	Board get(Long bno);
	void insert(Board board);
	void update(Board board);
	void delete(Long bno);
	Integer totalCount(Criteria criteria);
}
