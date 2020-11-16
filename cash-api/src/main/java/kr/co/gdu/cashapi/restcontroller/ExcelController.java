package kr.co.gdu.cashapi.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExcelController {
	@GetMapping(path = "/cashListExcel",produces = "application/vnd.ms-excel")	// 안적으면 text/html을 찾게 됨
	public String excelDownload() {
		return "cashListExcel";	// 엑셀 파일로 리턴
	}
}
