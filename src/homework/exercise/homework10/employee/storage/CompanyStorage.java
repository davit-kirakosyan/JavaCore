package homework.exercise.homework10.employee.storage;

import homework.exercise.homework10.employee.model.Company;

public interface CompanyStorage {
    void addCompany(Company company);

    void printAllCompanies();

    Company getCompanyById(String id);

    int getSize();
}
