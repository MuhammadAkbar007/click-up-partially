package uz.pdp.clickuppartially.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickuppartially.entity.template.AbsLongEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class TaskTag extends AbsLongEntity {
    @ManyToOne
    private Task task;

    @ManyToOne
    private Tag tag;
}
