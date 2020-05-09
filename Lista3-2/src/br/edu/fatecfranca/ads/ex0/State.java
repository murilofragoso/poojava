package br.edu.fatecfranca.ads.ex0;

import java.util.ArrayList;

public class State {
    private String name;
    private String initials;
    // associação
    private ArrayList<City> cities;

    public State() {
        this.cities = new ArrayList();
    }

    public State(String name, String initials, ArrayList<City> cities) {
        this.name = name;
        this.initials = initials;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "\n State{" + "name=" + name + ", initials=" + initials + ", cities=" + cities + '}';
    }
    
    // métodos
    
    public void addCity(City cidade){
        this.cities.add(cidade);
    }
    
    public boolean removeCity(City cidade){
        return this.cities.remove(cidade);
    }
    
    public int getCity(City city){
        return this.cities.indexOf(city); //retorna -1 se não encontrar
    }
    
    public boolean updateCity(City actualCity, City newCity ){
        int pos = this.getCity(actualCity);
        if(pos != -1){
            this.cities.set(pos, newCity);
            return true;
        }
        else return false;
    }
}
