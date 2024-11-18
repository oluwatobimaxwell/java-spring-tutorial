package com.family_members.app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
public class HelloController {
    private List<Map<String, String>> users = new ArrayList<>();


    public HelloController(){
        Map<String, String> tobi = new HashMap<>();
        tobi.put("name", "Tobi Sholanke");
        tobi.put("school", "University of York");
        tobi.put("address", "Helsinki, FI");
        tobi.put("id", "4567890");

        Map<String, String> abbey = new HashMap<>();
        abbey.put("name", "Abiodun Olusegun");
        abbey.put("school", "Coventry University");
        abbey.put("address", "Machester, GB");
        abbey.put("id", "09876556");

        Map<String, String> moyin = new HashMap<>();
        moyin.put("name", "Moyin Sholanke");
        moyin.put("school", "Futminna University");
        moyin.put("address", "Abuja, NG");
        moyin.put("id", "84847737");


        users.add(tobi);
        users.add(abbey);
        users.add(moyin);

    }

    public Optional<Map<String, String>> _getUserById(String id) {
        return users.stream()
                .filter(user -> user.get("id").equals(id))
                .findFirst();
    }

    // GET - hello world string
    @GetMapping("/hello")
    public String sayHello(){

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        System.out.println("This end point was accessed");
        return "Hello world! Welcome to my application @"+ currentDateTime;
    }

    // GET - User information
    @GetMapping("/users")
    public UserListResponse getUsers(){

        System.out.println("List of users");
        return new UserListResponse("User List", users);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Map<String, String>> getUserById(@PathVariable String id){
        Optional<Map<String, String>> user = this._getUserById(id);

        return user.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }



    @GetMapping("/bulbs")
    public Map<String, Boolean> bulbs(){

        Random random = new Random();

        Map<String, Boolean> bulbs = new HashMap<>();
        bulbs.put("bulb1", random.nextBoolean());
        bulbs.put("bulb2", random.nextBoolean());
        bulbs.put("bulb3", random.nextBoolean());
        bulbs.put("bulb4", random.nextBoolean());

        return bulbs;


    }



}
