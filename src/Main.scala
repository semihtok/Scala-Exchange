//Semih Tok - Basic exchange calculation with Scala
object Main {

  def main(args: Array[String]): Unit = {
    
    // default parameters
    var source:String = "USD"
    var target:String = "EUR"
    var amount = 1
    var key:String = "your-api-key" //Please change here with your API key.

    var url = "http://currency-api.appspot.com/api/"+ source +"/" + target + ".json?key="+ key
    var data = scala.io.Source.fromURL(url).mkString
    
    var result = scala.util.parsing.json.JSON.parseFull(data)
    println(result)
  }
}
