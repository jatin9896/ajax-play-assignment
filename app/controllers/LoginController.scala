package controllers

import com.google.inject.Inject
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

}