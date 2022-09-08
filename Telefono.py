# ESCRIBIR EN EL TELEFONO

# GUARDADO DE CONTACTOS POR MEDIO DE FICHEROS
letras_Numeros = {

    'A' : '2',
    'B' : '22',
    'C' : '222',
    'D' : '3',
    'E' : '33',
    'F' : '333',
    'G' : '4',
    'H' : '44',
    'I' : '444',
    'J' : '5',
    'K' : '55',
    'L' : '555',
    'M' : '6',
    'N' : '66',
    'O' : '666',
    'P' : '7',
    'Q' : '77',
    'R' : '777',
    'S' : '7777',
    'T' : '8',
    'U' : '88',
    'V' : '888',
    'W' : '9',
    'X' : '99',
    'Y' : '999',
    'Z' : '9999'

}

# FICHERO DE ALMACENAMIENTO
with open('texto_Numeros.txt' , 'a') as tn :
    tn.write('')
    tn.close()

# GUARDAR DATOS DENTRO DEL FICHERO
def guardar_Contacto() :
    contacto = ''
    texto_Volteado = str(entry_pantalla.get())
    lista = letras_Numeros.keys()
    for i in texto_Volteado :
        if i in lista :
            contacto += (str(letras_Numeros.get(i)) + ' ')
    contacto += ('-' + texto_Volteado)
    with open('texto_Numeros.txt', 'a') as tn:
        tn.write(contacto+'\n')
        tn.close()


# MOSTRAR CONTENIDO DENTRO DE MARCOS
def mostrar_Marco(ventana) :
    ventana.tkraise()

# MOSTRAR CONTACTOS
def mostrar_Contacos(destino) :
    with open('texto_Numeros.txt', 'r') as tn:
        contactos = tn.read()
        tn.close()
    destino.delete(1.0 , 'end')
    destino.insert('end' , contactos)

# MOSTRAR LA HORA Y FECHA
def mostrar_Hora() :
    hora = strftime('%H:%M:%S')
    fecha = strftime('%d - %m - %y')
    label_hora.config(text = hora)
    label_fecha.config(text = fecha)
    label_hora.after(1000 , mostrar_Hora)
    label_hora_Contacto.config(text=hora)
    label_fecha_Contacto.config(text=fecha)
    label_hora_Contacto.after(1000, mostrar_Hora)

# ANIMACION Y LLAMADA
def hacer_Llamada() :
    texto_Volteado = str(entry_pantalla.get())
    texto_Normalizado = texto_Volteado[::-1]
    entry_pantalla.delete(0 , 'end')
    entry_pantalla.insert(0 , texto_Normalizado)
    entry_pantalla.config(state = 'disabled')
    mixer.init()
    mixer.music.load("TONO.mp3")
    mixer.music.play()


# SONIDO DE MARCAR
def marcar_telefono() :
    mixer.init()
    mixer.music.load("TTECLA.mp3")
    mixer.music.play()


# BOTON UNO
def boton_Uno() :
    entry_pantalla.insert('end' , ' ')
    marcar_telefono()

# BOTON DOS
def boton_Dos() :
    entry_pantalla.insert('end' , '2')
    marcar_telefono()

# BOTON TRES
def boton_Tres() :
    entry_pantalla.insert('end' , '3')
    marcar_telefono()

# BOTON CUATRO
def boton_Cuatro() :
    entry_pantalla.insert('end' , '4')
    marcar_telefono()

# BOTON CINCO
def boton_Cinco() :
    entry_pantalla.insert('end' , '5')
    marcar_telefono()

# BOTON SEIS
def boton_Seis() :
    entry_pantalla.insert('end' , '6')
    marcar_telefono()

# BOTON SIETE
def boton_Siete() :
    entry_pantalla.insert('end' , '7')
    marcar_telefono()

# BOTON OCHO
def boton_Ocho() :
    entry_pantalla.insert('end' , '8')
    marcar_telefono()

# BOTON NUEVE
def boton_Nueve() :
    entry_pantalla.insert('end' , '9')
    marcar_telefono()


