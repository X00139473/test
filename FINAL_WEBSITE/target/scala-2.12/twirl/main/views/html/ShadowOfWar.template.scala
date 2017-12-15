
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

object ShadowOfWar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>

<<head>
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
		<h3>Shadow of War</h3>
		
		<p>Like Shadow of Mordor before it, Middle-earth: Shadow of War is so much more than just another open-world action game with Batman’s combat. Its amazing Nemesis system makes almost every encounter with a named enemy a memorable battle, and the new fortress sieges give it legs beyond the campaign through asynchronous multiplayer.

This story plays just as fast and loose with Lord of the Rings’ lore as the last time. It picks up after the conjoined spirits of ancient elf lord Celebrimbor and Aragorn stunt double Talion forge a new Ring of Power… and immediately lose it. Their beefs with the weirdly sexy human form of the giant spider Shelob, the Witch King, and even Sauron himself (again) feel drawn out and filled with plenty of clunky, derivative dialogue, but there are some strong moments.</p>
	<a class ="wt"><img src="/home/wdd/webapps/play/ca2/public/images/ShadowofWarReview.png" alt="Shadow of War"/></a>
			<p>Flashbacks to the Ringwraiths’ corruption give the ghostly Nazgul a tragic side, battles with the fiery Balrog are big on spectacle, and witnessing the founding of Minas Morgul (several hundred years later than J.R.R Tolkien suggested) are all standouts – if you can stomach the non-canon version of events. A growing conflict between the stoic and pragmatic Celebrimbor and the empathetic and Gondor-loyal Talion adds some depth to both characters, though with all the setup I was expecting a choice between their philosophies that never came. And there are a few original characters, especially the returning Ratbag, who provide some decent comic relief in the absence of dwarves or hobbits.
			The story goes to interesting places – visually, at least. Each of Shadow of War’s five zones looks markedly different, and fast-traveling between the icy mountains of Sergost to the green swamps of Nurnen and the volcanic Gorgoroth gives it a good sense of variety. Each area is full of ruins and other structures to climb on and tunnels to explore, plus an urban Fortress area unlike anything in Shadow of Mordor’s map. On the other hand, that variety is only skin deep: all the locations are functionally identical (there are no effects of heat or cold and no unique conditions) and each one is inhabited by the same types of enemies and wildlife. And their beauty is sometimes disfigured by some nasty pop-in that can leave terrain textures looking almost literally like something out of Minecraft – it’s especially pronounced on stone walls in ruins. (From time to time I’ve also spotted enemies with completely blank faces that pop in after a few moments.)</p>
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
                  SOURCE: /home/wdd/webapps/play/ca2/app/views/ShadowOfWar.scala.html
                  HASH: 6df7a578bcb857c3ed6211ce85f1a047f335ee67
                  MATRIX: 1036->0
                  LINES: 33->1
                  -- GENERATED --
              */
          