package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;
import lombok.*;

@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
