package com.example.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.example.service.CsvService;
//
//@Controller
//// @RequestMapping("/api/csv"): このコントローラーが/api/csvで始まるリクエストを処理します。
///* @RequestMapping("/api/csv") */// マッピングなのでメインメソッドだけで完結させる
//public class CsvController {
//
//	private final CsvService csvService;
//
//	// CsvServiceをコンストラクタで注入
//
//	public CsvController(CsvService csvService) {
//		this.csvService = csvService;
//	}
//
//	// @GetMapping("/copy"): HTTP GETリクエストの/copyパスを処理します。
//	/* @GetMapping("/copy") */
//	// @ResponseBody: メソッドの戻り値をHTTPレスポンスボディとして返します。
//	@ResponseBody
//	public String copyCsvFile() {
//		return csvService.copyCsvFile(); // サービスメソッドを呼び出して結果を返す
//		// copyCsvFile(): サービスのメソッドを呼び出して、CSVファイルのコピー処理を行います。
//	}
//}


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CsvController {

    public static void main(String[] args) {
        // コピー元とコピー先のファイルパスを指定
        String sourceFilePath = "src/main/resources/CSV変換確定申告用：収入経費集計表.csv";
        String destinationFilePath = "src/main/resources/CSV変換確定申告用：収入経費集計表お.csv";

        // CSVファイルをコピーする処理を実行
        String result = copyCsvFile(sourceFilePath, destinationFilePath);

        // 処理結果をコンソールに表示
        System.out.println(result);
    }

    private static String copyCsvFile(String sourceFilePath, String destinationFilePath) {
        // FileReaderとFileWriterを使用してファイルを読み書きする
        try (FileReader reader = new FileReader(sourceFilePath);
             FileWriter writer = new FileWriter(destinationFilePath)) {

            int character;
            // ファイルの内容を1文字ずつ読み込み、書き込み先ファイルに書き込む
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            // 成功メッセージを返す
            return "CSV file copied successfully to: " + destinationFilePath;
        } catch (IOException e) {
            // エラーメッセージを返す
            e.printStackTrace();
            return "Error occurred while copying CSV file.";
        }
    }
}
