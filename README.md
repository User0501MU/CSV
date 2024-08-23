Spring Bootでは、@Controller や @RestController アノテーションを使ってコントローラーを定義し、リクエストを処理しますが、リクエストマッピングや依存性注入を使用せずに、単一のメインメソッドで処理を完結させる方法もあります。以下は、CsvController クラスのリクエスト処理をメインメソッドに統合する方法の簡単な例です。

1. メインメソッドでのHTTPリクエスト処理
Spring Boot アプリケーションのメインメソッドに、CSVファイルのコピー処理を直接組み込むことができます。この場合、CsvService や @Controller を使わず、Javaの標準的な I/O 操作をメインメソッド内で直接実行します。



//CSVファイルとCsvSPringApplication.javaで「main」関数が2つ以上あるとどっちを実行するかって聞かれる
//main関数を一番最初に実行しようとするので、一つのプロジェクトにつき必ず一つという状態にしておかないとどちらを実行するか選択表示が出てくる
//自動生成されているものが不要」だが、本当なら自動生成されているものをベースに考えるので注意