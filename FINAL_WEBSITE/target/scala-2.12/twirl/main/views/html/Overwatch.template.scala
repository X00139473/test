
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

object Overwatch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
				<li class="active"><a href="/games">Games</a></li>
				<li ><a href="/about">About Us</a></li>
				<li><a href="/reviews">Reviews</a></li>
				</ul>
			</div>
		</nav>

<body>


	<div class = "review">
		<h3>Overwatch</h3>
		
		<p>Overwatch exists at an intersection between design and artistry, a crossroad at which pure tactile joy meets refined, intelligent design to create a rare spark of magic. As a 6v6 multiplayer, objective-based shooter, it finds accessibility not by lowering the skill ceiling, but by broadening the definition of skill. The person with deadshot aim is no more valuable than the person with the decision-making ability to know when a well-timed ability will turn an engagement, or the person with the map-sense to find the optimal locations to place sentry turrets. While it didn't exactly drown me in options, maps, and modes, it’s blessed with a multitude of tactical layers, and none of them ever came between me and my enjoyment of its intense, swirling teamfights, and thrilling overtime comebacks.</p>
	<a class ="wt"><img src="/home/wdd/webapps/play/ca2/public/images/OverwatchReview.png" alt="Overwatch"/></a>
			<p>Overwatch does a great many things well, but above all else, its success is built on the backs of its many excellent characters. It’s fitting that the main menu is dominated by one of them at all times; their diverse appearances, 
				origins, and personalities are all laid bare with every pose they strike.
				Reinhardt’s rocket hammer lands on his shoulder with a meaty clank that invokes a broadsword resting against a medieval knight’s plate armor,
				and Tracer’s jovial smile is just briefly interrupted by a rebellious bang that slides across her face, tempting her to blow it back into place before re-addressing the camera and blinking all over the place.
			  There’s an intelligent gorilla scientist, a lithe, blue-skinned assassin, and a cybernetic, zen-practicing healer too. It speaks volumes that the one character that adheres to well-worn shooter tropes feels like the
				odd man out here. They’re all so different that you’d imagine them looking silly standing next to one another, but through careful, subtle visual cues baked into their equipment and attire, they manage to appear as if they share a common world, even if they all hail from different corners of it.</p>
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
                  SOURCE: /home/wdd/webapps/play/ca2/app/views/Overwatch.scala.html
                  HASH: 1299ceeb923ac3d1af6cf430e57aedfb53a5333d
                  MATRIX: 1034->0
                  LINES: 33->1
                  -- GENERATED --
              */
          