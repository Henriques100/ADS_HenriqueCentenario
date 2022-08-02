import math
val = input("Digite um número qualquer ")
val = int(val)
resultado = math.pow(val, 3)
if resultado > 100:
  print('Número maior que 100')
else:
  print('Número menor que 100')