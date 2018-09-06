import  java.util.Random ;

 classe  pública InsertionSort {

    public  static  void  main ( String [] args ) {
      Random num =  new  Random ();
       int vetor [] =  novo  int [ 5 ];       
        
        para ( int i =  0 ; i < vetor . comprimento; i ++ ) {
            
            vetor [i] = num . nextInt ( 10 );
        }

        para ( int i =  0 ; i < vetor . comprimento; i ++ ) {
            int aux = vetor [i];

            para ( int j = i -  1 ; j > =  0  && vetor [j] > aux; j - ) {
                vetor [j +  1 ] = vetor [j];
                vetor [j] = aux;
            }
        }
        para ( int i =  0 ; i < vetor . comprimento; i ++ ) {
            Sistema . fora . println (vetor [i]);
        }
        
    }
    
}