'''
POR CADA PULSACION DE UN BOTON, LOS VALORES DE VERDAD DE CADA LETRA SE REINICIAN PARA PODER INICIAR
DESDE LA LETRA DESEADA, COMO EJEMPLO LA FRASE AA SE ESCRIBIRIA PRECIONANDO DOS VECE SEL BOTON DE 2, POR TANTO

AA == 22

SIN EMBARGO, AL MOMENTO DE TOCAR CADA TECLA, LOS VALORES, POR SE GLOBALES SIGUEN CON UN VALOR PREDETERMINADO
O ALTERADO.
PARA SOLUCIONAR EL PROBLEMA AA == 22, PRECIONAMOS ENTRE CADA PULSACION DENTRO DE LA MISMA TECLA LA TECLA 1, 
DE TAL MANERA QUE

AA == 212

PUESTO QUE EL NUMERO 1 REINICIARA LOS VALORES DE TODO EL TECLADO
'''


import tkinter as tk      # IMPORTAR MODULO TKINTER
from time import strftime # IMPORTAR MODULO STRFTIME
from pygame import mixer  # IMPORTAR MODULO MIXER

# VENTANA PRINCIPAL
ventana_Principal = tk.Tk()
ventana_Principal.rowconfigure(0 , weight = 1)
ventana_Principal.columnconfigure(0 , weight = 1)
ventana_Principal.title('SONY ERICSSON +')
ventana_Principal.resizable(width = False , height = False)
ventana_Principal.geometry('400x600')

# MARCOS DENTRO DEL MENU DE CELULAR
menu_Principal = tk.Frame(ventana_Principal , bg = 'azure2')
telefono = tk.Frame(ventana_Principal , bg = 'black')
contactos = tk.Frame(ventana_Principal , bg = 'azure2')

# CICLO DE FRAMES
for i in (telefono , contactos , menu_Principal) :
    i.grid(row=0, column=0, sticky='nsew')

# ============================================MENU PRINCIPAL============================================
boton_telefono = tk.Button(menu_Principal , text = 'TELEFONO' , width = 25 , height = 6 , bg = 'CadetBlue2' ,
                           command = lambda : mostrar_Marco(telefono))  # MARCO DEL TELEFONO
boton_contactos = tk.Button(menu_Principal , text = 'CONTACTOS' , width = 25 , height = 6 , bg = 'CadetBlue2' ,
                           command = lambda : mostrar_Marco(contactos)) # MARCO DE CONTACTOS

# USO DE LABELS
label_titulo = tk.Label(menu_Principal , text = 'SONY ERICSSON +' # TITULO
                        , width = 20 , height = 4 , bg = 'DarkCyan' , font = ('monospace' , 15 , 'italic'))
label_hora = tk.Label(menu_Principal , text = ' '                 # HORA
                      , width = 25 , height = 3 , bg = 'DarkCyan' , font = ('Radioland' , 10 , 'italic'))
label_fecha = tk.Label(menu_Principal , text = ' '                # FECHAR
                      , width = 25 , height = 3 , bg = 'DarkCyan' , font = ('monospace' , 10 , 'italic'))

# POSICIONAMIENTO DE LOS BOTONES Y LABELS
boton_telefono.place(x = 110 , y = 125)
boton_contactos.place(x = 110 , y = 275)
label_titulo.place(x = 0 , y = 0)
label_hora.place(x = 225 , y = 0)
label_fecha.place(x = 225 , y = 48)

# ============================================MENU TELEFONO============================================
boton_1 = tk.Button(telefono , text = '1\nESPACIO' , width = 15 , height = 3 , bg = 'DimGrey'
                    , command = lambda : boton_Uno()) # UNO
boton_2 = tk.Button(telefono , text = '2\nABC' , width = 15 , height = 3 , bg = 'DimGrey'
                    , command = lambda : boton_Dos()) # DOS
boton_3 = tk.Button(telefono , text = '3\nDEF' , width = 15 , height = 3 , bg = 'DimGrey'
                    , command = lambda : boton_Tres()) # TRES
boton_4 = tk.Button(telefono , text = '4\nGHI' , width = 15 , height = 3 , bg = 'DimGrey'
                    , command = lambda : boton_Cuatro()) # CUATRO
boton_5 = tk.Button(telefono , text = '5\nJKL' , width = 15 , height = 3 , bg = 'DimGrey'
                    , command = lambda : boton_Cinco()) # CINCO
