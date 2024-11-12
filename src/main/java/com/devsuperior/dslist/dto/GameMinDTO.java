package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import lombok.*;

@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String img_url;
    private String shortDescription;

    public GameMinDTO(Game entity){
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        img_url = entity.getImg_url();
        shortDescription = entity.getShortDescription();
    }
}
