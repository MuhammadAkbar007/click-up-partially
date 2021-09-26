package uz.pdp.clickuppartially.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickuppartially.entity.enums.TaskPermission;
import uz.pdp.clickuppartially.entity.template.AbsLongEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class CategoryUser extends AbsLongEntity {
    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

    @Enumerated
    private TaskPermission taskPermission;
}
