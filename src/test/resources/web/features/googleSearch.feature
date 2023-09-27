@Busqueda
Feature: El cliente quiere hacer uns busqueda en el buscador de google

  Scenario Outline: El cliente necesita hacer una busqueda
    Given El cliente se encuentra en el buscador
    When El cliente hace la <Busqueda>
    Then El cliente puede ver su busqueda

    Examples:
      | Busqueda        |
      | Crowdar Academy |
      | Calidad         |
      | Software        |
      | Testing         |


