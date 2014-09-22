package controllers;

import dtos.UserDTO;
import fr.xebia.extras.selma.Selma;
import mappers.UserMapper;
import models.User;
import play.*;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    private static User chuck = new User("Chuck Noris", -1, "Chuck Noris");
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    public static Result chuck() {
        UserMapper userMapper = Selma.getMapper(UserMapper.class);
        UserDTO userDTO = userMapper.asDto(chuck);
        //force recompile
        return ok(Json.toJson(userDTO));
    }

}
