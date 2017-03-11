package controllers

import com.google.inject.Inject
import models.Login
import play.api.mvc.{Action, Controller}
import services.CacheService

/**
  * Created by knoldus on 10/3/17.
  */
class SignUpController @Inject()(cacheService: CacheService) extends Controller {

  def signup = Action {
    implicit request =>
      Ok(views.html.signup())

  }
  def addUser(id:String,name:String) =Action{
    implicit request =>

      cacheService.write(Login(id,name))
      Ok(views.html.login())


  }

}