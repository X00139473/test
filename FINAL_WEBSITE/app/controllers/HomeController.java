package controllers;

import play.mvc.*;
import views.html.*;
import play.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Games"));
    }

    public Result games() {
        return ok(views.html.games.render());
    }

    public Result about() {
        return ok(views.html.about.render());
    }

    public Result reviews(){
        return ok(views.html.reviews.render());
    }

    public Result Overwatch(){
        return ok(views.html.Overwatch.render());
    }

    public Result WarThunder(){
        return ok(views.html.WarThunder.render());
    }

    public Result ShadowOfWar(){
        return ok(views.html.ShadowOfWar.render());
    }

    public Result Injustice(){
        return ok(views.html.Injustice.render());
    }


    
}
