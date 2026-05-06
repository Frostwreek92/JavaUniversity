import os

def agregar_html(script_directory, nombre_archivo):

    # Genera el contenido del archivo HTML
    contenido_html = '''<!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" type="text/css" href="../CSS/estiloHTML.css" media="screen" />
            <script type="text/javascript" src="../SCRIPT/scriptHTML.js"></script>
            <title>{0}</title>
        </head>
        <body>
            <p class="titulo_enlace">{0}</p>
            <br>
            <iframe id="datos" src="../TXT/{0}.html" frameborder="0"></iframe>
            <script type="text/javascript" src="../SCRIPT/scriptHTML.js"></script>
            <button id="cerrar">Cerrar Ventana</button>
        </body>
    </html>'''.format(nombre_archivo)

    directorio_html = os.path.join(script_directory, 'HTML')
    
    if not os.path.exists(directorio_html):
        os.makedirs(directorio_html)

    ruta_html = os.path.join(directorio_html, nombre_archivo + '.html')

    with open(ruta_html, 'w', encoding='utf-8') as archivo_html:
        archivo_html.write(contenido_html)

    print("Ruta HTML:", ruta_html)