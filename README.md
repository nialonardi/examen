# DESCRIPCION DE LO REALIZADO

## El desarrollo consta de
* un archivo de constantes para mensajes centralizado para poder reutilizarlo
* un servicio para validaciones, valida todas las entidades
* un converter para mapear entidades a dto y viceversa
* distintos tipos de parámetros en cada controller (PathVariable, RequestBody, RequestParam)
* creación de exceptions
* patrón builder
* querys jpql en algunos repositorios



##### El modelo consiste en la siguiente lógica :
* La base de datos se debe crear previamente con el nombre de payments, luego las tablas se crean con hibernate una vez que se corre el proyecto, si se agregan atributos a un modelo y se crea uno nuevo, este se refleja en la base cuando se vuelve a levantar el proyecto
* Una transacción consiste en una lista de productos (cada uno con su cantidad vendida), solicitada por un cliente y realizada por un vendedor
* El cliente, vendedor y productos vinculados a la transacción deben existir con antelación. Se proveen servicios ABM de cada uno.
* Una transacción se crea inicialmente con estado PENDIENTE. Esta puede pasar a los estados APROBADO o RECHAZADO.


#### Documentación de servicios

##### Responses
Las respuestas esperadas por cada tipo de servicio:

* GET ---> HttpStatus.OK
* POST ---> HttpStatus.CREATED
* PUT ---> HttpStatus.ACCEPTED
* DELETE ---> HttpStatus.NO_CONTENT

#### Servicios desarrollados
##### ClientService
    * listClients: Lista la totalidad de los clientes
    * findById: Retorna un cliente específico a partir de su código de cliente (id)
    * findByName: Retorna una lista de clientes cuyos nombres cumplan con el filtro provisto. Case insensitive.
    * save: Persiste un nuevo cliente
    * deleteById: Elimina un cliente a partir de su código de cliente (id)
    * update: Actualiza un cliente a partir de su código de cliente (id)

##### SellerService
    * listSellers: Lista la totalidad de los vendedores
    * findById: Retorna un vendedor específico a partir de su código de vendedor (id)
    * findByName: Retorna una lista de vendedores cuyos nombres cumplan con el filtro provisto. Case insensitive.
    * save: Persiste un nuevo vendedor
    * deleteById: Elimina un vendedor a partir de su código de vendedor (id)
    * update: Actualiza un vendedor a partir de su código de vendedor (id)

##### ProductService
    * listProducts: Lista la totalidad de los productos disponibles
    * findById: Retorna un producto específico a partir de su código de producto (id)
    * findByName: Retorna una lista de productos cuyos nombres cumplan con el filtro provisto. Case insensitive.
    * save: Persiste un nuevo producto
    * deleteById: Elimina un producto a partir de su código de producto (id)
    * update: Actualiza un producto a partir de su código de producto (id)

##### TransactionService
    * listTransactions: Lista la totalidad de las transacciones realizadas
    * save: Guarda una nueva transacción
    * deleteById: Elimina una transacción a partir de su (id)
    * updateTransactionStatusById: Actualiza el estado de la transacción. Valores aceptados (ACEPTADO, PENDIENTE, RECHAZADO)
    
    
#### Pruebas unitarias 
Las pruebas unitarias se utilizó JUnit, y las mismas se ejecutan contra una base en memoria H2.

### Se adjunta archivo json con coleccion postman para pruebas de servicios 
    
