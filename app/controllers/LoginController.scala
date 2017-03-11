package controllers

import com.google.inject.Inject
import models.Login
import play.api.mvc.{Action, Controller}
import services.CacheService

/**
  * Created by knoldus on 10/3/17.
  */
class LoginController @Inject()(cacheService: CacheService) extends Controller {

  def login = Action {
    implicit request =>
      Ok(views.html.login())

  }
  def authenticate(id:String,pass:String)=Action {
    implicit request =>
      if(cacheService.contains(id)){
        val output= cacheService.read(id)
        if(pass==output.pass)
          Ok(views.html.login())
        else
          Ok("Authentication issue wrong password")
        Ok(views.html.signup())
      }
      else{
      Ok("no such user")
      }
  }

}