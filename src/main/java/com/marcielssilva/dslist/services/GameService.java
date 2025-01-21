package com.marcielssilva.dslist.services;

import com.marcielssilva.dslist.dto.GameMinDTO;
import com.marcielssilva.dslist.entities.Game;
import com.marcielssilva.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService  {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map( x -> new GameMinDTO(x) ).toList();
        return dto;
    }
}
