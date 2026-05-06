import os
import re

def modificar_contenido_p(archivo_html):
    try:
        # Leer el contenido del archivo HTML
        with open(archivo_html, 'r', encoding='utf-8') as archivo:
            lineas = archivo.readlines()
        
        # Expresión regular para buscar las líneas
        Titulo = re.compile(rf'        <title>(.*?)</title>')
        TituloEnlace = re.compile(rf'        <p id="titulo_enlace">(.*?)</p>')

        # Introducir lo que se quiere para los Títulos
        TituloReemplazo = input("Introduce el nuevo Título: ")
        
        # Buscar y modificar las líneas
        for i, linea in enumerate(lineas):

            if Titulo.search(linea):
                # Mostrar la línea original del Titulo
                print(f"Línea encontrada: {linea.strip()}")
                
                # Reemplazar el contenido entre las etiquetas <title> y </title>
                lineas[i] = Titulo.sub(f'        <title>{TituloReemplazo}</title>', linea)
                print("Línea modificada correctamente.")

            if TituloEnlace.search(linea):
                # Mostrar la línea original del TituloEnlace
                print(f"Línea encontrada: {linea.strip()}")
                
                # Reemplazar el contenido entre las etiquetas <p> y </p>
                lineas[i] = TituloEnlace.sub(f'        <p id="titulo_enlace">{TituloReemplazo}</p>', linea)
                print("Línea modificada correctamente.")
                break
        else:
            print(f"No se encontró la Línea.")
            return

        # Guardar los cambios en el archivo
        with open(archivo_html, 'w', encoding='utf-8') as archivo:
            archivo.writelines(lineas)
        
        print("El archivo ha sido modificado correctamente.")
    
    except FileNotFoundError:
        print(f"El archivo '{archivo_html}' no existe.")
    except Exception as e:
        print(f"Se produjo un error: {e}")

# Obtener la ruta del directorio que contiene el script actual
script_directory = os.path.dirname(os.path.abspath(__file__))
script_directory = os.path.dirname(script_directory)
os.chdir(script_directory)

# Uso del comando
ruta_archivo = os.path.join(script_directory, "indice.html")
modificar_contenido_p(ruta_archivo)
