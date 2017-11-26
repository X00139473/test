
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
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>

<head>
	<title>Celtic Games - Video Game Reviews</title>
	<meta content="en-ie" http-equiv="Content-Language" />
	<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
	<link href='https://fonts.googleapis.com/css?family=Rye' rel='stylesheet'>
  <link href="/stylesheets/style.css" rel="stylesheet" type="text/css" />
  
</head>

<div class = "container">

<header>
        <h1>Celtic Games</h1>
        
</header>

<body>
	<nav>
		  <a class="active" href="/">Home</a>
			<a href="/games">Games</a>
			<a href="/about">About Us</a>
			<a href="/reviews">Reviews</a>
			<a href="/contact">Contact Us</a>
			
	</nav>

	<div class = "games">
		<h3>"""),_display_(/*32.8*/message),format.raw/*32.15*/("""</h3>
		<table>
			<tr>
			  <th>Game</th>
			  <th>System</th> 
			  <th>Our Rating</th>
			</tr>
			<tr>
			  <td>War Thunder</td>
			  <td>PC</td> 
			  <td>9/10</td>
			</tr>
			<tr>
			  <td>Overwatch</td>
			  <td>XBox One</td> 
			  <td>7/10</td>
			</tr>
		  </table>
	</div>

	<div class = "about">
		<h3>About</h3>
		<p>Content Here</p>
		<p>Content Here</p>
		<p>Content Here</p>
		<p>Content Here</p>
		<p>Content Here</p>
		<p>Content Here</p>
		<p>Content Here</p>
		<p>Content Here</p>
		<p>Content Here</p>
		<p>Content Here</p>
	</div>

	<div class = "submit">
		<h3>Submit</h3>
		<form action="/action_page.php">
			First name:<br>
			<input type="text" name="firstname" value="">
			<br>
			Last name:<br>
			<input type="text" name="lastname" value="">
			
			<br>
			Email:<br>
			<input type="text" name="email" value="">
			<br><br>
			
		  </form> 
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

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Nov 26 19:22:07 GMT 2017
                  SOURCE: /home/wdd/webapps/play/ca2/app/views/index.scala.html
                  HASH: 8baeac0a717fdc4e38542ff146f45892b8bf85d1
                  MATRIX: 948->1|1061->19|1088->20|1801->707|1829->714
                  LINES: 28->1|33->1|34->2|64->32|64->32
                  -- GENERATED --
              */
          