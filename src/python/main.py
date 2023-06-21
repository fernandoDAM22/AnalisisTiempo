#Imports necesarios
import sys
from view import mostrar_graficos as frame


def case1(flag):
    frame.mostrarGraficoBarras(flag)
def case2(flag):
    frame.mostrarGraficoLineas(flag)
def case3(flag):
    frame.mostrarGraficoPuntos(flag)
def case4(flag):
    frame.mostrarGraficoDispersion(flag)

#definimos los casos que nos pueden dar en funcion del argumento que se indique
casos = {
    1: case1,
    2: case2,
    3: case3,
    4: case4
}
#obtenemos la medicion y el tipo de grafico que queremos
medicion = sys.argv[1]
option = int(sys.argv[2])
#obtenemos la clave para que los metodos sepan de que medicion queremos obtener los graficos
param = medicion.replace("-","")
#obtenemos el caso a ejecutar
accion = casos.get(option,None)
#lo ejecutamos 
try:
    accion(param)
except Exception as ex:
    print(ex)