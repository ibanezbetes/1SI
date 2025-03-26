#include &lt;stdio.h&gt;
 
/* la funciÃƒÂ³n main comienza la ejecuciÃƒÂ³n del programa */
int main()
{   int suma = 0; /* inicializa la suma */
   int numero;  /* nÃƒÂºmera a adicionar a suma */
 
   for ( numero = 2; numero &lt;= 100; numero += 2 ) {
      suma += numero; /* suma el nÃƒÂºmero a suma */   } /* fin de
for */
 
    printf ( &quot;La suma es %d\n&quot;, suma ); /* muestra la suma */
 
   return 0; /* indica terminaciÃƒÂ³n exitosa del programa */ 
} /* fin de la funciÃƒÂ³n main */