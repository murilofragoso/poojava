package br.edu.fatecfranca.ads.ex0;

public class Teste {
    public static void main(String[] args) {
        City city1 = new City("Franca", 400000);
        City city2 = new City("Ribeirão", 900000);
        
        State state1 = new State();
        state1.setName("São paulo");
        state1.setInitials("SP");
        
        //adicionar cidades
        state1.addCity(city1);
        state1.addCity(city2);
        
        System.out.println(state1.toString());
        
        //remove
        state1.removeCity(city1);
        
        System.out.println(state1.toString());
        
        //atualiza
        City city3 = new City("Restinga", 10000);
        state1.updateCity(city2, city3);
        
        System.out.println(state1.toString());
        
        Country country1 = new Country();
        country1.setContinent("América do sul");
        country1.setName("Brasil");
        country1.setInitials("BR");
        
        country1.addState(state1);
        
        State state2 = new State();
        state2.setName("Minas Gerais");
        state2.setInitials("MG");
        
        country1.addState(state2);
        
        City city4 = new City("Ibiraci", 17000);
        
        country1.addCityState(city4, state2);
        
        System.out.println(country1.toString());
    }
}
