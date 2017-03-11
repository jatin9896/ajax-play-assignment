
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
"""),format.raw/*2.1*/("""<form class="form-horizontal" action="" method="post">
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
<script>

       $(document).ready(function()"""),format.raw/*93.36*/("""{"""),format.raw/*93.37*/("""
     """),format.raw/*94.6*/("""$('#submit').on("click",function()"""),format.raw/*94.40*/("""{"""),format.raw/*94.41*/("""
     """),format.raw/*95.6*/("""alert('in submit'+$('#username').val()+"  "+$('#password').val());

        routesJs.controllers.SignUpController.addUser($('#username').val(),$('#password').val()).ajax("""),format.raw/*97.103*/("""{"""),format.raw/*97.104*/("""
            """),format.raw/*98.13*/("""success: function(data)"""),format.raw/*98.36*/("""{"""),format.raw/*98.37*/("""
            """),format.raw/*99.13*/("""alert("ajax success");
            alert("data"+data)
             $('#body').html(data);
            """),format.raw/*102.13*/("""}"""),format.raw/*102.14*/(""",
            error: function(data)"""),format.raw/*103.34*/("""{"""),format.raw/*103.35*/("""
            """),format.raw/*104.13*/("""$('#body').html(data);

            """),format.raw/*106.13*/("""}"""),format.raw/*106.14*/("""
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/(""");
      """),format.raw/*108.7*/("""}"""),format.raw/*108.8*/(""");
    """),format.raw/*109.5*/("""}"""),format.raw/*109.6*/(""");
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
                  DATE: Sat Mar 11 07:19:42 IST 2017
                  SOURCE: /home/knoldus/Desktop/play-ajax-assignment/app/views/signup.scala.html
                  HASH: b62580432245970b8f0b200a711b90e3fa3d7e5a
                  MATRIX: 522->1|618->3|645->4|4115->3447|4130->3453|4179->3481|4264->3538|4293->3539|4326->3545|4388->3579|4417->3580|4450->3586|4649->3756|4679->3757|4720->3770|4771->3793|4800->3794|4841->3807|4972->3909|5002->3910|5066->3945|5096->3946|5138->3959|5203->3995|5233->3996|5270->4005|5300->4006|5337->4015|5366->4016|5401->4023|5430->4024
                  LINES: 20->1|25->1|26->2|114->90|114->90|114->90|117->93|117->93|118->94|118->94|118->94|119->95|121->97|121->97|122->98|122->98|122->98|123->99|126->102|126->102|127->103|127->103|128->104|130->106|130->106|131->107|131->107|132->108|132->108|133->109|133->109
                  -- GENERATED --
              */
          