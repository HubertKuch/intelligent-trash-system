package com.hubert.ietrash.models.trash;

import com.hubert.ietrash.models.trash.containers.TrashContainer;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Trash {
    @Id
    private UUID uuid;
    private List<TrashContainer> containers;
}
