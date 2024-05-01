package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Branch;
import dev.org.carrentalsystem.repositories.BranchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService implements BranchServiceI{
    BranchRepository branchRepo;
    public BranchService(BranchRepository branchRepo) {
        this.branchRepo = branchRepo;
    }

    @Override
    public Branch addNewBranch(Branch branch) {
        branchRepo.save(branch);
        return null;
    }

    @Override
    public void updateBranch(Branch branch) {

    }

    @Override
    public void deleteBranch(Long branchID) {

    }

    @Override
    public Branch getBranchById(Long branchID) {
        return null;
    }

    @Override
    public List<Branch> getBranches() {
        return List.of();
    }
}