boton_6 = tk.Button(telefono , text = '6\nMNO' , width = 15 , height = 3 , bg = 'DimGrey'
                    , command = lambda : boton_Seis()) # SEIS
boton_7 = tk.Button(telefono , text = '7\nPQRS' , width = 15 , height = 3 , bg = 'DimGrey'
                    , command = lambda : boton_Siete()) # SIETE
boton_8 = tk.Button(telefono , text = '8\nTUV' , width = 15 , height = 3 , bg = 'DimGrey'
                    , command = lambda : boton_Ocho()) # OCHO
boton_9 = tk.Button(telefono , text = '9\nWXYZ' , width = 15 , height = 3 , bg = 'DimGrey'
                    , command = lambda : boton_Nueve()) # NUEVE
boton_Llamada = tk.Button(telefono , text = 'MARCAR\nORDENAR' , width = 15 , height = 3 , bg = 'lime' ,
                          command = lambda : hacer_Llamada()) # LLAMADA
boton_Guardar = tk.Button(telefono , text = 'GUARDAR\nCONTACTO' , width = 15 , height = 3 , bg = 'aqua' ,
                          command = lambda : guardar_Contacto()) # GUARDAR
boton_Regresar = tk.Button(telefono , text = 'REGRESAR' , width = 15 , height = 3 , bg = 'aqua' ,
                          command = lambda : mostrar_Marco(menu_Principal)) # REGRESAR

# USO DE ENTRY
entry_pantalla = tk.Entry(telefono , font = 'Monsterrat 16' , bg = 'DimGray')
entry_pantalla.insert(0 , '  ')


# POSICIONAMIENTO DE BOTONES Y LABELS
entry_pantalla.place(x = 25 , y = 20 , width = 350 , height = 120)
boton_1.place(x = 10 , y = 150)
boton_2.place(x = 145 , y = 150)
boton_3.place(x = 280 , y = 150)
boton_4.place(x = 10 , y = 250)
boton_5.place(x = 145 , y = 250)
boton_6.place(x = 280 , y = 250)
boton_7.place(x = 10 , y = 350)
boton_8.place(x = 145 , y = 350)
boton_9.place(x = 280 , y = 350)
boton_Llamada.place(x = 145 , y = 450)
boton_Regresar.place(x = 10 , y = 450)
boton_Guardar.place(x = 280 , y = 450)

# ============================================CONTACTOS ============================================
texto_Contactos = tk.Text(contactos , width = 35 , height = 15) # TEXTO CONTACTOS
boton_Contactos = tk.Button(contactos , text = 'MOSTRAR CONTACTOS' , width = 17 , height = 3
                              , command = lambda : mostrar_Contacos(texto_Contactos)) # MOSTRAR CONTACTOS
boton_Regresar_Contacto = tk.Button(contactos , text = 'REGRESAR' , width = 15 , height = 3 , bg = 'aqua' ,
                          command = lambda : mostrar_Marco(menu_Principal)) # REGRESAR

# USO DE LABLES
label_titulo_Contacto = tk.Label(contactos , text = 'SONY ERICSSON +' # TITULO
                        , width = 20 , height = 4 , bg = 'DarkCyan' , font = ('monospace' , 15 , 'italic'))
label_hora_Contacto = tk.Label(contactos , text = ' '                 # HORA
                      , width = 25 , height = 3 , bg = 'DarkCyan' , font = ('Radioland' , 10 , 'italic'))
label_fecha_Contacto = tk.Label(contactos , text = ' '                # FECHAR
                      , width = 25 , height = 3 , bg = 'DarkCyan' , font = ('monospace' , 10 , 'italic'))

# POSICIONAMIENTO DE BOTONES Y LABELS
label_titulo_Contacto.place(x = 0 , y = 0)
label_hora_Contacto.place(x = 225 , y = 0)
label_fecha_Contacto.place(x = 225 , y = 48)
texto_Contactos.place(x = 50 , y = 125)
boton_Contactos.place(x = 55 , y = 475)
boton_Regresar_Contacto.place(x = 205 , y = 475)

mostrar_Hora()                # MOSTRAR HORA
mostrar_Marco(menu_Principal) # MOSTRAR EL MENU PRINCIPAL
ventana_Principal.mainloop()  # SIEMPRE MOSTRAR LA VENTANA