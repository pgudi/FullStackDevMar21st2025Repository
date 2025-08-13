import React, { useEffect, useState } from 'react'
import { getAllDepartments, deleteDepartment } from '../services/DepartmentServices'
import { useNavigate } from 'react-router-dom'
const ListDepartments = () => {
    const [departments, setDepartments] = useState([])
    const navigate = useNavigate();

    useEffect(() => {
        displayDepartments()
    }, [])

    const displayDepartments = () => {
        getAllDepartments().then((response) => {
            console.log(response.data);
            setDepartments(response.data)
        }).catch((error) => {
            console.error("Error fetching departments:", error);
        })
    }

    const createDepartment = () => {
        navigate('/createdept');
    }



    function removeDepartment(deptid) {
        if (deptid) {
            const status1 = confirm("Are you sure you want to delete this department?");
            if (status1) {
                deleteDepartment(deptid).then((response) => {
                    console.log(response.data);
                    console.log(deptid)
                    displayDepartments(); // Refresh the list after deletion    
                }).catch((error) => {
                    console.error("Error deleting department:", error);
                })
            }
        }

    }

    function editDepartment(deptid) {
        navigate(`/editdept/${deptid}`);
    
    }

    return (
        <div>
            <h3 className='text-center'>List of Departments</h3>
            <button className='btn btn-primary' onClick={createDepartment}>Add Department</button>
            <table className='table table-striped table-bordered table-hover'>
                <thead>
                    <tr>
                        <th>Department Id</th>
                        <th>Department Name</th>
                        <th>Location</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        departments.map((department) => {
                            return (
                                <tr key={department.id}>
                                    <td>{department.id}</td>
                                    <td>{department.dname}</td>
                                    <td>{department.loc}</td>
                                    <td>
                                        <button className='btn btn-info me-3' onClick={() => editDepartment(department.id)}>Edit</button>
                                        <button className='btn btn-danger' onClick={() => removeDepartment(department.id)}>Delete</button>
                                    </td>
                                </tr>
                            )
                        })
                    }
                </tbody>
            </table>
        </div>
    )
}

export default ListDepartments