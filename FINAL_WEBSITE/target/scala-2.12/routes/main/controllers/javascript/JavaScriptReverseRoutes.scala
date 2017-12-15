
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/play/ca2/conf/routes
// @DATE:Fri Dec 15 17:28:03 GMT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def games: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.games",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games"})
        }
      """
    )
  
    // @LINE:10
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:18
    def ShadowOfWar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ShadowOfWar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shadowOfWar"})
        }
      """
    )
  
    // @LINE:14
    def Overwatch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Overwatch",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Overwatch"})
        }
      """
    )
  
    // @LINE:16
    def WarThunder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.WarThunder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "WarThunder"})
        }
      """
    )
  
    // @LINE:12
    def reviews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.reviews",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviews"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:20
    def Injustice: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Injustice",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "injustice"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(path0,file1) {
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/stylesheets") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stylesheets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("Overwatch.png") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/Overwatch.png"})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("CelticC.png") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/CelticC.png"})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("OverwatchReview.png") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/OverwatchReview.png"})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("warThunder1.png") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/warThunder1.png"})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("shadowofwar1.png") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/shadowofwar1.png"})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("Injustice.png") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/Injustice.png"})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("warThunder2.png") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/warThunder2.png"})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("ShadowofWarReview.png") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/ShadowofWarReview.png"})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("InjusticeReview.png") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/InjusticeReview.png"})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("overwatchLogo.jpg") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/overwatchLogo.jpg"})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("shadowOfWar.jpg") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/shadowOfWar.jpg"})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("warthunder3.jpg") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/warthunder3.jpg"})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/images") + """ && file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("injustice2.jpg") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/wdd/webapps/play/ca2/public/images/injustice2.jpg"})
          }
        
        }
      """
    )
  
    // @LINE:22
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
