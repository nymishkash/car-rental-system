package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Branch;
import dev.org.carrentalsystem.repositories.BranchRepository;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;
import java.util.Optional;

public class BranchService implements BranchServiceI {

    private BranchRepository branchRepository;

    BranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
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
    public void addNewBranch(Branch branch) {

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
