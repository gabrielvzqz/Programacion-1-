package Constructores;

public class tapas3 {

//atributos
private double patatas;//en kilos
private double chocos;// en kilos

public tapas3() {
patatas=0;
chocos=0;

}
tapas3 (double p, double c){
patatas=p;
chocos=c;
}
public double getPatatas() {
return patatas;
}
public void setPatatas(double patatas) {
this.patatas = patatas;
}
public double getChocos() {
return chocos;
}
public void setChocos(double chocos) {
this.chocos = chocos;
}
@Override
public String toString() {
return "palestina [patatas=" + patatas + ", chocos=" + chocos + "]";
}
//addpatatas
public void addpatatas(double x) {
}//addchocos
public void addchocos(double y) {
}
public int numeroClientes() {
int com=0;


while(patatas>=1 && chocos>=0.5) {
com=com+3;
//a las patatas le restamos 1
patatas=patatas-1;
//a los chocos le restamos 0.5
chocos=chocos-0.5;
//comen 3
com=com+3;
System.out.println("quedan despues de comer: "+patatas+"y"+chocos);
//volvemos al principio
System.out.println("comen estas personas:" +com);

}
return com;
} public String numeroClientes(double p, double c) {
// TODO Auto-generated method stub
return null;
}
}
