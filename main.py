from Banco import Banco
from CuentaBancaria import CuentaBancaria
from Custumer import Custumer

Banco =Banco()


while(True):
    
    opcion=input("""
          Selecciona la operación a realizar:
          1)Dar de alta cliente
          2)Obtener una cuenta
          3)Realizar abono a cuenta
          4)Realizar retiro a cuenta
          5)Buscar cuenta
          6)Mostrar clientes registrados
          7)Mostrar cuentas
          0)Salir
          """)
    
       
    
    if opcion == "1":
        print("entra")
        nombre=input("Ingresa tu nombre:  ")
        apellido_paterno=input("Ingresa tu apellido paterno:  ")
        apellido_materno=input("Ingresa tu apellido materno:  ")
        genero=input("Ingresa tu genero:  ")
        usuario=Custumer(nombre,apellido_paterno,apellido_materno,genero)
        Banco.agregar_usuario(usuario)
        print(f"El usuario {nombre} {apellido_paterno} {apellido_materno} ha sido registrado\n")

    elif opcion=="2":
        print("Ingresa el Id del usuario al que se le asignará la cuenta:")
        Banco.mostrar_usuarios()
        id_usuario=input()
        if Banco.existe_usuario(int(id_usuario))==True:
            tipo_cuenta=input("Ingresa el tipo de cuenta que deseas abrir (\"A\", \"B\" ó \"C\"):    ")
            if tipo_cuenta.upper() in ("A","B","C"):
                    if tipo_cuenta.upper()=="A":
                        acepta=input("El tipo de cuenta A necesita un saldo mínimo de $1,000 para poder abrirse desea continuar y abonarlos S/N:    ")
                        if acepta.upper()=="S":  
                            cuenta = CuentaBancaria(id_usuario, tipo_cuenta.upper(),1000)
                            Banco.agregar_cuenta_bancaria(cuenta)
                            print(f"Se agrego una cuenta de tipo {tipo_cuenta.upper()} para el usuario con Id {id_usuario}\n")
                        else:print("No podemos continuar con la alta")
                    elif tipo_cuenta.upper()=="B":
                        acepta=input("El tipo de cuenta B necesita un saldo mínimo de $5,000 para poder abrirse desea continuar y abonarlos S/N:    ")
                        if acepta.upper()=="S":  
                            cuenta = CuentaBancaria(id_usuario, tipo_cuenta.upper(),5000)
                            Banco.agregar_cuenta_bancaria(cuenta)
                            print(f"Se agrego una cuenta de tipo {tipo_cuenta.upper()} para el usuario con Id {id_usuario}\n")
                        else:print("No podemos continuar con la alta")
                    elif tipo_cuenta.upper()=="C":
                        acepta=input("El tipo de cuenta A necesita un saldo mínimo de $10,000 para poder abrirse desea continuar y abonarlos S/N:    ")
                        if acepta.upper()=="S":  
                            cuenta = CuentaBancaria(id_usuario, tipo_cuenta.upper(),10000)
                            Banco.agregar_cuenta_bancaria(cuenta)
                            print(f"Se agrego una cuenta de tipo {tipo_cuenta.upper()} para el usuario con Id {id_usuario}\n")
                        else:print("No podemos continuar con la alta")   
            else: print("No es Valido el tipo de cuenta")
        else: print(f"No se encontro el usuario {id_usuario}")
    
    
    elif opcion=="3":
        numero_cuenta=input("Ingrese el numero de cuenta al que desea abonar:   ")
        if Banco.existe_cuenta_bancaria(int(numero_cuenta))==True:
            monto=input("Ingrese el monto a abonar:    ")
            Banco.depositar_a_cuenta(int(numero_cuenta),int(monto))
        

        else: (f"No se encuentra el numero de cuenta {numero_cuenta}")

    elif opcion=="4":
        numero_cuenta=input("Ingrese el numero del qie desea retirar:   ")
        if Banco.existe_cuenta_bancaria(int(numero_cuenta))==True:
            monto=input("Ingrese el monto a retirar:    ")
            Banco.retirar_a_cuenta(int(numero_cuenta),int(monto))
        

        else: (f"No se encuentra el numero de cuenta {numero_cuenta}")


    elif opcion=="5":
        numero_cuenta=input("Ingresa el numero de cuenta a buscar:  ")
        if Banco.existe_cuenta_bancaria(int(numero_cuenta))==True:
            Banco.buscar_cuenta_bancaria(int(numero_cuenta))
        else: (f"No se encuentra el numero de cuenta {numero_cuenta}")

    elif opcion=="6":
        Banco.mostrar_usuarios()

    elif opcion=="7":
        Banco.mostrar_cuentas_bancarias()

    elif opcion=="0":
        break
    
    else: break
   

  