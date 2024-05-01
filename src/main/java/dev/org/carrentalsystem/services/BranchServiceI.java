package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Branch;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BranchServiceI {
    Branch addNewBranch(Branch branch);
    Branch updateBranch(Branch branch);
    void deleteBranch(Branch branch);
    List<Branch> getAllBranches();
}
