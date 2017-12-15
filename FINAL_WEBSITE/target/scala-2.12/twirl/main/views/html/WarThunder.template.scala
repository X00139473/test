
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

object WarThunder extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>

		<head>
				<title>Celtic Games - Video Game Reviews</title>
				<link rel="icon" href="/home/wdd/webapps/play/ca2/public/images/CelticC.png"/>
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
			<li class="active"><a href="/games">Games</a></li>
			<li ><a href="/about">About Us</a></li>
			<li><a href="/reviews">Reviews</a></li>
		  </ul>
		</div>
	</nav>

<body>


	<div class = "review">
		<h3>War Thunder</h3>
		
		<p>War Thunder is a Massively Multiplayer Online (MMO) combat game, and you guessed it, set during World War II.
		It is free-to-play, but of course, comes with the usual option to buy various vehicle packs and upgrades which 
		will speed up your progress; however, thankfully there is no cap which you find on many games that are free-to-play.
		If you put the hours into War Thunder (and boy will it take a lot of hours), you can fully unlock everything the game 
		has to offer, which is more than 800 aircraft and heavily armoured ground vehicles from the Soviet Union, United States,
		Nazi Germany, the Japanese Empire and the United Kingdom. Italy and Romania are also featured in War Thunder but only with
		the ground based vehicles. Many of the arenas (maps) you will be fighting in are also influenced from real life battles 
		which took place during WWII, so you can expect to dogfight over the Pacific and shoot it out, tank vs tank, in mainland Europe.</p>
	<a class ="wt"><img src="/home/wdd/webapps/play/ca2/public/images/warThunder2.png" alt="War Thunder2"/></a>
			<p>Whether in the sky or on the ground, the 16v16 matches are filled with beautiful vehicle models 
		that bring these classic machines to life. Creeping across the vibrant landscapes in a tank was great 
		but my favorite moments would occur as I crested a mountain and rays of light would wash over my aircraft.

		Game types range from Domination to Ground Attack, and each has multiple objectives for different roles to complete, so you aren’t stuck doing the same thing repeatedly. Often times I would fly my Boston Mk1 bomber during Domination maps to lay waste to NPCs on the ground with hefty 500lb bombs, while my allies in more agile fighter planes handled base capture. Proper team communication, like calling for allies 
		to shoot a fighter off my tail, is 
		essential for success – especially true when playing in one of the harder modes.</p>
		<p> This game is masterpiece and we can confidently recommend it to any gamer out there. </p>
		
	
	</div>


</body>

<footer>
    <p>Copyright/Contacts Here</p>
</footer>

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
                  DATE: Fri Dec 15 17:31:52 GMT 2017
                  SOURCE: /home/wdd/webapps/play/ca2/app/views/WarThunder.scala.html
                  HASH: 7aeb25ebd9f1232e01300c61819fdc184d38b255
                  MATRIX: 1035->0
                  LINES: 33->1
                  -- GENERATED --
              */
          