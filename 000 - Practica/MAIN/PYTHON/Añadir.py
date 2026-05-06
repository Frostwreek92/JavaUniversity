import os

from Añadir_carpeta.actualizar_indice import actualizar_indice
from Añadir_carpeta.agregar_html import agregar_html
from Añadir_carpeta.agregar_txt import agregar_txt

def main ():

    # Obtener la ruta del directorio que contiene el script actual
    script_directory = os.path.dirname(os.path.abspath(__file__))

    # Cambiar al directorio correcto
    script_directory = os.path.dirname(script_directory)
    os.chdir(script_directory)

    # Nombre del archivo
    nombre_archivo = input("Ingrese el Título: ").upper()

    #Actualizar el índice
    actualizar_indice(script_directory, nombre_archivo)

    #Crear archivo HTML
    agregar_html(script_directory, nombre_archivo)

    #Crear archivo TXT
    agregar_txt(script_directory, nombre_archivo)

    print("Archivos creados y actualizados correctamente.")

if __name__ == "__main__":
    main()