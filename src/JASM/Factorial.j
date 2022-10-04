.source Factorial.java		;Estas son las directivas
.class public Factorial		;Nombre de la clase
.super java/lang/Object		;Nombre de la superclase
.method public static main([Ljava/lang/String;)V
.limit stack 5			;Tamanio del Stack
.limit locals 2			;Cantidad de variables locales del método

bipush 1			;mete 1 a la pila
istore_0			;variable_0 = tope de la pila (variable_0 = 1)
				;(Note que la pila ahora está vacia)

getstatic java/lang/System/out Ljava/io/PrintStream;	;Mete el atributo estático out en la pila
ldc "Introduzca una cantidad: "				;Mete el string "Introduzca..." al tope de la pila
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V ;Llama al método print (note que la pila queda vacia)

new java/io/BufferedReader
dup				;Las siguientes 6 instrucciones leen un string y lo ponen
new java/io/InputStreamReader
dup 			;en el tope de la pila
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/io/InputStreamReader/<init>(Ljava/io/InputStream;)V 
invokespecial java/io/BufferedReader/<init>(Ljava/io/Reader;)V  
invokevirtual java/io/BufferedReader/readLine()Ljava/lang/String;

invokestatic java/lang/Integer/parseInt(Ljava/lang/String;)I ;convierte el String del tope de la pila en entero

istore_1		;variable_1 = tope de la pila
etiqueta0:		
iload_1			;mete variable_1 en la pila
bipush 0		;mete 0 en la pila
if_icmpne etiqueta1	;compara los dos elementos del tope de la pila si no iguales son va a etiqueta1
goto etiqueta2		;si son iguales, salta a la etiqueta2
etiqueta1:		
iload_0			;mete variable_0 a la pila
iload_1			;mete variable_1 a la pila
imul			;saca y multiplica los dos elementos del tope y almacena resultado en el tope
istore_0		;almacena resultado en la variable_0
iload_1			;mete variable_1 a la pila
bipush 1		;mete 1 a la pila
isub			;resta siguiente del tope - tope (o sea variable_1 - 1)
istore_1		;almacena resultado en variable_1 (o sea variable_1 = variable_1 - 1)	
goto etiqueta0		;salta a etiqueta0
etiqueta2:		
getstatic java/lang/System/out Ljava/io/PrintStream;	;la siguientes 3 instrucciones imprimen el 
iload_0							;contenido de la variable_0 en la pantalla
invokevirtual java/io/PrintStream/println(I)V
return
.end method