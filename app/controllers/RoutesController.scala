package controllers


import play.api.mvc.{Action, Controller}
import play.api.i18n.MessagesApi
import play.api.routing.JavaScriptReverseRouter
import services.CacheService
import com.google.inject.Inject
class RoutesController @Inject()(cacheService: CacheService)(implicit val messagesApi: MessagesApi) extends Controller {


  def routesList = Action {
    implicit request =>
    Ok(     JavaScriptReverseRouter("routesJs")(
        routes.javascript.SignUpController.signup,
        routes.javascript.LoginController.login,
        routes.javascript.SignUpController.addUser
      )
    ).as("text/javascript")
  }
}

