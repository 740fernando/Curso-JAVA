
public class Anotacoes {
/*
 * Classes s�o tipos refer�ncia-Vari�veis cujo tipo s�o classes n�o devem ser entendidas como caixas, mas sim
�tent�culos� (ponteiros) para caixas
   Valor "null" - Tipos refer�ncia aceitam o valor "null", que indica que a vari�vel aponta pra ningu�m.
   Valores padr�o- Quando alocamos (new) qualquer tipo estruturado (classe ou array),
s�o atribu�dos valores padr�o aos seus elementos

                          Tipos refer�ncia vs. tipos valor
CLASSE                                            TIPO PRIMITIVO

Vantagem: usufrui de todos recursos OO            Vantagem: � mais simples e mais perform�tico

Vari�veis s�o ponteiros                           Vari�veis s�o caixas

Objetos precisam ser instanciados usando new, ou  N�o instancia. Uma vez declarados, est�o prontos
apontar para um objeto j� existente.              para uso.  

Aceita valor null                                 N�o aceita valor null

Y = X;                                            Y = X;
"Y passa a apontar para onde X aponta"            "Y recebe uma c�pia de X"

Objetos instanciados no heap                       "Objetos" instanciados no stack

Objetos n�o utilizados s�o desalocados em um       "Objetos" s�o desalocados imediatamente quando
momento pr�ximo pelo garbage collector              seu escopo de execu��o � finalizado

Garbage collector
� � um processo que automatiza o gerenciamento de mem�ria de um
programa em execu��o
� O garbage collector monitora os objetos alocados dinamicamente
pelo programa (no heap), desalocando aqueles que n�o est�o mais
sendo utilizados.

� Objetos alocados dinamicamente, quando n�o possuem mais
refer�ncia para eles, ser�o desalocados pelo garbage collector
� Vari�veis locais s�o desalocadas imediatamente assim que seu escopo
local sai de execu��o


 */
}
