package org.example.tallerGrafos;// paquetes o librerias
import java.lang.*;
import java.io.*;

//inicio de la clase NodoVertice
class NodoVertice{

    //atributos
    String nombrev=new String("");
    NodoVertice sigv;// puntero al siguiente vertice
    NodoArista siga;// puntero a la lista de aristas del vertice

    //metodos
    NodoVertice(){}

} //fin de la clase NodoVertice
//inicio de la clase NodoArista
class NodoArista{

    //atributos
    double distancia;
    NodoVertice sigv;// puntero al vertice (destino)
    NodoArista siga;// puntero a la siguiente arista del vertice

    //metodos
    NodoArista(){}
}//fin de la clase NodoArista
//inicio de la clase Grafos
class Grafos{

    //atributos;
    private static double matriz_distancia[][];
    NodoVertice cabv, movilv;
    NodoArista caba, movila;

    //metodos
    Grafos(){}

    public void inicializar_grafo(){
        cabv=null; // inicializando lista de vertices
        caba=null; // inicializando lista de aristas
    }
    public static void inicializar_matriz_de_adyacencia_distancias() {
        matriz_distancia = new double[12][12];

        // Origen Armenia
        matriz_distancia[0][0] = 0.0;
        matriz_distancia[0][1] = 19.3;
        matriz_distancia[0][2] = 5.0;
        matriz_distancia[0][3] = 12.0;
        matriz_distancia[0][4] = 24.5;
        matriz_distancia[0][5] = 18.0;
        matriz_distancia[0][6] = 6.0;
        matriz_distancia[0][7] = 29.0;
        matriz_distancia[0][8] = 49.0;
        matriz_distancia[0][9] = 29.6;
        matriz_distancia[0][10] = 4.0;
        matriz_distancia[0][11] = 35.0;

        // Origen Salento
        matriz_distancia[1][0] = 19.3;
        matriz_distancia[1][1] = 0.0;
        matriz_distancia[1][2] = 14.5;
        matriz_distancia[1][3] = 42.0;
        matriz_distancia[1][4] = 19.5;
        matriz_distancia[1][5] = 36.0;
        matriz_distancia[1][6] = 29.0;
        matriz_distancia[1][7] = 60.0;
        matriz_distancia[1][8] = 81.1;
        matriz_distancia[1][9] = 56.7;
        matriz_distancia[1][10] = 26.3;
        matriz_distancia[1][11] = 67.1;

        // Origen Circasia
        matriz_distancia[2][0] = 5.0;
        matriz_distancia[2][1] = 14.5;
        matriz_distancia[2][2] = 0;
        matriz_distancia[2][3] = 29;
        matriz_distancia[2][4] = 18;
        matriz_distancia[2][5] = 26;
        matriz_distancia[2][6] = 16;
        matriz_distancia[2][7] = 46;
        matriz_distancia[2][8] = 68;
        matriz_distancia[2][9] = 43.6;
        matriz_distancia[2][10] = 13.1;
        matriz_distancia[2][11] = 54;

        // Origen La Tebaida
        matriz_distancia[3][0] = 12;
        matriz_distancia[3][1] = 42;
        matriz_distancia[3][2] = 29;
        matriz_distancia[3][3] = 0;
        matriz_distancia[3][4] = 46;
        matriz_distancia[3][5] = 29;
        matriz_distancia[3][6] = 19;
        matriz_distancia[3][7] = 39;
        matriz_distancia[3][8] = 60;
        matriz_distancia[3][9] = 35.6;
        matriz_distancia[3][10] = 24.1;
        matriz_distancia[3][11] = 46;

        // Origen Filandia
        matriz_distancia[4][0] = 24.5;
        matriz_distancia[4][1] = 19.5;
        matriz_distancia[4][2] = 18;
        matriz_distancia[4][3] = 46;
        matriz_distancia[4][4] = 0;
        matriz_distancia[4][5] = 17;
        matriz_distancia[4][6] = 27;
        matriz_distancia[4][7] = 62;
        matriz_distancia[4][8] = 84.8;
        matriz_distancia[4][9] = 60.4;
        matriz_distancia[4][10] = 30;
        matriz_distancia[4][11] = 70.8;

        // Origen Quimbaya
        matriz_distancia[5][0] = 18;
        matriz_distancia[5][1] = 36;
        matriz_distancia[5][2] = 26;
        matriz_distancia[5][3] = 29;
        matriz_distancia[5][4] = 17;
        matriz_distancia[5][5] = 0;
        matriz_distancia[5][6] = 11;
        matriz_distancia[5][7] = 52;
        matriz_distancia[5][8] = 73.3;
        matriz_distancia[5][9] = 48.9;
        matriz_distancia[5][10] = 28.9;
        matriz_distancia[5][11] = 59.3;

        // Origen Montenegro
        matriz_distancia[6][0] = 6;
        matriz_distancia[6][1] = 29;
        matriz_distancia[6][2] = 16;
        matriz_distancia[6][3] = 19;
        matriz_distancia[6][4] = 27;
        matriz_distancia[6][5] = 11;
        matriz_distancia[6][6] = 0;
        matriz_distancia[6][7] = 42;
        matriz_distancia[6][8] = 62.9;
        matriz_distancia[6][9] = 38.5;
        matriz_distancia[6][10] = 18.1;
        matriz_distancia[6][11] = 48.9;

        // Origen Pijao
        matriz_distancia[7][0] = 29;
        matriz_distancia[7][1] = 60;
        matriz_distancia[7][2] = 46;
        matriz_distancia[7][3] = 39;
        matriz_distancia[7][4] = 62;
        matriz_distancia[7][5] = 52;
        matriz_distancia[7][6] = 42;
        matriz_distancia[7][7] = 0;
        matriz_distancia[7][8] = 24.7;
        matriz_distancia[7][9] = 12.1;
        matriz_distancia[7][10] = 33.3;
        matriz_distancia[7][11] = 12;

        // Origen Génova
        matriz_distancia[8][0] = 49;
        matriz_distancia[8][1] = 81.1;
        matriz_distancia[8][2] = 68;
        matriz_distancia[8][3] = 60;
        matriz_distancia[8][4] = 84.8;
        matriz_distancia[8][5] = 73.3;
        matriz_distancia[8][6] = 62.9;
        matriz_distancia[8][7] = 24.7;
        matriz_distancia[8][8] = 0;
        matriz_distancia[8][9] = 33.8;
        matriz_distancia[8][10] = 54;
        matriz_distancia[8][11] = 55.5;

        // Origen Buenavista
        matriz_distancia[9][0] = 29.6;
        matriz_distancia[9][1] = 56.7;
        matriz_distancia[9][2] = 43.6;
        matriz_distancia[9][3] = 35.6;
        matriz_distancia[9][4] = 60.4;
        matriz_distancia[9][5] = 48.9;
        matriz_distancia[9][6] = 38.5;
        matriz_distancia[9][7] = 12.1;
        matriz_distancia[9][8] = 33.8;
        matriz_distancia[9][9] = 0;
        matriz_distancia[9][10] = 29.7;
        matriz_distancia[9][11] = 18.9;

        // Origen Calarcá
        matriz_distancia[10][0] = 4;
        matriz_distancia[10][1] = 26.3;
        matriz_distancia[10][2] = 13.1;
        matriz_distancia[10][3] = 24.1;
        matriz_distancia[10][4] = 30;
        matriz_distancia[10][5] = 28.9;
        matriz_distancia[10][6] = 18.1;
        matriz_distancia[10][7] = 33.3;
        matriz_distancia[10][8] = 54;
        matriz_distancia[10][9] = 29.7;
        matriz_distancia[10][10] = 0;
        matriz_distancia[10][11] = 40;

        // Origen Córdoba
        matriz_distancia[11][0] = 35;
        matriz_distancia[11][1] = 67.1;
        matriz_distancia[11][2] = 54;
        matriz_distancia[11][3] = 46;
        matriz_distancia[11][4] = 70.8;
        matriz_distancia[11][5] = 59.3;
        matriz_distancia[11][6] = 48.9;
        matriz_distancia[11][7] = 12;
        matriz_distancia[11][8] = 55.5;
        matriz_distancia[11][9] = 18.9;
        matriz_distancia[11][10] = 40;
        matriz_distancia[11][11] = 0;
    }


