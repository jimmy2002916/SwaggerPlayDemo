package controllers

import io.swagger.annotations.Api
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def redirectDocs = Action {
    // localhost should change to the url you are using in order for the whole Demo working.
    Redirect("/assets/lib/swagger-ui/index.html?/url=http://localhost:9000/swagger.json") 
  }
}
