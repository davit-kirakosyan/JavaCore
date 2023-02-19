package homework.exercise.homework10.employee.storage.impl;

import homework.exercise.homework10.employee.model.Company;
import homework.exercise.homework10.employee.storage.CompanyStorage;


public class CompanyStorageImpl implements CompanyStorage {

    private Company[] companies = new Company[10];
    private int size = 0;

    @Override
    public void addCompany(Company company) {
        if (companies.length == size) {
            extend();
        }
        companies[size++] = company;
    }

    private void extend() {
        Company[] newCompany = new Company[companies.length + 5];
        for (int i = 0; i < size; i++) {
            newCompany[i] = companies[i];
        }
        companies = newCompany;
    }

    @Override
    public void printAllCompanies() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
        }
    }


    @Override
    public Company getCompanyById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getId().equals(id)) {
                return companies[i];
            }
        }
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }
}

