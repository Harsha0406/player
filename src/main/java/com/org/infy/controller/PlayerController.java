package com.org.infy.controller;

import com.org.infy.model.Player;
import com.org.infy.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class PlayerController {
    @Autowired
    PlayerRepo playerRepo;


    @PostMapping("/create")
    public void createPlayer(@RequestBody Player player){
        playerRepo.save(player);

    }
    @PutMapping("/update")
    public void updatePlayer(@RequestBody Player player){
        playerRepo.save(player);
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id) {
        playerRepo.deleteById(id);
        return "Success";
    }
    @GetMapping("/getAll")
    public List<Player>getAll(){
        List<Player> list=playerRepo.findAll();
        return list;
    }
}