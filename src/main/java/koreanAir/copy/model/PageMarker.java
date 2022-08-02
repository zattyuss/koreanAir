package koreanAir.copy.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PageMarker {

	private int startPage;
	private int endPage;
	private int tempEndPage;
	private int totalCount;
	private int disPlayPageNum = 10;
	
	private Criteria criteria;
	
	private boolean prev;
	private boolean next;
	public PageMarker(int totalCount, Criteria criteria) {
		this.totalCount = totalCount;
		this.criteria = criteria;
		
		endPage = (int) Math.ceil(criteria.getPage()/(double)disPlayPageNum)*disPlayPageNum;
	    startPage = endPage - disPlayPageNum + 1;
	    tempEndPage = (int) Math.ceil(totalCount/(double)criteria.getPerPageNum());
	      
	    prev = startPage != 1;
	    next = endPage < tempEndPage;
		
		if(endPage > tempEndPage) endPage = tempEndPage;
	}
	
	
	
}
