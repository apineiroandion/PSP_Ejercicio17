# Ejercicio 17
## Enunciado

Escribe una clase llamada Parking que reciba el número de plazas del aparcamiento y el número de
coches existentes en el sistema. Se deben crear tantos hilos como coches haya. El aparcamiento
tendrá una única entrada y una única salida.
En la entrada de vehículos habrá un dispositivo de control que permita o impida el acceso al
aparcamiento, dependiendo del estado actual del mismo (plazas de aparcamiento disponibles). Los
tiempos de espera de los vehículos dentro del aparcamiento son aleatorios. En el momento en que
un vehículo salga del aparcamiento, notificará al dispositivo de control el número de plaza que tenía
asignada, y se liberará la plaza que estaba ocupando, quedando así nuevamente disponible. Un
vehículo que haya salido del aparcamiento esperará un tiempo aleatorio para volver a entrar
nuevamente al mismo.

Por tanto, los vehículos estarán entrando y saliendo indefinidamente del aparcamiento.

### Ejemplo de ejecución:

ENTRADA: Coche 1 aparca en 0.
Plazas libres: 5
Parking: [1] [0] [0] [0] [0] [0]

ENTRADA: Coche 2 aparca en 1.
Plazas libres: 4
Parking: [1] [2] [0] [0] [0] [0]

ENTRADA: Coche 3 aparca en 2.
Plazas libres: 3
Parking: [1] [2] [3] [0] [0] [0]

ENTRADA: Coche 4 aparca en 3.
Plazas libres: 2
Parking: [1] [2] [3] [4] [0] [0]

ENTRADA: Coche 5 aparca en 4.
Plazas libres: 1
Parking: [1] [2] [3] [4] [5] [0]

SAÍDA: Coche 2 saliendo.
Plazas libres: 2
Parking: [1] [0] [3] [4] [5] [0]