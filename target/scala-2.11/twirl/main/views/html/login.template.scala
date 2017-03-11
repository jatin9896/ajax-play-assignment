
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
</form>"""))
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
                  DATE: Sat Mar 11 01:06:33 IST 2017
                  SOURCE: /home/knoldus/Desktop/play-ajax-assignment/app/views/login.scala.html
                  HASH: ed380abcd4f208d03fa1f473db0e2d9d84a10957
                  MATRIX: 609->0
                  LINES: 25->1
                  -- GENERATED --
              */
          