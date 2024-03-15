import random

class Custumer:
    __id_usuario=0
    __nombre = ""
    __apellido_paterno = ""
    __apellido_materno = ""
    __genero=""
  

    def __init__(self, nombre, apellido_paterno,apellido_materno,genero):
        self.__id_usuario=random.randint(1, 100)
        self.__nombre =nombre
        self.__apellido_paterno = apellido_paterno
        self.__apellido_materno = apellido_materno
        self.__genero=genero

    def get_id_usuario(self):
        return self.__id_usuario
    
    def get_nombre(self):
        return self.__nombre
    
    def get_appelido_paterno(self):
        return self.__apellido_paterno
    
    def get_apellido_materno(self):
        return self.__apellido_materno
    
    def get_genero(self):
        return self.__genero
    
  