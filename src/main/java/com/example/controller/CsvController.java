package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.CsvService;

@Controller
	//@RequestMapping("/api/csv"): このコントローラーが/api/csvで始まるリクエストを処理します。
/*@RequestMapping("/api/csv")*///マッピングなのでメインメソッドだけで完結させる
public class CsvController {

	private final CsvService csvService;

	// CsvServiceをコンストラクタで注入

	public CsvController(CsvService csvService) {
		this.csvService = csvService;
	}

	//@GetMapping("/copy"): HTTP GETリクエストの/copyパスを処理します。
	/*@GetMapping("/copy")*/
	// @ResponseBody: メソッドの戻り値をHTTPレスポンスボディとして返します。
	@ResponseBody
	public String copyCsvFile() {
		return csvService.copyCsvFile(); // サービスメソッドを呼び出して結果を返す
	//copyCsvFile(): サービスのメソッドを呼び出して、CSVファイルのコピー処理を行います。
	}
}