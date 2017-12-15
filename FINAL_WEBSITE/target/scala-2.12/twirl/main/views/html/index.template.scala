
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: 	String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
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
		<li class="active"><a href="/">Home</a></li>
		<li><a href="/games">Games</a></li>
		<li ><a href="/about">About Us</a></li>
		<li><a href="/reviews">Reviews</a></li>
	  </ul>
	</div>
</nav>

<body>
	<div class = "games">
	<h3>Games</h3>
	  <a href="/Overwatch"><img src="/home/wdd/webapps/play/ca2/public/images/Overwatch.png" alt="Overwatch"/></a>
		<a href="/WarThunder"><img src="/home/wdd/webapps/play/ca2/public/images/warThunder1.png" alt="War Thunder"/></a>
		<a href="/shadowOfWar"><img src="/home/wdd/webapps/play/ca2/public/images/shadowofwar1.png" alt="Shadow of War"/></a>
		<a href="/injustice"><img src="/home/wdd/webapps/play/ca2/public/images/Injustice.png" alt="Injustice"/></a>
	</div>

	<div class = "about">
		<h3>About</h3>
		<p>Welcome to Celtic Games! A website created to bring you reliable reviews of the most recent video games. Read more about us by clicking <a href="/about">here</a>.</p>
	</div>

	<div class = "reviews">
		<h3>Reviews</h3>
		<p>You can see to the right the games that have already been reviewed.  Feel free to submit your own reviews by going to the <a href="/reviews">Reviews</a> page.</p>

	</div>

</body>

<footer>
    <p>© Celtic Games</p>
</footer>

</div>

</html>

"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 17:19:59 GMT 2017
                  SOURCE: /home/wdd/webapps/play/ca2/app/views/index.scala.html
                  HASH: 4b47c05fc9b23762fef8919cd9284ab02826da82
                  MATRIX: 948->1|1061->19|1089->21
                  LINES: 28->1|33->1|35->3
                  -- GENERATED --
              */
          