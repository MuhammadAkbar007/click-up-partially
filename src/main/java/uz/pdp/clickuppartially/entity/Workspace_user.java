package uz.pdp.clickuppartially.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Workspace_user {
    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    private Workspace workspace;

    @OneToOne
    private User user;

    @OneToOne
    private Workspace_role workspace_role;

    private Timestamp dateInvited;

    private Timestamp dateJoined;
}
