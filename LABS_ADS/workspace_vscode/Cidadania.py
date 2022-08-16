class Pessoa:
	nome = None
	sexo = None
	idade = None
 
	def __init__(self,nome,sexo,idade):
		self.nome = nome
		self.sexo = sexo
		self.idade = idade


class Cidadao(Pessoa):
    cpf = None
    def __init__(self,cpf):
     self.cpf = cpf

cidadao_1 = Cidadao
cidadao_1.nome = input("Entre com o nome ")
cidadao_1.sexo = input("Entre com o sexo ")
cidadao_1.idade = input("Entre com a idade ")
cidadao_1.cpf = input("Entre com o cpf ")
########################################
print("Nome:"+cidadao_1.nome)
print("Sexo:"+cidadao_1.sexo)
print("Idade:"+cidadao_1.idade)
print("Cpf:"+cidadao_1.cpf)