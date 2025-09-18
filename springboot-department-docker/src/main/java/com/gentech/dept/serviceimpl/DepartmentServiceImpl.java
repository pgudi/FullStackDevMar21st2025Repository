package com.gentech.dept.serviceimpl;

import com.gentech.dept.entity.Department;
import com.gentech.dept.exception.ResourceNotFoundException;
import com.gentech.dept.repository.DepartmentRepository;
import com.gentech.dept.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentrepo;

    public DepartmentServiceImpl(DepartmentRepository departmentrepo) {
        this.departmentrepo = departmentrepo;
    }

    @Override
    public Department createDepartment(Department department) throws Exception {
        return departmentrepo.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentrepo.findAll();
    }

    @Override
    public Department getDepartment(Long id) {
         Optional<Department> deptment=departmentrepo.findById(id);
         return deptment.get();
//         return departmentrepo.findById(id).orElseThrow(() ->
//                 new ResourceNotFoundException("The department Number does not exists!!!"));

    }

    @Override
    public Department modifyDepartment(Long id, Department department) {
        Department dept= departmentrepo.findById(id).orElseThrow(() ->
                 new ResourceNotFoundException("The department Number does not exists!!!"));;

        dept.setDeptId(id);
        dept.setDepartmentName(department.getDepartmentName());
        dept.setLocation(department.getLocation());

        return departmentrepo.save(dept);
    }

    @Override
    public void deleteDepartment(Long id) {

        departmentrepo.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The department Number does not exists!!!"));
        departmentrepo.deleteById(id);
    }


}
