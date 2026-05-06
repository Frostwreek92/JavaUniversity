import os

def actualizar_indice(script_directory, nombre_archivo):
    # Ruta del archivo del índice
    ruta_indice_html = os.path.join(script_directory, "indice.html")

    # Leer el contenido actual del archivo indice.html
    with open(ruta_indice_html, "r", encoding='utf-8') as file:
        contenido_html = file.read()

    # Generar la línea de código para agregar
    linea_codigo = '            <p id="seccion"><a id="enlaceSeccion" href="../MAIN/HTML/{0}.html" target="_blank">{0}</a></p>'.format(nombre_archivo)

    # Buscar el punto de inserción dentro del contenido HTML
    punto_insercion = contenido_html.index('<div id="contenedor">') + len('<div id="contenedor">')

    # Insertar la línea de código en el contenido HTML en el punto de inserción
    contenido_html_actualizado = contenido_html[:punto_insercion] + "\n" + linea_codigo + contenido_html[punto_insercion:]

    # Obtener el contenido del div "contenedor"
    start_indice = contenido_html_actualizado.index('<div id="contenedor">')
    end_indice = contenido_html_actualizado.index('</div>', start_indice)
    contenedor_content = contenido_html_actualizado[start_indice:end_indice + 6]

    # Extraer los enlaces del contenido del div
    enlaces = []
    start_tag = '<p id="seccion">'
    end_tag = '</p>'
    indice = 0

    while indice < len(contenedor_content):
        start_indice = contenedor_content.find(start_tag, indice)
        if start_indice == -1:
            break

        end_indice = contenedor_content.find(end_tag, start_indice)
        if end_indice == -1:
            break

        enlace = contenedor_content[start_indice:end_indice + len(end_tag)]
        enlaces.append(enlace)

        indice = end_indice + len(end_tag)

    # Ordenar los enlaces alfabéticamente según la ruta href
    enlaces_ordenados = sorted(enlaces, key=lambda a: a[a.index('href="') + 6:a.index('"', a.index('href="') + 6)])

    # Construir el contenido HTML con los enlaces ordenados y los espacios
    nuevo_contenido = "<div id=\"contenedor\">\n"
    for enlace in enlaces_ordenados:
        nuevo_contenido += "            " + enlace + "\n"
    nuevo_contenido += "        </div>"

    # Reemplazar el div "contenedor" original con el div de enlaces ordenados en el contenido HTML
    contenido_html_actualizado = contenido_html_actualizado.replace(contenedor_content, nuevo_contenido)

    # Escribir el contenido actualizado en el archivo indice.html
    with open(ruta_indice_html, "w", encoding='utf-8') as file:
        file.write(contenido_html_actualizado)

    print("Ruta indice.html:", ruta_indice_html)