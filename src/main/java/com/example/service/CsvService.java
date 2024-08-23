//package com.example.service;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class CsvService {
//
//	public String copyCsvFile() {
//		// コピー元のファイルパス
//		String sourceFilePath = "src/main/resources/CSV変換確定申告用：収入経費集計表.csv";
//		// 新しいファイル名を生成（元のファイル名に語尾を追加）
//		String destinationFilePath = "src/main/resources/CSV変換確定申告用：収入経費集計表お.csv";
//
//		try (// try (: リソースを自動的に閉じるためのtry-with-resources構文を開始します。
//				FileReader reader = new FileReader(sourceFilePath);
//				// FileReaderを作成して、コピー元のファイルを開きます。
//				FileWriter writer = new FileWriter(destinationFilePath)
//		// FileWriterを作成して、コピー先のファイルを開きます。
//		) {
//
//			int character;
//			// 1文字ずつ読み込むためのint型変数を定義し書き込み
//			while ((character = reader.read()) != -1) {
//				// FileReaderから1文字ずつ読み取り、読み取った文字が-1（ファイルの終わり）でない限りループします。
//				// その文字のUnicode値をcharacter変数に格納します。
//				writer.write(character);
//				// FileWriterを使用して、読み取った文字をコピー先のファイルに書き込み
//			}
//			/*
//			 * IOException 変数名 変数名.printStackTrace();
//			 * ※ファイルが読み込めないなど処理の失敗した場合記述しておくとエラーの詳細が表示される例外
//			 */
//		} catch (IOException e) {
//			e.printStackTrace();
//			return "Error occurred while copying CSV file.";
//		}
//		// エラーメッセージを返します。
//		return "CSV file copied successfully to:" + destinationFilePath;
//
//	}
//
//}
