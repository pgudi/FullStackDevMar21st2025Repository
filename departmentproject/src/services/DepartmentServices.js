import axios from 'axios'

const API_BASE_URL = "http://localhost:9090/api/v1/departments"

export const getAllDepartments =()=>{
    return axios.get(API_BASE_URL)
}

export const createDepartment = (department) => {
    return axios.post(API_BASE_URL, department);
}

export const deleteDepartment = (deptid) => {
    return axios.delete(API_BASE_URL + "/" + deptid);
}   

export const getDepartment = (deptid) => {
    return axios.get(API_BASE_URL + "/" + deptid);
}

export const modifyDepartment = (deptid, department) => {
    return axios.put(API_BASE_URL + "/" + deptid, department);
}