    public void ingresar_vertice() {
        // Vertice Córdoba
        NodoVertice nuevo = new NodoVertice();
        nuevo.nombrev = "Córdoba";
        nuevo.siga = null;
        nuevo.sigv = cabv;
        cabv = nuevo;

        // Vertice Calarcá
        nuevo = new NodoVertice();
        nuevo.nombrev = "Calarcá";
        nuevo.siga = null;
        nuevo.sigv = cabv;
        cabv = nuevo;

        // Vertice Buenavista
        nuevo = new NodoVertice();
        nuevo.nombrev = "Buenavista";
        nuevo.siga = null;
        nuevo.sigv = cabv;
        cabv = nuevo;

        // Vertice Génova
        nuevo = new NodoVertice();
        nuevo.nombrev = "Génova";
        nuevo.siga = null;
        nuevo.sigv = cabv;
        cabv = nuevo;

        // Vertice Pijao
        nuevo = new NodoVertice();
        nuevo.nombrev = "Pijao";
        nuevo.siga = null;
        nuevo.sigv = cabv;
        cabv = nuevo;

        // Vertice Montenegro
        nuevo = new NodoVertice();
        nuevo.nombrev = "Montenegro";
        nuevo.siga = null;
        nuevo.sigv = cabv;
        cabv = nuevo;

        // Vertice Quimbaya
        nuevo = new NodoVertice();
        nuevo.nombrev = "Quimbaya";
        nuevo.siga = null;
        nuevo.sigv = cabv;
        cabv = nuevo;

        // Vertice Filandia
        nuevo = new NodoVertice();
        nuevo.nombrev = "Filandia";
        nuevo.siga = null;
        nuevo.sigv = cabv;
        cabv = nuevo;

        // Vertice La Tebaida
        nuevo = new NodoVertice();
        nuevo.nombrev = "La Tebaida";
        nuevo.siga = null;
        nuevo.sigv = cabv;
        cabv = nuevo;

        // Vertice Circasia
        nuevo = new NodoVertice();
        nuevo.nombrev = "Circasia";
        nuevo.siga = null;
        nuevo.sigv = cabv;
        cabv = nuevo;

        // Vertice Salento
        nuevo = new NodoVertice();
        nuevo.nombrev = "Salento";
        nuevo.siga = null;
        nuevo.sigv = cabv;
        cabv = nuevo;

        // Vertice Armenia
        nuevo = new NodoVertice();
        nuevo.nombrev = "Armenia";
        nuevo.siga = null;
        nuevo.sigv = cabv;
        cabv = nuevo;
    }


