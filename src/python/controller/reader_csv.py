
import pandas as pd
def obtenerDatos(path):
    """
    Esta funcion retorna un dataframe con los datos de los avistamientos
    Params:
        path: la ruta del archivo que va a leer
    Return:
        el data frame obtenido del archivo leido
    """
    return pd.read_csv(path)
