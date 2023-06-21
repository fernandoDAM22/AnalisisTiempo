import os
directorio_actual = os.path.dirname(os.path.abspath(__file__))
ruta_archivo_temperatura = os.path.join(directorio_actual, "../assets/temperatura.csv")
ruta_archivo_humedad = os.path.join(directorio_actual,"../assets/humedad.csv")

def valores(flag):
    if flag == "t":
        claves = {
            "archivo" : ruta_archivo_temperatura,
            "columna" : "Temperatura",
            "color" :  "red"
        }
        
    else:
        claves = {
            "archivo" : ruta_archivo_humedad,
            "columna" : "Humedad",
            "color" :  "blue"
        }
    return claves