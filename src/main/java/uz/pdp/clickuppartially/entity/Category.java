package uz.pdp.clickuppartially.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {
    @GeneratedValue
    @Id
    private UUID id;

    private String name;
    @ManyToOne
    private Project project;

    private String accessType;

    private boolean archived;
    private String color;
}