    public   void ingresar_arista_vertice(){
        int ban=0; //0 falso y 1 verdadero
        // en esta parte se retoman los valores de la matriz de adyacencia
        // se crean las aristas para cada vertice

        //vertice armenia ******************************************************************************************
        caba=null;
        ban=0;
        if (matriz_distancia[0][0]!=0.0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[0][0];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Armenia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[0][1]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[0][1];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Salento")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        if (matriz_distancia[0][2]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[0][2];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Circasia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[0][3]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[0][3];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("La Tebaida")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        ban=0;
        if (matriz_distancia[0][6]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[0][6];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Montenegro")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }



        ban=0;
        if (matriz_distancia[0][10]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[0][10];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Calarcá")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Armenia")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        //----------------------------
        caba=null;
        ban=0;
        if (matriz_distancia[1][0]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[1][0];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Armenia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[1][1]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[1][1];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Salento")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        if (matriz_distancia[1][2]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[1][2];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Circasia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[1][4]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[1][4];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Filandia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[0][10]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[0][10];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Calarcá")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Salento")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        //----------------------------
        caba=null;
        ban=0;
        if (matriz_distancia[2][0]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[2][0];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Armenia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[2][1]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[2][1];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Salento")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        if (matriz_distancia[2][2]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[2][2];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Circasia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[2][4]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[2][4];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Filandia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[2][7]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[2][7];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Montenegro")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Circasia")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        //----------------------------
        caba=null;
        ban=0;
        if (matriz_distancia[3][0]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[3][0];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Armenia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[3][6]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[3][6];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Montenegro")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        if (matriz_distancia[3][10]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[3][10];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Calarcá")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[3][3]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[3][3];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("La Tebaida")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("La Tebaida")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        //----------------------------
        caba=null;
        ban=0;
        if (matriz_distancia[4][1]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[4][1];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Salento")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[4][5]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[4][5];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Quimbaya")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        if (matriz_distancia[4][2]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[4][2];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Circasia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[4][4]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[4][4];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Filandia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Filandia")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        //----------------------------
        caba=null;
        ban=0;
        if (matriz_distancia[5][4]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[5][4];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Filandia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[5][6]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[5][6];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Montenegro")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        if (matriz_distancia[5][5]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[5][5];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Quimbaya")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Quimbaya")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        //----------------------------
        caba=null;
        ban=0;
        if (matriz_distancia[6][0]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[6][0];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Armenia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[6][5]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[6][5];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Quimabaya")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        if (matriz_distancia[6][2]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[6][2];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Circasia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[6][3]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[6][3];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("La Tebaida")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[6][6]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[6][6];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Montenegro")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Montenegro")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        //----------------------------
        caba=null;
        ban=0;
        if (matriz_distancia[7][10]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[7][10];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Calarcá")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[7][11]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[7][11];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Córdoba")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        if (matriz_distancia[7][9]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[7][9];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Buenavista")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[7][8]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[7][8];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Génova")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[7][7]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[7][7];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Pijao")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Pijao")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        //----------------------------
        caba=null;
        ban=0;
        if (matriz_distancia[8][7]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[8][7];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Pijao")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[8][8]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[8][8];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Génova")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }
        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Génova")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        //----------------------------
        caba=null;
        ban=0;
        if (matriz_distancia[9][10]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[9][10];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Calarcá")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[9][11]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[9][11];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Córdoba")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        if (matriz_distancia[9][7]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[9][7];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Pijao")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[9][9]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[9][9];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Buenavista")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }
        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Buenavista")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        //----------------------------
        caba=null;
        ban=0;
        if (matriz_distancia[10][0]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[10][0];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Armenia")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[10][1]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[10][1];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Salento")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }


