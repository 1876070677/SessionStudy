package kr.ac.catholic.sessiontesting.controller;

import jakarta.servlet.http.HttpSession;
import kr.ac.catholic.sessiontesting.entity.Person;
import kr.ac.catholic.sessiontesting.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/oauth2")
public class WelcomeController {

    @GetMapping("/selab")
    public Map<String, Object> welcome() {
        Map<String, Object> data = new HashMap<>();

        data.put("uid", "1");
        return data;
    }

    @PostMapping("/session_create")
    public Map<String, Object> createSession(@RequestBody Person req, HttpSession session) {
        Map<String, Object> data = new HashMap<>();

        session.setAttribute("user", req);

        data.put("sessionId", session.getId());

        return data;
    }

    @GetMapping("/session_check")
    public Map<String, Object> checkSession(HttpSession session) {
        Map<String, Object> data = new HashMap<>();

        User user = new User();

        Object obj = session.getAttribute("user");

        if (obj instanceof User) {
           user = (User) obj;
        }

        data.put("name", user.getName());

        return data;
    }

    @GetMapping("/session_destroy")
    public Map<String, Object> destroySession(HttpSession session) {
        Map<String, Object> data = new HashMap<>();

        data.put("result", "success");

        session.invalidate();

        return data;
    }

}
