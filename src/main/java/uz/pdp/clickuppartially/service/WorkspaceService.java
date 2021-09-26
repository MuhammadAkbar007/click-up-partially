package uz.pdp.clickuppartially.service;

import uz.pdp.clickuppartially.entity.User;
import uz.pdp.clickuppartially.payload.ApiResponse;
import uz.pdp.clickuppartially.payload.MemberDTO;
import uz.pdp.clickuppartially.payload.WorkspaceDTO;

import java.util.UUID;


public interface WorkspaceService {

    ApiResponse addWorkspace(WorkspaceDTO workspaceDTO, User user);

    ApiResponse editWorkspace(WorkspaceDTO workspaceDTO);

    ApiResponse changeOwnerWorkspace(Long id, UUID ownerId);

    ApiResponse deleteWorkspace(Long id);

    ApiResponse addOrEditOrRemoveWorkspace(Long id, MemberDTO memberDTO);

    ApiResponse joinToWorkspace(Long id, User user);
}
