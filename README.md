# 6.3.Actividad_Taller
Repo de prácticas. Tarea: Diseñar, implementar y documentar la estructura de una aplicación para un taller, aplicando ingeniería directa e inversa.

## Decisiones de Diseño (Fase 3)

### 1. Composición entre Vehiculo y Reparacion
Se ha elegido **Composición** porque el enunciado indica explícitamente que existe un "vínculo fuerte" y que una reparación no tiene sentido sin un vehículo. El ciclo de vida de la reparación está estrictamente ligado al del vehículo; si el vehículo desaparece del sistema, su historial de reparaciones se destruye con él.

### 2. Ventaja de usar la interfaz Especialista
Aporta flexibilidad y bajo acoplamiento, cumpliendo con el principio Open/Closed de SOLID. Si el taller contrata mañana a un Electricista o a un Chapista, solo tendrán que implementar la interfaz `Especialista`. La clase `Taller` podrá interactuar con ellos sin tener que modificar su código interno.