package dev.org.carrentalsystem.controllers;

import dev.org.carrentalsystem.dtos.BranchDto;
import dev.org.carrentalsystem.models.Branch;
import dev.org.carrentalsystem.services.BranchService;
import dev.org.carrentalsystem.services.BranchServiceI;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/branches")
    public List<Branch> getBranches() {
        return null;
    }

    @PostMapping("/create")
    public Branch saveBranch(@RequestBody Branch branch) {
        return branchService.addNewBranch(branch);
    }

    @GetMapping("/all")
    public List<Branch> getAllBranches() {
        return branchService.getAllBranches();
    }
}
