package com.marcielssilva.dslist.services;

import com.marcielssilva.dslist.dto.GameDTO;
import com.marcielssilva.dslist.dto.GameListDTO;
import com.marcielssilva.dslist.dto.GameMinDTO;
import com.marcielssilva.dslist.entities.Game;
import com.marcielssilva.dslist.entities.GameList;
import com.marcielssilva.dslist.repositories.GameListRepository;
import com.marcielssilva.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x) ).toList();

    }
}
