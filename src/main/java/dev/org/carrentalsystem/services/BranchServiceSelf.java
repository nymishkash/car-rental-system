package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Branch;
import dev.org.carrentalsystem.repositories.BranchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchServiceSelf implements BranchServiceI {

    private BranchRepository branchRepository;

    @Override
    public Branch addNewBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    @Override
    public Branch getBranchById(Long branchID) {
        Optional<Branch> optionalBranch = branchRepository.findById(branchID);

        if (!optionalBranch.isEmpty()) {
            return optionalBranch.get();
        }
        else {
            return null;
        }
    }

    @Override
    public void updateBranch(Branch branch) {

    }

    @Override
    public void deleteBranch(Long branchID) {

    }

    @Override
    public List<Branch> getBranches() {
        return List.of();
    }
}
