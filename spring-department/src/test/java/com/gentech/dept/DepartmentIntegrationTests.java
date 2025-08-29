package com.gentech.dept;

import com.gentech.dept.entity.Department;
import com.gentech.dept.repository.DepartmentRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DepartmentIntegrationTests {
    @LocalServerPort
    private int port;

    private String baseURL="http://localhost";

    private static RestTemplate restTemplate=null;
    @Autowired
    private DepartmentRepository deptRepo;

    @BeforeAll
    public static void init()
    {
        restTemplate =new RestTemplate();
    }

    @BeforeEach
    public void setUp()
    {
        baseURL=baseURL+":"+port+"/api/v1";
    }

    @AfterEach
    public void cleanUp()
    {
        deptRepo.deleteAll();
    }

    @Test
    public void createDepartment()
    {
        Department dept1=new Department();
        dept1.setDname("Accounting");
        dept1.setLoc("Dallas");

        Department deptNew=restTemplate.postForObject(baseURL+"/departments", dept1, Department.class);
        deptRepo.save(deptNew);
        //Validations
        Assertions.assertNotNull(deptNew);
        Assertions.assertTrue(deptNew.getDname().equals("Accounting"));
        Assertions.assertEquals("Dallas",deptNew.getLoc());
    }
}
