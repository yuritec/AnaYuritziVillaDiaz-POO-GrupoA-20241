import random

class CuentaBancaria:
    __id_usuario=0
    __numero_de_cuenta = 0
    __tipo_cuenta = ""
    __saldo=0
    __No_existe="No hay información de ese usuario"

    def __init__(self, id_usuario, tipo_cuenta,saldo):
        self.__numero_de_cuenta = random.randint(1, 1000)
        self.__id_usuario = id_usuario
        self.__tipo_cuenta = tipo_cuenta
        self.__saldo=saldo

    def get_id_usuario(self):
        return self.__id_usuario
    
    def get_tipo_cuenta(self):
        return self.__tipo_cuenta
    
    def get_saldo(self):
        return self.__saldo
    
    def get_numero_cuenta(self):
        return self.__numero_de_cuenta
    
    def set_saldo(self,saldo):
        self.__saldo=saldo

    
