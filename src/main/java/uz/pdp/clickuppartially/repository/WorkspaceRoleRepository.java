package uz.pdp.clickuppartially.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.clickuppartially.entity.WorkspaceRole;

import java.util.UUID;

public interface WorkspaceRoleRepository extends JpaRepository<WorkspaceRole, UUID> {
}
