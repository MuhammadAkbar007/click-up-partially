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
public class Space {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    private String color;

    @ManyToOne
    private User owner_id;

    @Column(nullable = false)
    private String initialLetter;

    @OneToOne
    private Attachment avatar_id;

    @ManyToOne
    private Icon iconId;

    @ManyToOne
    private Workspace workspaceId;
}
