package com.example.matricola;

import java.util.ArrayList;

public class MyModel{
        private static MyModel instance = null;
        //Il costruttore private impedisce l'istanza di oggetti da parte di
        //classi esterne
         private ArrayList<Student> students=new ArrayList<Student>();
        private MyModel() {}


        // Metodo della classe impiegato per accedere al singleton
        public static synchronized MyModel getMyModel() {
            if (instance == null) {
                instance = new MyModel();
            }
            return instance;
        }

        public void addStudente(Student s){
           students.add(s);
        }

    public ArrayList<String> FromTesto(String s){
        ArrayList<String> lista=new ArrayList<String>();
        for(int i=0;i<students.size();i++){
            if(students.get(i).getMatricola().contains(s) || students.get(i).getNome().contains(s) || students.get(i).getCognome().contains(s)){
                lista.add(students.get(i).getString());
            }
        }
        return lista;
    }

    public ArrayList<String> getElenco(){
        ArrayList<String> lista=new ArrayList<String>();
        for(int i=0;i<students.size();i++){
                lista.add(students.get(i).getString());
        }
        return lista;
    }




}
//MyModel model1=MyModel.getIstance()
