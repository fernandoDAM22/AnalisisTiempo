#Imports
import matplotlib.pyplot as plt
#Import del modulo que permite crear graficos
from controller import crear_graficos as grapichFactory

def mostrarGraficoBarras(flag):
    """
    Esta funcion permite mostrar un grafico de barras
    """
    grapichFactory.graficoDeBarras(flag)
    plt.legend(bbox_to_anchor=(0, 1), loc='upper left')
    plt.show()

def mostrarGraficoLineas(flag):
    """
    Esta funcion permite mostrar un grafico de lineas
    """
    grapichFactory.graficoDeLineas(flag)
    plt.legend(bbox_to_anchor=(0, 1), loc='upper left')
    plt.show()

def mostrarGraficoPuntos(flag):
    """
    Esta funcion permite mostrar un grafico de puntos
    """
    grapichFactory.graficoDePuntos(flag)
    plt.legend(bbox_to_anchor=(0, 1), loc='upper left')
    plt.show()

def mostrarGraficoDispersion(flag):
    """
    Esta funcion permite mostrar un grafico de dispersion
    """
    grapichFactory.graficoDeDispersion(flag)
    plt.legend(bbox_to_anchor=(0, 1), loc='upper left')
    plt.show()