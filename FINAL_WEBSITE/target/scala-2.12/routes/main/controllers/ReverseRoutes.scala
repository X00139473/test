
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/play/ca2/conf/routes
// @DATE:Fri Dec 15 17:28:03 GMT 2017

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
  
    // @LINE:18
    def ShadowOfWar(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "shadowOfWar")
    }
  
    // @LINE:14
    def Overwatch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Overwatch")
    }
  
    // @LINE:16
    def WarThunder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "WarThunder")
    }
  
    // @LINE:12
    def reviews(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviews")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:20
    def Injustice(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "injustice")
    }
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def at(path:String, file:String): Call = {
    
      (path: @unchecked, file: @unchecked) match {
      
        // @LINE:24
        case (path, file) if path == "/public/stylesheets" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/stylesheets"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "stylesheets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
        // @LINE:28
        case (path, file) if path == "/public/images" && file == "Overwatch.png" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "Overwatch.png"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/Overwatch.png")
      
        // @LINE:30
        case (path, file) if path == "/public/images" && file == "CelticC.png" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "CelticC.png"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/CelticC.png")
      
        // @LINE:32
        case (path, file) if path == "/public/images" && file == "OverwatchReview.png" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "OverwatchReview.png"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/OverwatchReview.png")
      
        // @LINE:34
        case (path, file) if path == "/public/images" && file == "warThunder1.png" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "warThunder1.png"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/warThunder1.png")
      
        // @LINE:36
        case (path, file) if path == "/public/images" && file == "shadowofwar1.png" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "shadowofwar1.png"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/shadowofwar1.png")
      
        // @LINE:38
        case (path, file) if path == "/public/images" && file == "Injustice.png" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "Injustice.png"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/Injustice.png")
      
        // @LINE:40
        case (path, file) if path == "/public/images" && file == "warThunder2.png" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "warThunder2.png"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/warThunder2.png")
      
        // @LINE:42
        case (path, file) if path == "/public/images" && file == "ShadowofWarReview.png" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "ShadowofWarReview.png"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/ShadowofWarReview.png")
      
        // @LINE:44
        case (path, file) if path == "/public/images" && file == "InjusticeReview.png" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "InjusticeReview.png"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/InjusticeReview.png")
      
        // @LINE:46
        case (path, file) if path == "/public/images" && file == "overwatchLogo.jpg" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "overwatchLogo.jpg"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/overwatchLogo.jpg")
      
        // @LINE:48
        case (path, file) if path == "/public/images" && file == "shadowOfWar.jpg" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "shadowOfWar.jpg"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/shadowOfWar.jpg")
      
        // @LINE:50
        case (path, file) if path == "/public/images" && file == "warthunder3.jpg" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "warthunder3.jpg"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/warthunder3.jpg")
      
        // @LINE:52
        case (path, file) if path == "/public/images" && file == "injustice2.jpg" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/images"), ("file", "injustice2.jpg"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "home/wdd/webapps/play/ca2/public/images/injustice2.jpg")
      
      }
    
    }
  
    // @LINE:22
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
