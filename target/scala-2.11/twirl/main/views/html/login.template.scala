
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<form class="form-horizontal"  method="get">
    <div class="form-group">
        <label class="control-label col-sm-2" for="username">UserName:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="username" name="username" placeholder="Enter username">
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-2" for="password">Password:</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="password" name="password" placeholder="Enter password">
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default" id="login1">Submit</button>
        </div>
    </div>
</form>

<script type="text/javascript" src=""""),_display_(/*23.38*/routes/*23.44*/.RoutesController.routesList),format.raw/*23.72*/(""""></script>
<script type="text/javascript">

       $(document).ready(function()"""),format.raw/*26.36*/("""{"""),format.raw/*26.37*/("""
       """),format.raw/*27.8*/("""alert('script loaded')
     $('#login1').click(function()"""),format.raw/*28.35*/("""{"""),format.raw/*28.36*/("""
     """),format.raw/*29.6*/("""alert('Inside login')
           routesJs.controllers.LoginController.authenticate($('#username').val(),$('#password').val()).ajax("""),format.raw/*30.110*/("""{"""),format.raw/*30.111*/("""
            """),format.raw/*31.13*/("""success: function(data)"""),format.raw/*31.36*/("""{"""),format.raw/*31.37*/("""
            """),format.raw/*32.13*/("""alert("ajax success");
            alert("login "+data)

            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/(""",
            error: function(data)"""),format.raw/*36.34*/("""{"""),format.raw/*36.35*/("""
            """),format.raw/*37.13*/("""alert("ajax fail")
            $('#body').html(data);

            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/("""
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/(""");
      """),format.raw/*42.7*/("""}"""),format.raw/*42.8*/(""");
    """),format.raw/*43.5*/("""}"""),format.raw/*43.6*/(""");
</script>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 14:43:38 IST 2017
                  SOURCE: /home/knoldus/Desktop/play-ajax-assignment/app/views/login.scala.html
                  HASH: c53920f6737b6b52877a085aeb9ebdb0b887cde1
                  MATRIX: 609->0|1478->842|1493->848|1542->876|1650->956|1679->957|1714->965|1799->1022|1828->1023|1861->1029|2021->1160|2051->1161|2092->1174|2143->1197|2172->1198|2213->1211|2310->1280|2339->1281|2402->1316|2431->1317|2472->1330|2567->1397|2596->1398|2632->1407|2661->1408|2697->1417|2725->1418|2759->1425|2787->1426
                  LINES: 25->1|47->23|47->23|47->23|50->26|50->26|51->27|52->28|52->28|53->29|54->30|54->30|55->31|55->31|55->31|56->32|59->35|59->35|60->36|60->36|61->37|64->40|64->40|65->41|65->41|66->42|66->42|67->43|67->43
                  -- GENERATED --
              */
          