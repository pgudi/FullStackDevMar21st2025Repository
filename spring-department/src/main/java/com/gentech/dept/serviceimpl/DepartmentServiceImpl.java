package com.gentech.dept.serviceimpl;

import com.gentech.dept.entity.Department;
import com.gentech.dept.exception.ResourceNotFoundException;
import com.gentech.dept.repository.DepartmentRepository;
import com.gentech.dept.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository deptRepo;


    @Override
    public Department createDeaprtment(Department department) {
        return deptRepo.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return deptRepo.findAll();
    }

    @Override
    public Department getDepartment(Integer id) {
//        Optional<Department> dept =deptRepo.findById(id);
//        return dept.get();
        return deptRepo.findById(id).orElseThrow(() ->
              new ResourceNotFoundException("The Department id "+id+" is not available in the Database!!"));
    }

    @Override
    public Department updateDepartment(Integer id, Department department) {
//        Optional<Department> optionaldept =deptRepo.findById(id);
//        Department dept = optionaldept.get();
        Department dept=deptRepo.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Department id "+id+" is not available in the Database!!"));
        dept.setId(id);
        dept.setDname(department.getDname());
        dept.setLoc(department.getLoc());

        return deptRepo.save(dept);
    }

    @Override
    public void deleteDepartment(Integer id) {
//        Optional<Department> optionaldept =deptRepo.findById(id);
//        Department dept = optionaldept.get();
        Department dept= deptRepo.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Department id "+id+" is not available in the Database!!"));
        deptRepo.delete(dept);
    }


}
