package koreanAir.copy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import koreanAir.copy.mapper.BoardMapper;
import koreanAir.copy.model.Board;
import koreanAir.copy.model.Criteria;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;
	
	
	@Override
	public List<Board> readAll(Criteria criteria) {
		return mapper.getList(criteria);
	}

	@Override
	public Board read(Long bno) {
		return mapper.get(bno);
	}

	@Override
	public void register(Board board) {
		mapper.insert(board);
	}

	@Override
	public void modify(Board board) {
		mapper.update(board);
	}

	@Override
	public void remove(Long bno) {
		mapper.delete(bno);
	}

	@Override
	public Integer getTotal(Criteria criteria) {
		return mapper.totalCount(criteria);
	}

}
