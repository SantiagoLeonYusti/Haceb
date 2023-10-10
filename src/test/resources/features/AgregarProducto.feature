#language: es
Característica: Añadir producto al carro

  @AgregarProducto
  Escenario: El usuario añade un producto alatorio de la categoria Electrodomesticos de cocina al carro de compras en la pagina de haceb
    Dado que el usuario abre la pagina de web de haceb
    Cuando seleccione categorias y selecciones Electroomesticos de cocina y selecciones un producto aleatorio y este se agregue al carro de compras
    Entonces el usuario podra ver que el producto se agrego exitosamente al carro de compras
