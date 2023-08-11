#Author: Luis Mora

@Stories

Feature: Registro de usuario en la pagina de Utest

  @scenario1
  Scenario: Registro de Luis en la pagina de Utest
    Given Luis quiere registrarse en la pagina de Utest
    When ingrese toda la informacion requerida
      | strNombre | strApellido | strEmail                | strMesNacimiento | strDiaNacimiento | strAnoNacimiento | strCiudad | strCodigoPostal | strPais | strComputador | strVersionComputador | strLenguajeComputador | strDispositivoMovil | strModeloDispositivoMovil | strSoDispositivoMovil | strContrasena |
      | Luis      | Mora        | prueba03@hotmail.com    | August           | 23               | 1999             | Cali      | 123456          | Colombia| Windows       | 10                   |Spanish                |Apple                | iPhone 11                  | iOS 13               | Luis322920**  |
    Then se completa el registro de manera exitosa
      | strTextoFinal   |
      | Complete Setup  |