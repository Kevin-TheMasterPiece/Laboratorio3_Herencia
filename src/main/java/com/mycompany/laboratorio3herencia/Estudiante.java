/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio3herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author WORKING
 */
public class Estudiante extends Persona{
    protected String carnet;
    protected double promedioNotas;
    protected int numeroMaterias;

    public Estudiante() {
    }

    public Estudiante(String carnet, Double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public Double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(Double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
    public double calcularPromedio (double notasAc){
        Estudiante est = new Estudiante();
        double prom;
        prom = notasAc/numeroMaterias;
        
        return prom;
    }
    public double leerNotasEstudiante (){
        double nota, notaAc=0.0;
         for (int i = 0; i<numeroMaterias; i++){
             nota = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota de la materia "+(i+1)+":"));
             notaAc+=nota;
         }
         
         System.out.println(notaAc);
         return notaAc;
    }
    public Estudiante ingresarDatosEstudiante (){
        Estudiante est = new Estudiante();
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        String carnet= "";
        int nMaterias = 0;
        double notasAc= 0.0;
        double prom;
        
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
        carnet = leerDatoTipoCadena("Ingrese el carnet del estudiante: ");
        nMaterias = leerDatoTipoEntero("Ingrese el numero de numero de materias del estudiante: ");
        
        est.setNombre(nombre);
        est.setApellido(apellido);
        est.setEdad(edad);
        est.setPeso(peso);
        est.setCarnet(carnet);
        est.setNumeroMaterias(nMaterias);
        
        notasAc= est.leerNotasEstudiante();
        prom = est.calcularPromedio(notasAc);
        est.setPromedioNotas(prom);
        
        
        return (est);
    }
    public void imprimirReporteNotasEstudiante (){
       
            imprimirDatosPersona();
            JOptionPane.showMessageDialog(null, "El carnet del estudiante es: "+carnet);
            JOptionPane.showMessageDialog(null, "El estudiante tiene "+numeroMaterias+" materias");
            JOptionPane.showMessageDialog(null, "El promedio del estudiante es: "+promedioNotas);
        }
}
