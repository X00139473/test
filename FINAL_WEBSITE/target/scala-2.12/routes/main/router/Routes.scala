
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/play/ca2/conf/routes
// @DATE:Fri Dec 15 17:28:03 GMT 2017

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
  // @LINE:22
  Assets_1: controllers.Assets,
  // @LINE:24
  Assets_2: javax.inject.Provider[controllers.Assets],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:22
    Assets_1: controllers.Assets,
    // @LINE:24
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Overwatch""", """controllers.HomeController.Overwatch"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """WarThunder""", """controllers.HomeController.WarThunder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shadowOfWar""", """controllers.HomeController.ShadowOfWar"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """injustice""", """controllers.HomeController.Injustice"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stylesheets/""" + "$" + """file<.+>""", """@controllers.Assets@.at(path:String = "/public/stylesheets", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/Overwatch.png""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "Overwatch.png")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/CelticC.png""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "CelticC.png")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/OverwatchReview.png""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "OverwatchReview.png")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/warThunder1.png""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "warThunder1.png")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/shadowofwar1.png""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "shadowofwar1.png")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/Injustice.png""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "Injustice.png")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/warThunder2.png""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "warThunder2.png")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/ShadowofWarReview.png""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "ShadowofWarReview.png")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/InjusticeReview.png""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "InjusticeReview.png")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/overwatchLogo.jpg""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "overwatchLogo.jpg")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/shadowOfWar.jpg""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "shadowOfWar.jpg")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/warthunder3.jpg""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "warthunder3.jpg")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/wdd/webapps/play/ca2/public/images/injustice2.jpg""", """@controllers.Assets@.at(path:String = "/public/images", file:String = "injustice2.jpg")"""),
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
      """""",
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
  private[this] lazy val controllers_HomeController_Overwatch4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Overwatch")))
  )
  private[this] lazy val controllers_HomeController_Overwatch4_invoker = createInvoker(
    HomeController_0.Overwatch,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Overwatch",
      Nil,
      "GET",
      this.prefix + """Overwatch""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_WarThunder5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("WarThunder")))
  )
  private[this] lazy val controllers_HomeController_WarThunder5_invoker = createInvoker(
    HomeController_0.WarThunder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "WarThunder",
      Nil,
      "GET",
      this.prefix + """WarThunder""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_ShadowOfWar6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shadowOfWar")))
  )
  private[this] lazy val controllers_HomeController_ShadowOfWar6_invoker = createInvoker(
    HomeController_0.ShadowOfWar,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ShadowOfWar",
      Nil,
      "GET",
      this.prefix + """shadowOfWar""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_Injustice7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("injustice")))
  )
  private[this] lazy val controllers_HomeController_Injustice7_invoker = createInvoker(
    HomeController_0.Injustice,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Injustice",
      Nil,
      "GET",
      this.prefix + """injustice""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_Assets_at9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stylesheets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_Assets_at10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/Overwatch.png")))
  )
  private[this] lazy val controllers_Assets_at10_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/Overwatch.png""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_at11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/CelticC.png")))
  )
  private[this] lazy val controllers_Assets_at11_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/CelticC.png""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Assets_at12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/OverwatchReview.png")))
  )
  private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/OverwatchReview.png""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_at13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/warThunder1.png")))
  )
  private[this] lazy val controllers_Assets_at13_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/warThunder1.png""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Assets_at14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/shadowofwar1.png")))
  )
  private[this] lazy val controllers_Assets_at14_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/shadowofwar1.png""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Assets_at15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/Injustice.png")))
  )
  private[this] lazy val controllers_Assets_at15_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/Injustice.png""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Assets_at16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/warThunder2.png")))
  )
  private[this] lazy val controllers_Assets_at16_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/warThunder2.png""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Assets_at17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/ShadowofWarReview.png")))
  )
  private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/ShadowofWarReview.png""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Assets_at18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/InjusticeReview.png")))
  )
  private[this] lazy val controllers_Assets_at18_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/InjusticeReview.png""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Assets_at19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/overwatchLogo.jpg")))
  )
  private[this] lazy val controllers_Assets_at19_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/overwatchLogo.jpg""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Assets_at20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/shadowOfWar.jpg")))
  )
  private[this] lazy val controllers_Assets_at20_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/shadowOfWar.jpg""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Assets_at21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/warthunder3.jpg")))
  )
  private[this] lazy val controllers_Assets_at21_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/warthunder3.jpg""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Assets_at22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/wdd/webapps/play/ca2/public/images/injustice2.jpg")))
  )
  private[this] lazy val controllers_Assets_at22_invoker = createInvoker(
    Assets_2.get.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home/wdd/webapps/play/ca2/public/images/injustice2.jpg""",
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
    case controllers_HomeController_Overwatch4_route(params@_) =>
      call { 
        controllers_HomeController_Overwatch4_invoker.call(HomeController_0.Overwatch)
      }
  
    // @LINE:16
    case controllers_HomeController_WarThunder5_route(params@_) =>
      call { 
        controllers_HomeController_WarThunder5_invoker.call(HomeController_0.WarThunder)
      }
  
    // @LINE:18
    case controllers_HomeController_ShadowOfWar6_route(params@_) =>
      call { 
        controllers_HomeController_ShadowOfWar6_invoker.call(HomeController_0.ShadowOfWar)
      }
  
    // @LINE:20
    case controllers_HomeController_Injustice7_route(params@_) =>
      call { 
        controllers_HomeController_Injustice7_invoker.call(HomeController_0.Injustice)
      }
  
    // @LINE:22
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:24
    case controllers_Assets_at9_route(params@_) =>
      call(Param[String]("path", Right("/public/stylesheets")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:28
    case controllers_Assets_at10_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("Overwatch.png"))) { (path, file) =>
        controllers_Assets_at10_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:30
    case controllers_Assets_at11_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("CelticC.png"))) { (path, file) =>
        controllers_Assets_at11_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:32
    case controllers_Assets_at12_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("OverwatchReview.png"))) { (path, file) =>
        controllers_Assets_at12_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:34
    case controllers_Assets_at13_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("warThunder1.png"))) { (path, file) =>
        controllers_Assets_at13_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:36
    case controllers_Assets_at14_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("shadowofwar1.png"))) { (path, file) =>
        controllers_Assets_at14_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:38
    case controllers_Assets_at15_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("Injustice.png"))) { (path, file) =>
        controllers_Assets_at15_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:40
    case controllers_Assets_at16_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("warThunder2.png"))) { (path, file) =>
        controllers_Assets_at16_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:42
    case controllers_Assets_at17_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("ShadowofWarReview.png"))) { (path, file) =>
        controllers_Assets_at17_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:44
    case controllers_Assets_at18_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("InjusticeReview.png"))) { (path, file) =>
        controllers_Assets_at18_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:46
    case controllers_Assets_at19_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("overwatchLogo.jpg"))) { (path, file) =>
        controllers_Assets_at19_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:48
    case controllers_Assets_at20_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("shadowOfWar.jpg"))) { (path, file) =>
        controllers_Assets_at20_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:50
    case controllers_Assets_at21_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("warthunder3.jpg"))) { (path, file) =>
        controllers_Assets_at21_invoker.call(Assets_2.get.at(path, file))
      }
  
    // @LINE:52
    case controllers_Assets_at22_route(params@_) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("injustice2.jpg"))) { (path, file) =>
        controllers_Assets_at22_invoker.call(Assets_2.get.at(path, file))
      }
  }
}
