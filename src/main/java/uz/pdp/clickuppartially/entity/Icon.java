package uz.pdp.clickuppartially.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Icon {
    @Id
    @GeneratedValue
    private UUID id;

    private String color;

    @Column(nullable = false)
    private String initialLetter;

    @OneToOne
    private Icon icon;

    @OneToOne
    private Attachment attachment;
}
