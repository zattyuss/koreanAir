package koreanAir.copy.service;

import java.util.List;

import koreanAir.copy.model.Board;
import koreanAir.copy.model.Criteria;

public interface BoardService {
	List<Board> readAll(Criteria criteria);
	Board read (Long bno);
	void register(Board board);
	void modify(Board board);
	void remove(Long bno);
	Integer getTotal(Criteria criteria);
}
