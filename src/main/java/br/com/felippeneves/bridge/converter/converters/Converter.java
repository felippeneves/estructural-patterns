package br.com.felippeneves.bridge.converter.converters;

import br.com.felippeneves.bridge.converter.employees.Employee;

public interface Converter {
	String getEmployeeFormated(Employee emp);
}