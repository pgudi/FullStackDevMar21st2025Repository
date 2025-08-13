import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom'
import { createDepartment , getDepartment, modifyDepartment} from '../services/DepartmentServices'
import { useParams } from 'react-router-dom'

const DepartmentComponent = () => {
    const [deptName, setDeptName] = useState('')
    const [location, setLocation] = useState('')
    const navigate = useNavigate();

    const { id } = useParams();

    function handleDeptName(e) {
        setDeptName(e.target.value);
    }

    function handleLocation(e) {
        setLocation(e.target.value);
    }

    function saveDepartment(e) {
        e.preventDefault();
        const department = { dname: deptName, loc: location };
        console.log(department);
        if (id) {
            modifyDepartment(id, department)
                .then(response => {
                    console.log("Department modified successfully:", response.data);
                })
                .catch(error => {
                    console.error("Error modifying department:", error);
                });
        }
        else {
            createDepartment(department)
                .then(response => {
                    console.log("Department created successfully:", response.data);
                })
                .catch(error => {
                    console.error("Error creating department:", error);
                });
        }
        navigate('/departments'); // Redirect to the list of departments after creation

    }

    function cancelDepartment() {
        navigate('/departments');
    }

    const fetchDepartment = (id) => {
        getDepartment(id).then(response => {
            const department = response.data;
            setDeptName(department.dname);
            setLocation(department.loc);
        }).catch(error => {
            console.error("Error fetching department:", error);
        });
    }

    useEffect(() =>{
        if (id) {
            fetchDepartment(id);
        }
    }, [id])

    function changeTitle(){
        if(id){
            return <h2 className='text-center'>Edit Department</h2>
        }else{
            return <h2 className='text-center'>Add Department</h2>
        }
    }
    return (
        <div>
            <div className="container">
                <div className="row justify-content-center p-5">
                    <div className="card">
                        {
                            changeTitle()
                        }
                        <div className="card-body">
                            <div className="col-md-6 offset-md-3">
                                <form>
                                    <div className="form-group">
                                        <label>Department Name</label>
                                        <input type="text"
                                            className="form-control"
                                            placeholder="Enter Department Name"
                                            name='deptName'
                                            value={deptName}
                                            onChange={handleDeptName}
                                        />
                                    </div>
                                    <div className="form-group">
                                        <label>Location</label>
                                        <input type="text"
                                            className="form-control"
                                            placeholder="Enter Location"
                                            name='location'
                                            value={location}
                                            onChange={handleLocation}
                                        />
                                    </div>
                                    <button type="button" className="btn btn-success mt-3 me-3" onClick={saveDepartment}>Save</button>
                                    <button type="button" className="btn btn-danger mt-3" onClick={cancelDepartment}>Cancel</button>
                                </form>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default DepartmentComponent