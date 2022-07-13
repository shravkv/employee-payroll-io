package com.bridgelabz;

import org.junit.Assert;

import org.junit.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmp = {
                new EmployeePayrollData(1, "SK", 10000),
                new EmployeePayrollData(2, "SS", 20000),
                new EmployeePayrollData(3, "PK", 30000)
        };
        EmployeePayrollService employeePayRollService;
        employeePayRollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));
        employeePayRollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayRollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3, entries);
    }

}
