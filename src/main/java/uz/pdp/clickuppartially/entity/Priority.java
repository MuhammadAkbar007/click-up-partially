package uz.pdp.clickuppartially.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickuppartially.entity.template.AbsLongEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Priority extends AbsLongEntity {
    @Column(nullable = false)
    private String name;

    @OneToOne
    private Icon icon;
}
