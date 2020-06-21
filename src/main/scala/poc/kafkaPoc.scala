package poc

object kafkaPoc {
  def main(args: Array[String]): Unit = {
    print("kafka poc...")
    val salaries = Seq(1000,11000,12000)
    val doublesal = (x: Int) => x * 2
    //val newsal = salaries.map(doublesal)
    //val newsal = salaries.map( x => x *2)
    val newsal = salaries.map( _ * 2)
    print(newsal)
    println("--------------")

    val domainName = "www.learningscala.com"
    def getURL = urlBuilder(ssl=true, domainName)
    println("output of 1st fun:"+getURL)
    val endpoint = "admin"
    val query = "user=3"
    val url = getURL(endpoint, query)
    print("URL is:: "+url)
  }

  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }



}
