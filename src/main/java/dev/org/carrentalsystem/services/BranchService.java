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
    public Branch updateBranch(Branch branch) {
        return null;
    }

    @Override
    public void deleteBranch(Branch branch) {

    }

    public List<Branch> getAllBranches() {
        return branchRepo.findAll();
    }



}
