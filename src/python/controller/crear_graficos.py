from controller.reader_csv import obtenerDatos
import matplotlib.pyplot as plt
import seaborn as sns
import controller.paths as paths

def graficoDeBarras(valor):
    """
    Esta funcion permite crear un grafico de barras
    Params:
        valor: indica si queremos obtener el grafico sobre la temperatura o sobre la humedad
    Return:
        el grafico creado
    """
    claves = paths.valores(valor)
    try:
        df = obtenerDatos(claves["archivo"])
        graphic = sns.barplot(x="Hora",y=claves["columna"],data=df,color=claves["color"])
        # Obtener la temperatura mínima
        temperatura_minima = df[claves["columna"]].min()
        temperatura_maxima = df[claves["columna"]].max()
        temperatura_media = df[claves["columna"]].mean()
        # Agregar la línea de la temperatura mínima
        graphic.axhline(temperatura_minima, color="#0abde3", linestyle="--", label="minima")
        graphic.axhline(temperatura_maxima, color="red", linestyle="--", label="maxima")
        graphic.axhline(temperatura_media, color="green", linestyle="--", label="media")
    except Exception as ex:
        print(ex)
    return graphic

def graficoDeLineas(valor):
    """
    Esta funcion permite crear un grafico de lineas
    Params:
        valor: indica si queremos obtener el grafico sobre la temperatura o sobre la humedad
    Return:
        el grafico creado
    """
    claves = paths.valores(valor)
    try:
        df = obtenerDatos(claves["archivo"])
        graphic = sns.lineplot(x="Hora",y=claves["columna"],data=df,color=claves["color"])
        # Obtener la temperatura mínima
        medicion_minima = df[claves["columna"]].min()
        medicion_maxima = df[claves["columna"]].max()
        medicion_media = df[claves["columna"]].mean()
        # Agregar la línea de la temperatura mínima
        graphic.axhline(medicion_minima, color="blue", linestyle="--", label="minima")
        graphic.axhline(medicion_maxima, color="red", linestyle="--", label="maxima")
        graphic.axhline(medicion_media, color="green", linestyle="--", label="media")
    except Exception as ex:
        print(ex)
    return graphic

def graficoDePuntos(valor):
    """
    Esta funcion permite crear un grafico de puntos
    Params:
        valor: indica si queremos obtener el grafico sobre la temperatura o sobre la humedad
    Return:
        el grafico creado
    """
    claves = paths.valores(valor)
    try:
        df = obtenerDatos(claves["archivo"])
        graphic = sns.pointplot(x="Hora",y=claves["columna"],data=df,color=claves["color"])
        # Obtener la temperatura mínima
        medicion_minima = df[claves["columna"]].min()
        medicion_maxima = df[claves["columna"]].max()
        medicion_media = df[claves["columna"]].mean()
        # Agregar la línea de la temperatura mínima
        graphic.axhline(medicion_minima, color="blue", linestyle="--", label="minima")
        graphic.axhline(medicion_maxima, color="red", linestyle="--", label="maxima")
        graphic.axhline(medicion_media, color="green", linestyle="--", label="media")
    except Exception as ex:
        print(ex)
    return graphic

def graficoDeDispersion(valor):
    """
    Esta funcion permite crear un grafico de dispersion
    Params:
        valor: indica si queremos obtener el grafico sobre la temperatura o sobre la humedad
    Return:
        el grafico creado
    """
    claves = paths.valores(valor)
    try:
        df = obtenerDatos(claves["archivo"])
        graphic = sns.scatterplot(x="Hora",y=claves["columna"],data=df,color=claves["color"],s=100)
        # Obtener la temperatura mínima
        medicion_minima = df[claves["columna"]].min()
        medicion_maxima = df[claves["columna"]].max()
        medicion_media = df[claves["columna"]].mean()
        # Agregar la línea de la temperatura mínima
        graphic.axhline(medicion_minima, color="blue", linestyle="--", label="minima")
        graphic.axhline(medicion_maxima, color="red", linestyle="--", label="maxima")
        graphic.axhline(medicion_media, color="green", linestyle="--", label="media")
    except Exception as ex:
        print(ex)
    return graphic
