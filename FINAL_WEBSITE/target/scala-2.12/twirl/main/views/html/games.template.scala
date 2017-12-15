
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object games extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>

<head>
	<title>Celtic Games - Video Game Reviews</title>
	<link rel="icon" href="Images/CelticC.png"/>
	<meta content="en-ie" http-equiv="Content-Language" />
	<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
	<link href='https://fonts.googleapis.com/css?family=Rye' rel='stylesheet'>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link href="/stylesheets/style.css" rel="stylesheet" type="text/css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<div class = "container">

    <header>
        <h1><img src="/home/wdd/webapps/play/ca2/public/images/CelticC.png" />eltic Games</h1> 
    </header>

<nav class="navbar navbar-default">
	<div class="container-fluid">
	  <ul class="nav navbar-nav">
		<li><a href="/">Home</a></li>
		<li  class="active"><a href="/games">Games</a></li>
		<li><a href="/about">About Us</a></li>
		<li><a href="/reviews">Reviews</a></li>
	  </ul>
	</div>
</nav>

<body>
    <div class = "gamesMain">
    <h3><a href="/Overwatch">Overwatch</a></h3>
        <p>Overwatch is a First Person Shooter developed by Blizzard Entertainment that has been taking the world by storm as of late.
            Here we break down why it has become such a phenonomen
            <img src="/home/wdd/webapps/play/ca2/public/images/overwatchLogo.jpg" alt="Overwatch"/>
        </p>

        <h3><a href="/shadowOfWar">Shadow Of War</a></h3>
        <p>Shadow of War is an Open World Action/Adventure game by Monolith Productions.
            It's set the J.R.R Tolkien's Middle Earth universe before the events of The Lord of Rings Trilogy.
            <img src="/home/wdd/webapps/play/ca2/public/images/shadowOfWar.jpg" alt="Shadow Of War"/>
        </p>

        <h3><a href="/injustice">Injustice</a></h3>
        <p>Injustice is a Fighting game created by NetherRealm Studios. Set in an alternate DC Comics Universe where superman has gone rogue
            and begun killing other superheroes
            <img src="/home/wdd/webapps/play/ca2/public/images/injustice2.jpg" alt="Injustice"/>
        </p>

        <h3><a href="/WarThunder">War Thunder</a></h3>
        <p>War Thunder is a Simulation/Vehicle Combat MMO developed by Gaijin Entertainment. Where you take control of either an Tank or Plane
            and fight other players in large scale battles.
            <img src="/home/wdd/webapps/play/ca2/public/images/warthunder3.jpg" alt="War Thunder"/>
        </p>
    </div>
</body>

</div>

</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 17:29:54 GMT 2017
                  SOURCE: /home/wdd/webapps/play/ca2/app/views/games.scala.html
                  HASH: 12fda04d6048e86d954d94884139a41da80f4570
                  MATRIX: 1030->0
                  LINES: 33->1
                  -- GENERATED --
              */
          