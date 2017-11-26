
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/play/ca2/conf/routes
// @DATE:Fri Nov 24 17:41:16 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def games(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "games")
    }
  
    // @LINE:10
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:12
    def reviews(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviews")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:14
    def contact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/stylesheets"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "stylesheets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
