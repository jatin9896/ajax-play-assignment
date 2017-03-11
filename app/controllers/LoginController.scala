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
      Console.println("Inside authenticate")
      println("id "+id+"password "+pass)
      if(cacheService.contains(id)){
        val output= cacheService.read(id)
        if(pass==output.pass){
          println("login passed")
          Ok("success")
        }
        else {
          println("Authentication issue wrong password")
          Ok("failure")
        }
      }
      else{
      Ok("no such user")
      }
  }

}