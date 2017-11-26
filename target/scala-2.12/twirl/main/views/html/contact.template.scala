
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
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
		    <a href="/">Home</a>
			<a href="/games">Games</a>
			<a href="/about">About Us</a>
            <a href="/reviews">Reviews</a>
            <a class="active" href="/contact">Contact Us</a>
	</nav>

	<div class = "games">
		<h3>Reviews</h3>
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
                  DATE: Fri Nov 24 17:41:17 GMT 2017
                  SOURCE: /home/wdd/webapps/play/ca2/app/views/contact.scala.html
                  HASH: bc91b8d0ae1e2a8820ed406a27370a1d81a981cb
                  MATRIX: 1032->0
                  LINES: 33->1
                  -- GENERATED --
              */
          