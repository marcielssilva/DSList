package com.marcielssilva.dslist.repositories;

import com.marcielssilva.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
