
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object navbar_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class navbar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(status: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.versioned("stylesheets/main.css")),format.raw/*3.93*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(/*4.51*/routes/*4.57*/.Assets.versioned("images/favicon.png")),format.raw/*4.96*/("""">
<link rel="stylesheet" href=""""),_display_(/*5.31*/routes/*5.37*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*5.85*/("""">
<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.versioned("javascripts/hello.js")),format.raw/*6.62*/("""" type="text/javascript")"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.versioned("bootstrap/jquery.min.js")),format.raw/*7.65*/("""" type="text/javascript")"></script>
<script type='text/javascript' src=""""),_display_(/*8.38*/routes/*8.44*/.Assets.versioned("bootstrap/js/bootstrap.js")),format.raw/*8.90*/(""""></script>

<script type="text/javascript" src=""""),_display_(/*10.38*/routes/*10.44*/.RoutesController.routesList),format.raw/*10.72*/(""""></script>
<script type="text/javascript">

$(document).ready(function()"""),format.raw/*13.29*/("""{"""),format.raw/*13.30*/("""
    """),format.raw/*14.5*/("""$('#signup').on("click",function()"""),format.raw/*14.39*/("""{"""),format.raw/*14.40*/("""

        """),format.raw/*16.9*/("""routesJs.controllers.SignUpController.signup().ajax("""),format.raw/*16.61*/("""{"""),format.raw/*16.62*/("""
            """),format.raw/*17.13*/("""success: function(data)"""),format.raw/*17.36*/("""{"""),format.raw/*17.37*/("""
            """),format.raw/*18.13*/("""$('#sign').html(data);
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/(""",
            error: function()"""),format.raw/*20.30*/("""{"""),format.raw/*20.31*/("""
            """),format.raw/*21.13*/("""$('#body').html("hello");
            alert("fail")
            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/("""

        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/(""");
    """),format.raw/*26.5*/("""}"""),format.raw/*26.6*/(""");
    $('#login').on("click",function()"""),format.raw/*27.38*/("""{"""),format.raw/*27.39*/("""

        """),format.raw/*29.9*/("""routesJs.controllers.LoginController.login().ajax("""),format.raw/*29.59*/("""{"""),format.raw/*29.60*/("""
            """),format.raw/*30.13*/("""success: function(data)"""),format.raw/*30.36*/("""{"""),format.raw/*30.37*/("""
            """),format.raw/*31.13*/("""$('#logindiv').html(data);
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/(""",
            error: function()"""),format.raw/*33.30*/("""{"""),format.raw/*33.31*/("""
            """),format.raw/*34.13*/("""$('#body').html("hello");
            alert("fail")
            """),format.raw/*36.13*/("""}"""),format.raw/*36.14*/("""

        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/(""");
    """),format.raw/*39.5*/("""}"""),format.raw/*39.6*/(""");
    """),format.raw/*40.5*/("""}"""),format.raw/*40.6*/(""");
</script>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">WebSiteName</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#">Page 1</a></li>
            <li><a href="#">Page 2</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#" id="signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            <li><a id="login" href="#">
                <button ><span class="glyphicon glyphicon-log-in"></span> """),_display_(/*56.76*/status),format.raw/*56.82*/("""</button>
            </a></li>
        </ul>
    </div>
</nav>
<div id="sign"></div>
<div id="logindiv"></div>"""))
      }
    }
  }

  def render(status:String): play.twirl.api.HtmlFormat.Appendable = apply(status)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (status) => apply(status)

  def ref: this.type = this

}


}

/**/
object navbar extends navbar_Scope0.navbar
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 14:29:30 IST 2017
                  SOURCE: /home/knoldus/Desktop/play-ajax-assignment/app/views/navbar.scala.html
                  HASH: 9651778b919d18dcdf50a206d9684f38e65fcd74
                  MATRIX: 529->1|640->17|668->19|739->64|753->70|814->111|893->164|907->170|966->209|1025->242|1039->248|1107->296|1150->313|1164->319|1225->360|1302->411|1316->417|1380->461|1480->535|1494->541|1560->587|1637->637|1652->643|1701->671|1802->744|1831->745|1863->750|1925->784|1954->785|1991->795|2071->847|2100->848|2141->861|2192->884|2221->885|2262->898|2325->933|2354->934|2413->965|2442->966|2483->979|2575->1043|2604->1044|2641->1054|2670->1055|2704->1062|2732->1063|2800->1103|2829->1104|2866->1114|2944->1164|2973->1165|3014->1178|3065->1201|3094->1202|3135->1215|3202->1254|3231->1255|3290->1286|3319->1287|3360->1300|3452->1364|3481->1365|3518->1375|3547->1376|3581->1383|3609->1384|3643->1391|3671->1392|4357->2051|4384->2057
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|28->4|28->4|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|34->10|34->10|34->10|37->13|37->13|38->14|38->14|38->14|40->16|40->16|40->16|41->17|41->17|41->17|42->18|43->19|43->19|44->20|44->20|45->21|47->23|47->23|49->25|49->25|50->26|50->26|51->27|51->27|53->29|53->29|53->29|54->30|54->30|54->30|55->31|56->32|56->32|57->33|57->33|58->34|60->36|60->36|62->38|62->38|63->39|63->39|64->40|64->40|80->56|80->56
                  -- GENERATED --
              */
          