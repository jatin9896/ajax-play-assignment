
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Desktop/play-ajax-assignment/conf/routes
// @DATE:Sat Mar 11 07:19:42 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
