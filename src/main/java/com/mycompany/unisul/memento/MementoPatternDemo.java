package com.mycompany.unisul.memento;


public class MementoPatternDemo {

    public static void main(String[] args) {
        
        Originator originator = new Originator();
        Caretaker careTaker = new Caretaker();
        
        
        originator.setState("Estado do objeto #1");
        originator.setState("Estado do objeto #2");
        careTaker.add(originator.SaveStateToMemento());
       
        originator.setState("Estado #3");
        careTaker.add(originator.SaveStateToMemento());

        
        originator.setState("Estado #4");
        System.out.println("Estado Atual: " + originator.getState());
       
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("Primeiro estado salvo: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Segundo estado salvo: " + originator.getState());
        
        
    
    }

}
