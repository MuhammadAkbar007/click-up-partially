package uz.pdp.clickuppartially.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickuppartially.entity.enums.ColorName;
import uz.pdp.clickuppartially.entity.template.AbsLongEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Tag extends AbsLongEntity {
    @Column(nullable = false)
    private String name;

    @Enumerated
    private ColorName color;

    @ManyToMany
    private Set<Workspace> workspaces;
}
