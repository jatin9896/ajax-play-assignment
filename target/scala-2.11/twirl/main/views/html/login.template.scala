
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


Seq[Any](format.raw/*1.1*/("""<form class="form-horizontal"  method="post">
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
            <button type="submit" class="btn btn-default" id="login">Submit</button>
        </div>
    </div>
</form>

<script type="text/javascript" src=""""),_display_(/*23.38*/routes/*23.44*/.RoutesController.routesList),format.raw/*23.72*/(""""></script>
<script>

       $(document).ready(function()"""),format.raw/*26.36*/("""{"""),format.raw/*26.37*/("""
     """),format.raw/*27.6*/("""$('#submit').on("click",function()"""),format.raw/*27.40*/("""{"""),format.raw/*27.41*/("""
     """),format.raw/*28.6*/("""alert('in Login'+$('#username').val()+"  "+$('#password').val());

        routesJs.controllers.LoginController.authenticate($('#username').val(),$('#password').val()).ajax("""),format.raw/*30.107*/("""{"""),format.raw/*30.108*/("""
            """),format.raw/*31.13*/("""success: function(data)"""),format.raw/*31.36*/("""{"""),format.raw/*31.37*/("""
            """),format.raw/*32.13*/("""alert("ajax success");
            alert("data"+data)
             $('#body').html(data);
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/(""",
            error: function(data)"""),format.raw/*36.34*/("""{"""),format.raw/*36.35*/("""
            """),format.raw/*37.13*/("""$('#body').html(data);

            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/("""
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/(""");
      """),format.raw/*41.7*/("""}"""),format.raw/*41.8*/(""");
    """),format.raw/*42.5*/("""}"""),format.raw/*42.6*/(""");
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
                  DATE: Sat Mar 11 07:19:42 IST 2017
                  SOURCE: /home/knoldus/Desktop/play-ajax-assignment/app/views/login.scala.html
                  HASH: 32bad1f7501dc8981c15cd4eb3ad314489b136fd
                  MATRIX: 609->0|1478->842|1493->848|1542->876|1627->933|1656->934|1689->940|1751->974|1780->975|1813->981|2015->1154|2045->1155|2086->1168|2137->1191|2166->1192|2207->1205|2337->1307|2366->1308|2429->1343|2458->1344|2499->1357|2563->1393|2592->1394|2628->1403|2657->1404|2693->1413|2721->1414|2755->1421|2783->1422
                  LINES: 25->1|47->23|47->23|47->23|50->26|50->26|51->27|51->27|51->27|52->28|54->30|54->30|55->31|55->31|55->31|56->32|59->35|59->35|60->36|60->36|61->37|63->39|63->39|64->40|64->40|65->41|65->41|66->42|66->42
                  -- GENERATED --
              */
          