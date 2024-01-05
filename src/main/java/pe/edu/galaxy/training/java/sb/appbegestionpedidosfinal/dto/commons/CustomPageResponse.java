package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.commons;

import java.util.List;

import org.springframework.data.domain.Page;

import lombok.Data;

@Data
public class CustomPageResponse<T> {
	
	List<T> content;
	CustomPageable pageable;
	
	public CustomPageResponse(Page<T> page) {
	    this.content = page.getContent();
	    this.pageable = new CustomPageable(page.getPageable().getPageNumber(),
	    		page.getPageable().getPageSize(), page.getTotalElements());
	  }

	  @Data
	  class CustomPageable {
	    int pageNumber;
	    int pageSize;
	    long totalElements;

	    public CustomPageable(int pageNumber, int pageSize, long totalElements) {

	      this.pageNumber = pageNumber + 1;
	      this.pageSize = pageSize;
	      this.totalElements = totalElements;
	    }
	  }


}
