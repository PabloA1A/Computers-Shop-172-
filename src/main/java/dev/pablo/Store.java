package dev.pablo;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private String owner;
    private String taxId;
    private List<Computer> computers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public Store(String name, String owner, String taxId, List<Computer> computers) {
        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = new ArrayList<>(computers);
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public boolean removeComputer(String brand) {
        return computers.removeIf(c -> c.getBrand().equalsIgnoreCase(brand));
    }

    public Computer findComputer(String brand) {
        return computers.stream()
                .filter(c -> c.getBrand().equalsIgnoreCase(brand))
                .findFirst()
                .orElse(null);
    }

    public List<Computer> listComputers() {
        return new ArrayList<>(computers);
    }
}