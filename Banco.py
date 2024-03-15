class Banco:
    __usuarios=[]
    __cuenta_bancaria = []
 

    def agregar_usuario(self, usuario):
        self.__usuarios.append(usuario)

    def agregar_cuenta_bancaria(self, cuenta_bancaria):
        self.__cuenta_bancaria.append(cuenta_bancaria)



    def mostrar_usuarios(self):
        print("""* USUARIOS REGISTRADOS**""")
        for usuario in self.__usuarios:
            print(f"Usuario: {usuario.get_id_usuario()}  {usuario.get_nombre()} {usuario.get_apellido_materno()} {usuario.get_apellido_materno()} {usuario.get_genero()}")


    def mostrar_cuentas_bancarias(self):
        print("""* CUENTAS REGISTRADAS**
                """)
        for cuenta_bancaria in self.__cuenta_bancaria:
            print(f"Usuario {cuenta_bancaria.get_id_usuario()} con numero de cuenta: {cuenta_bancaria.get_numero_cuenta()} de tipo {cuenta_bancaria.get_tipo_cuenta()} y saldo de: {cuenta_bancaria.get_saldo()}")


    def existe_usuario(self,id_usuario):
         for usuario in self.__usuarios:
            if usuario.get_id_usuario() ==id_usuario:
               return True
            
    def existe_cuenta_bancaria(self,numero_cuenta):
         for cuentas in self.__cuenta_bancaria:
            if cuentas.get_numero_cuenta() ==numero_cuenta:
               return True 

    def buscar_cuenta_bancaria(self,numero_cuenta):
         for cuenta_bancaria in self.__cuenta_bancaria:
            if cuenta_bancaria.get_numero_cuenta()==numero_cuenta:
              print(f"Usuario {cuenta_bancaria.get_id_usuario()} con numero de cuenta: {cuenta_bancaria.get_numero_cuenta()} de tipo {cuenta_bancaria.get_tipo_cuenta()} y saldo de: {cuenta_bancaria.get_saldo()}")

    def depositar_a_cuenta(self,numero_cuenta,monto):
        for cuentas in self.__cuenta_bancaria:
            if cuentas.get_numero_cuenta() ==numero_cuenta:
                if cuentas.get_tipo_cuenta()=="A":
                    if cuentas.get_saldo()+monto <=50000:
                        cuentas.set_saldo(cuentas.get_saldo()+monto)
                        print(f"Tu nuevo saldo es de: {cuentas.get_saldo()}" )
                    else:print(f"La cuenta tiene un saldo actual de ${cuentas.get_saldo()} + tu abono de ${monto} superan los $50000 permitidos para una cuenta de tipo A")
                elif cuentas.get_tipo_cuenta()=="B":
                    if cuentas.get_saldo()+monto <=100000:
                        cuentas.set_saldo(cuentas.get_saldo()+monto)
                        print(f"Tu nuevo saldo es de: {cuentas.get_saldo()}" )
                    else:print(f"La cuenta tiene un saldo actual de ${cuentas.get_saldo()} + tu abono de ${monto} superan los $10000 permitidos para una cuenta de tipo B")
                elif cuentas.get_tipo_cuenta()=="c":
                    cuentas.set_saldo(cuentas.get_saldo()+monto)
                    print(f"Tu nuevo saldo es de: {cuentas.get_saldo()}" )

    def retirar_a_cuenta(self,numero_cuenta,monto):
        for cuentas in self.__cuenta_bancaria:
            if cuentas.get_numero_cuenta() ==numero_cuenta:
                if cuentas.get_tipo_cuenta()=="A":
                    if cuentas.get_saldo()-monto >=1000:
                        cuentas.set_saldo(cuentas.get_saldo()-monto)
                        print(f"Tu nuevo saldo es de: {cuentas.get_saldo()}" )
                    else:print(f"La cuenta tiene un saldo actual de ${cuentas.get_saldo()} - tu retiro de ${monto} hacen que tengas un saldo menor al minimo cuenta de tipo A que es de $1000")
                elif cuentas.get_tipo_cuenta()=="B":
                    if cuentas.get_saldo()-monto >=5000:
                        cuentas.set_saldo(cuentas.get_saldo()-monto)
                        print(f"Tu nuevo saldo es de: {cuentas.get_saldo()}" )
                    else:print(f"La cuenta tiene un saldo actual de ${cuentas.get_saldo()} - tu retiro de ${monto} hacen que tengas un saldo menor al minimo cuenta de tipo B que es de $5000")
                elif cuentas.get_tipo_cuenta()=="C":
                    if cuentas.get_saldo()-monto >=10000:
                       cuentas.set_saldo(cuentas.get_saldo()-monto)
                       print(f"Tu nuevo saldo es de: {cuentas.get_saldo()}" )
                    else:print(f"La cuenta tiene un saldo actual de ${cuentas.get_saldo()} - tu retiro de ${monto} hacen que tengas un saldo menor al minimo cuenta de tipo C que es de $10000")
                    