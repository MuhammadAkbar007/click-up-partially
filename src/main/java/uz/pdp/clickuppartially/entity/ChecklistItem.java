package uz.pdp.clickuppartially.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickuppartially.entity.template.AbsLongEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class ChecklistItem extends AbsLongEntity {
    @Column(nullable = false)
    private String name;

    @ManyToOne
    private CheckList checkList;

    private String resolved;//o'zgarishi mumkin

    @OneToOne
    private User assignedUser;
}
