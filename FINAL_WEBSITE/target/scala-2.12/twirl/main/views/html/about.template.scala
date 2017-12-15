
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
		<li><a href="/games">Games</a></li>
		<li class="active"><a href="/about">About Us</a></li>
		<li><a href="/reviews">Reviews</a></li>
	  </ul>
	</div>
</nav>

<body>

<div class="about">
<h2>About Celtic Games</h2>
<p>We are Celtic Games, a small business based in the heart of Dublin, Ireland. Our team consists of 3 people, all equally motivated to bring you the most trustworthy and sensible reviews of the most
	recent video games. </p>
	
<p>With your help, we hope to become much larger so that we can provide you with more reviews on the games you are most intrigued about.</p>
</div>
<div class="about">
<h2>Our Team's Roles</h2>
<h4>Ben O'Flaherty</h4>
<p>Editor</p>
<h4>Cathal O'Keeffe</h4>
<p>Chief Executive Officer</p>
<h4>Peter McMahon</h4>
<p>Community & Social Coordinator</p>
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
                  DATE: Fri Dec 15 16:47:28 GMT 2017
                  SOURCE: /home/wdd/webapps/play/ca2/app/views/about.scala.html
                  HASH: 735c9b337831bac11787f2c01174d4cd6154ba48
                  MATRIX: 1030->0
                  LINES: 33->1
                  -- GENERATED --
              */
          