package uz.pdp.clickuppartially.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickuppartially.entity.enums.DependencyType;
import uz.pdp.clickuppartially.entity.template.AbsLongEntity;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class TaskDependency extends AbsLongEntity {
    @ManyToOne
    private Task task;

    @OneToOne
    private TaskDependency taskDependency;

    @Enumerated
    private DependencyType dependencyType;
}