        if (matriz_distancia[10][3]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[10][3];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("La Tebaida")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[10][7]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[10][7];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Pijao")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[10][10]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[10][10];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Calarcá")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }
        ban=0;
        if (matriz_distancia[10][9]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[10][9];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Buenavista")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }
        ban=0;
        if (matriz_distancia[10][11]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[10][11];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Córdoba")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Calarcá")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }
        //----------------------------
        caba=null;
        ban=0;
        if (matriz_distancia[11][7]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[11][7];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Pijao")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        ban=0;
        if (matriz_distancia[11][10]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[11][10];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Calarcá")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }
        ban=0;
        if (matriz_distancia[11][9]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[11][9];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Buenavista")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }
        ban=0;
        if (matriz_distancia[11][11]!=0){// si es diferente de 0 cero es porque se presenta una arista
            NodoArista nuevo=new NodoArista();
            nuevo.distancia=matriz_distancia[11][11];
            // buscando vertice para enlazar arista a vertice
            movilv=cabv;
            while((ban==0)&&(movilv!=null)){
                if(movilv.nombrev.equals("Córdoba")){
                    ban=1;
                    nuevo.sigv=movilv;
                }
                movilv=movilv.sigv;
            }
            nuevo.siga=caba;
            caba=nuevo;
        }

        //buscar ciudad en la lista de vertices
        movilv=cabv;
        ban=0;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals("Córdoba")){
                ban=1;
                //codigo para enlazar el vertice a la lista de aristas
                movilv.siga=caba;
            }
            movilv=movilv.sigv;
        }


    }
    public  void imprimir_vertices(){
        movilv=cabv;
        while(movilv!=null){
            System.out.println(movilv.nombrev);
            movilv=movilv.sigv;
        }

    }
    public  void imprimir_aristas_vertice()throws IOException{
        int ban=0;
        BufferedReader Teclado;
        Teclado=new BufferedReader(new InputStreamReader(System.in));
        String Vertice=new String("");
        System.out.println("Digite el nombre del vertice");
        Vertice=Teclado.readLine();
        movilv=cabv;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals(Vertice)){
                ban=1;
                movila=movilv.siga;
                while (movila!=null && movilv.nombrev!=Vertice){
                    System.out.println("A " + movila.sigv.nombrev + " distancia = " + movila.distancia);
                    movila=movila.siga;
                }
            }
            movilv=movilv.sigv;
        }
    }
    public void consultar_distancia_origen_destino()throws IOException{
        int ban=0;
        BufferedReader Teclado;
        Teclado=new BufferedReader(new InputStreamReader(System.in));
        String VerticeOrigen=new String("");
        String VerticeDestino=new String("");
        System.out.println("Digite el nombre del vertice de Origen");
        VerticeOrigen=Teclado.readLine();
        System.out.println("Digite el nombre del vertice de Destino");
        VerticeDestino=Teclado.readLine();
        movilv=cabv;
        while((ban==0)&&(movilv!=null)){
            if(movilv.nombrev.equals(VerticeOrigen)){
                ban=1;
                movila=movilv.siga;
                while (movila!=null){
                    if (VerticeDestino.equals(movila.sigv.nombrev))
                        System.out.println("De " + movilv.nombrev + " A " + movila.sigv.nombrev + " distancia = " + movila.distancia);
                    movila=movila.siga;
                }
            }
            movilv=movilv.sigv;
        }
    }
    public  void destruir_grafo(){
        NodoVertice borrav;
        NodoArista borraa;
        borrav = cabv;
        movilv = cabv;
        while(movilv != null){
            movilv = movilv.sigv;
            borraa = borrav.siga;
            movila = borrav.siga;
            while(movila != null){
                movila = movila.siga;
                borraa = null;
                borraa = movila;
            }
            borrav = null;
            borrav = movilv;
        }
    }
}// //fin de la clase Grafos
//inicio de la clase TestGrafos
class TestGrafos{

    public static void main(String arg[])throws IOException{
        int opc =0;
        BufferedReader Teclado;
        Teclado=new BufferedReader(new InputStreamReader(System.in));
        Grafos F= new Grafos();
        F.inicializar_grafo();
        F.inicializar_matriz_de_adyacencia_distancias();
        F.ingresar_vertice();
        F.ingresar_arista_vertice();
        do{ //menu principal
            System.out.println("1. Imprimir Vertices");
            System.out.println("2. Imprimir Aristas de Vertice");
            System.out.println("3. Consultar Distancia entre dos Vertices");
            System.out.println("4. Salir");
            System.out.println("digite la opcion");
            opc=Integer.parseInt(Teclado.readLine());
            switch(opc){
                case 1: F.imprimir_vertices();
                    break;
                case 2: F.imprimir_aristas_vertice();
                    break;
                case 3: F.consultar_distancia_origen_destino();
                    break;
            }
        }while(opc!=4);
        F.destruir_grafo();
    }
}//fin de la clase TestGrafos