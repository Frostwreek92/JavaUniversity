import os

# Obtener la ruta del directorio que contiene el script actual
script_directory = os.path.dirname(os.path.abspath(__file__))

# Cambiar al directorio correcto
script_directory = os.path.dirname(script_directory)
os.chdir(script_directory)

# Resto del código...

nombre_archivo = input("Ingrese el nombre del archivo: ")

directorio_html = os.path.join(script_directory, 'HTML')
directorio_txt = os.path.join(script_directory, 'TXT')

ruta_html = os.path.join(directorio_html, nombre_archivo + '.html')
ruta_txt = os.path.join(directorio_txt, nombre_archivo + '.html')

# Verificar si los archivos existen antes de borrarlos
if os.path.exists(ruta_html):
    os.remove(ruta_html)
    print("Archivo HTML eliminado:", ruta_html)
else:
    print("El archivo HTML no existe:", ruta_html)

if os.path.exists(ruta_txt):
    os.remove(ruta_txt)
    print("Archivo TXT eliminado:", ruta_txt)
else:
    print("El archivo TXT no existe:", ruta_txt)

# Obtener la ruta completa del archivo indice.html
ruta_indice_html = os.path.join(script_directory, "indice.html")

# Leer el contenido actual del archivo indice.html
with open(ruta_indice_html, "r", encoding='utf-8') as file:
    contenido_html = file.read()

# Generar la línea de código para buscar y eliminar
linea_codigo = '\n            <p id="seccion"><a id="enlaceSeccion" href="../MAIN/HTML/{}.html" target="_blank">{}</a></p>'.format(nombre_archivo, nombre_archivo)

# Buscar la línea de código dentro del contenido HTML
if linea_codigo in contenido_html:
    contenido_html_actualizado = contenido_html.replace(linea_codigo, "")
    contenido_html_actualizado = contenido_html_actualizado.replace("\n\n", "\n")  # Eliminar líneas vacías adicionales
    with open(ruta_indice_html, "w", encoding='utf-8') as file:
        file.write(contenido_html_actualizado)
    print("Línea de código eliminada de indice.html")
else:
    print("La línea de código no existe en indice.html")

print("Archivos eliminados y actualización realizada correctamente.")
print("Ruta HTML:", ruta_html)
print("Ruta TXT:", ruta_txt)
print("Ruta indice.html:", ruta_indice_html)