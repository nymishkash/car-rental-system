package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Branch;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BranchServiceI {
    Branch addNewBranch(Branch branch);
    void updateBranch(Branch branch);
    void deleteBranch(Long branchID);
    Branch getBranchById(Long branchID);
    List<Branch> getBranches();
}
