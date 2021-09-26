package uz.pdp.clickuppartially.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.clickuppartially.entity.WorkspacePermission;

import java.util.UUID;

public interface WorkspacePermissionRepository extends JpaRepository<WorkspacePermission, UUID> {
}
