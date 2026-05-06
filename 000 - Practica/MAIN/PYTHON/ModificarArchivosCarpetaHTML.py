import os
import re

def procesar_archivo(nombre_archivo):
    # Leer el contenido del archivo HTML
    with open(nombre_archivo, 'r', encoding='utf-8') as archivo:
        contenido = archivo.read()

    # Realizar las modificaciones utilizando expresiones regulares
        # Esta línea se cambia lo que haya en rojo por lo que se deba cambiar
        # (.*?) Se usa en lo que se lee para que evite el contenido desde donde se escribe hasta lo siguiente que aparece detrás
        # \1 Se usa en lo que se escribe para que evite el contenido desde donde se escribe hasta lo siguiente que aparece detrás
    contenido_modificado = re.sub(r'<h1 class="titulo_enlace">(.*?)</h1>', r'<p class="titulo_enlace">\1</p>', contenido)

    # Escribir el contenido modificado de nuevo al archivo
    with open(nombre_archivo, 'w', encoding='utf-8') as archivo:
        archivo.write(contenido_modificado)

# Obtener la ruta del directorio HTML
directorio_html = os.path.join(os.path.dirname(__file__), '..', 'HTML')

# Recorrer todos los archivos en el directorio HTML
for nombre_archivo in os.listdir(directorio_html):
    ruta_archivo = os.path.join(directorio_html, nombre_archivo)

    # Verificar si el archivo es un archivo HTML
    if os.path.isfile(ruta_archivo) and nombre_archivo.endswith('.html'):
        procesar_archivo(ruta_archivo)

print('Proceso completado.')
