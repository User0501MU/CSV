Spring Bootでは、@Controller や @RestController アノテーションを使ってコントローラーを定義し、リクエストを処理しますが、リクエストマッピングや依存性注入を使用せずに、単一のメインメソッドで処理を完結させる方法もあります。以下は、CsvController クラスのリクエスト処理をメインメソッドに統合する方法の簡単な例です。

1. メインメソッドでのHTTPリクエスト処理
Spring Boot アプリケーションのメインメソッドに、CSVファイルのコピー処理を直接組み込むことができます。この場合、CsvService や @Controller を使わず、Javaの標準的な I/O 操作をメインメソッド内で直接実行します。



//CSVファイルとCsvSPringApplication.javaで「main」関数が2つ以上あるとどっちを実行するかって聞かれる

//main関数を一番最初に実行しようとするので、一つのプロジェクトにつき必ず一つという状態にしておかないとどちらを実行するか選択表示が出てくる

//自動生成されているものが不要」だが、本当なら自動生成されているものをベースに考えるので注意

※Springスターター・プロジェクトで作成すると思うんですけど、Spring Webは使用しないで作成してみてください。

＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿


レビュー回答
結果として「こうなるべき」が見えてるけど、そこに至るまでの道のりが多すぎていらない選択肢を増やしている印象なので一度脳内を更地にする。

「ソースの書き方はコメントも適度に記入されてて読みやすくてとても良いですね！
さらにCSVファイルの読み書きを別関数としている部分もとてもGoodです！
（こうすることで、他の処理から同じような動作をするときに呼べるようになるので）
エビデンスの取り方も「ここ見てくださいね」が分かりやすくてとても良いです👍」

「ちょっと気になるなっていう点を挙げるならば、
もうちょっとログとして出力する内容（今回の場合は「System.out.println」を使用している箇所）があった方が良いかなと。
（例えば、処理の開始・終了）
実際に現場に出ると分かるようになると思いますが、結合テスト以降の処理を確認する方法として「ログを見る」ということが多々あります。
で、ログを見たときに「この処理のここまでは動いてるな、じゃあこのログの直後から次のログが出力されるところまでのどっかで落ちてるんだ」という指標になるので、結構ログ出力は重要です。」
