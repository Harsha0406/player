package com.org.infy.repository;

import com.org.infy.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PlayerRepo extends JpaRepository<Player,Integer> {

}
