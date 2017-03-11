
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<form class="form-horizontal" action="" method="get">
    <div class="form-group">
        <label class="control-label col-sm-2" for="firstName">First Name:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter First Name">
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-2" for="midName">Middle Name:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="midName" name="midName" placeholder="Enter Middle Name">
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-2" for="lastName">Last Name:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="lastName"  name="lastName" placeholder="Enter Last Name">
        </div>
    </div>

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
        <label class="control-label col-sm-2" for="pwdCheck">Confirm Password:</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="pwdCheck" placeholder="Enter password again">
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-2" for="mobile">Mobile:</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="mobile" name="mobile" placeholder="Enter mobile number">
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-2" for="gender">Gender:</label>
        <div class="col-sm-2">
            <select name="gender" id="gender" name="gender" >
                <option value="male" >M</option>
                <option value="female">F</option>
            </select>
        </div>
        <div class="col-sm-2">

        </div>

        <label class="control-label col-sm-2" for="age">Age:</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" id="age" name="age" placeholder="Enter age">
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-2" for="hobbies">Hobbies:</label>
        <div class="col-sm-10">
            <select name="hobbies" id="hobbies" size=4 multiple>
                <option value='blue'>Blue</option>
                <option value='green'>Green</option>
                <option value='red'>Red</option>
                <option value='yellow'>Yellow</option>
                <option value='' selected>Select a Color </option>
                <option value='white'>White</option>
            </select>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default" id="submit">Submit</button>
        </div>
    </div>
</form>
<script type="text/javascript" src=""""),_display_(/*90.38*/routes/*90.44*/.RoutesController.routesList),format.raw/*90.72*/(""""></script>
<script type="text/javascript">
       $(document).ready(function()"""),format.raw/*92.36*/("""{"""),format.raw/*92.37*/("""
     """),format.raw/*93.6*/("""$('#submit').on("click",function()"""),format.raw/*93.40*/("""{"""),format.raw/*93.41*/("""
           """),format.raw/*94.12*/("""routesJs.controllers.SignUpController.addUser($('#username').val(),$('#password').val()).ajax("""),format.raw/*94.106*/("""{"""),format.raw/*94.107*/("""
            """),format.raw/*95.13*/("""success: function(data)"""),format.raw/*95.36*/("""{"""),format.raw/*95.37*/("""
            """),format.raw/*96.13*/("""alert("ajax success");
             $('#body').html(data);
            """),format.raw/*98.13*/("""}"""),format.raw/*98.14*/(""",
            error: function(data)"""),format.raw/*99.34*/("""{"""),format.raw/*99.35*/("""
            """),format.raw/*100.13*/("""$('#body').html(data);
            """),format.raw/*101.13*/("""}"""),format.raw/*101.14*/("""
        """),format.raw/*102.9*/("""}"""),format.raw/*102.10*/(""");
      """),format.raw/*103.7*/("""}"""),format.raw/*103.8*/(""");
    """),format.raw/*104.5*/("""}"""),format.raw/*104.6*/(""");
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
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Sat Mar 11 14:47:32 IST 2017
                  SOURCE: /home/knoldus/Desktop/play-ajax-assignment/app/views/signup.scala.html
                  HASH: 72bedf7d00bbeda6d3609c424723ee57a687c778
                  MATRIX: 522->1|618->3|645->4|4114->3446|4129->3452|4178->3480|4285->3559|4314->3560|4347->3566|4409->3600|4438->3601|4478->3613|4601->3707|4631->3708|4672->3721|4723->3744|4752->3745|4793->3758|4892->3829|4921->3830|4984->3865|5013->3866|5055->3879|5119->3914|5149->3915|5186->3924|5216->3925|5253->3934|5282->3935|5317->3942|5346->3943
                  LINES: 20->1|25->1|26->2|114->90|114->90|114->90|116->92|116->92|117->93|117->93|117->93|118->94|118->94|118->94|119->95|119->95|119->95|120->96|122->98|122->98|123->99|123->99|124->100|125->101|125->101|126->102|126->102|127->103|127->103|128->104|128->104
                  -- GENERATED --
              */
          