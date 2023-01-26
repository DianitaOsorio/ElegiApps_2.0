#language: es

Característica: Primer cambio de apps

  @PrimeCambioApps
  Escenario: validar primer cambio  de apps 0$
    Dado que el usuario haga el primer cambio sin cobro
    Cuando da click en boton aceptar
    Entonces el cambio de apps sea exitoso
