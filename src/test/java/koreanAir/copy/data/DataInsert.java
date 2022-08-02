package koreanAir.copy.data;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import koreanAir.copy.AppTest;
import koreanAir.copy.mapper.BoardMapper;
import koreanAir.copy.model.Board;

public class DataInsert extends AppTest{

	@Autowired
	BoardMapper mapper;
	
	@Test
	public void dataInsert() {
		for (int i = 1; i <= 211; i++) {
			Board board = new Board();
			board.setTitle("안녕 ㅎㅎ"+i);
			board.setContent("안뇽"+i);
			board.setWriter("누군가"+i);
			mapper.insert(board);
		}
	}
}
