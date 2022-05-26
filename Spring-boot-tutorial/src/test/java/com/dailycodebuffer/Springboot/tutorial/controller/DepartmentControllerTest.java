package com.dailycodebuffer.Springboot.tutorial.controller;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.Springboot.tutorial.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private DepartmentService departmentService;
//
//    private Department department;
//
//    @BeforeEach
//    void setUp() {
//        Department department = Department.builder()
//                .departmentName("IT")
//                .departmentAddress("Colombo")
//                .departmentCode("IT-07")
//                .departmentId(1L)
//                .build();
//    }
//
//    @Test
//    void saveDepartment() {
//        Department inputDepartment = Department.builder()
//                .departmentName("IT")
//                .departmentAddress("Colombo")
//                .departmentCode("IT-07")
//                .departmentId(1L)
//                .build();
//
//        Mockito.when(departmentService.saveDepartment(inputDepartment))
//                .thenReturn(department);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/departments")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\n" +
//                        "    \"departmentName\":\"IT\",\n" +
//                        "    \"departmentAddress\": \"Colombo\",\n" +
//                        "    \"departmentCode\":\"IT-07\"\n" +
//                        "}"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//
//    }
//
//    @Test
//    void fetchDepartmentById() throws DepartmentNotFoundException {
//        Mockito.when(departmentService.fetchDepartmentById(1L))
//                .thenReturn(department);
//
//        mockMvc.perform(get("/departments/1")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.departmentName").value(department.getDepartmentName()));
//    }
}