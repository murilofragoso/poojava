package br.edu.fatecfranca.ads.ex0;

import java.util.ArrayList;

public class Country {
    private String continent;
    private String name;
    private String initials;
    private ArrayList<State> states;
    

    public Country() {
        this.states = new ArrayList();
    }

    public Country(String continent, String name, String initials, ArrayList<State> states) {
        this.continent = continent;
        this.name = name;
        this.initials = initials;
        this.states = states;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
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

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "Country{" + "continent=" + continent + ", name=" + name + ", initials=" + initials + ", states=" + states + '}';
    }

    // métodos
    
    public void addState(State estado){
        this.states.add(estado);
    }
    
    public boolean removeState(State estado){
        return this.states.remove(estado);
    }
    
    public int getState(State estado){
        return this.states.indexOf(estado); //retorna -1 se não encontrar
    }
    
    public boolean updateState(State actualState, State newState ){
        int pos = this.getState(actualState);
        if(pos != -1){
            this.states.set(pos, newState);
            return true;
        }
        else return false;
    }
    
    public boolean addCityState(City city,State state){
        int pos = this.getState(state);
        if(pos != -1){
            state.addCity(city);
            return true;
        }
        else return false;
    }
}
