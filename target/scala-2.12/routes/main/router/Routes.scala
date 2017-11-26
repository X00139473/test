
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/play/ca2/conf/routes
// @DATE:Fri Nov 24 17:41:16 GMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:17
  Assets_1: controllers.Assets,
  // @LINE:19
  Assets_2: javax.inject.Provider[controllers.Assets],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:17
    Assets_1: controllers.Assets,
    // @LINE:19
    Assets_2: javax.inject.Provider[controllers.Assets]
  ) = this(errorHandler, HomeController_0, Assets_1, Assets_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """games""", """controllers.HomeController.games"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviews""", """controllers.HomeController.reviews"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.HomeController.contact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stylesheets/""" + "$" + """file<.+>""", """@controllers.Assets@.at(path:String = "/public/stylesheets", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_games1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("games")))
  )
  private[this] lazy val controllers_HomeController_games1_invoker = createInvoker(
    HomeController_0.games,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "games",
      Nil,
      "GET",
      this.prefix + """games""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_about2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about2_invoker = createInvoker(
    HomeController_0.about,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_reviews3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviews")))
  )
  private[this] lazy val controllers_HomeController_reviews3_invoker = createInvoker(
    HomeController_0.reviews,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "reviews",
      Nil,
      "GET",
      this.prefix + """reviews""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_contact4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_HomeController_contact4_invoker = createInvoker(
    HomeController_0.contact,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contact",
      Nil,
      "GET",
      this.prefix + """contact""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_at6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stylesheets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """stylesheets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:8
    case controllers_HomeController_games1_route(params@_) =>
      call { 
        controllers_HomeController_games1_invoker.call(HomeController_0.games)
      }
  
    // @LINE:10
    case controllers_HomeController_about2_route(params@_) =>
      call { 
        controllers_HomeController_about2_invoker.call(HomeController_0.about)
      }
  
    // @LINE:12
    case controllers_HomeController_reviews3_route(params@_) =>
      call { 
        controllers_HomeController_reviews3_invoker.call(HomeController_0.reviews)
      }
  
    // @LINE:14
    case controllers_HomeController_contact4_route(params@_) =>
      call { 
        controllers_HomeController_contact4_invoker.call(HomeController_0.contact)
      }
  
    // @LINE:17
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:19
    case controllers_Assets_at6_route(params@_) =>
      call(Param[String]("path", Right("/public/stylesheets")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(Assets_2.get.at(path, file))
      }
  }
}
