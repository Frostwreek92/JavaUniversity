import os

def agregar_txt(script_directory, nombre_archivo):
    print("Ingrese el contenido del archivo. Pulse Enter dos veces seguidas en líneas vacías para finalizar:")
    
    lineas = []
    contador_lineas_vacias = 0

    while True:
        linea = input()
        if linea == "":
            contador_lineas_vacias += 1
            if contador_lineas_vacias == 2:
                break
            lineas.append("")  # Añadir línea vacía para reflejar salto de línea simple
        else:
            contador_lineas_vacias = 0
            lineas.append(linea)
    
    # Procesamiento del texto completo
    contenido_personalizado = []

    for linea in lineas:
        if linea == "":
            contenido_personalizado.append("<br>\n")  # Añade salto de línea
        else:
            linea = linea.replace("<", "&lt;")  # Reemplaza '<' por '&lt;'
            linea = linea.replace(">", "&gt;")  # Reemplaza '>' por '&gt;'
            linea = linea.replace("    ", "&emsp;")  # Reemplaza '    ' por '&emsp;'
            contenido_personalizado.append(linea + "<br>\n")

    contenido_personalizado = "".join(contenido_personalizado)

    contenido_txt = '''<!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" type="text/css" href="../CSS/estiloTXT.css" media="screen" />
            <title>{0}</title>
        </head>
        <body>
            <p>
    {1}
            </p>
        </body>
    </html>
            <!--
                &emsp; = Tabular grande
                &ensp; = Tabular pequeña
                <br> = Salto de línea
                &lt; = <
                &gt; = >
            -->'''.format(nombre_archivo, contenido_personalizado)

    directorio_txt = os.path.join(script_directory, 'TXT')

    if not os.path.exists(directorio_txt):
        os.makedirs(directorio_txt)

    ruta_txt = os.path.join(directorio_txt, nombre_archivo + '.html')

    with open(ruta_txt, 'w', encoding='utf-8') as archivo_txt:
        archivo_txt.write(contenido_txt)

    print("Ruta TXT:", ruta_txt)
