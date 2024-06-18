"""
Manipulações de strings
Ao desenvolver um produto de segurança de senha em uma empresa, criou-se uma regra que as senhas devem possuir números e caracteres especiais. Após um ataque cibernético, decidiram fazer um estudo para verificar se aumentar a segurança da senha, de forma que existisse mais de um número e caracter especial seria efetivo para aumentar a segurança. Pensando nisso, implemente uma função que realize a contagem de quantos caracteres especiais e números existem na senha.

Utilize o corpo de função definido abaixo e retorne uma lista de dois elementos, em que o primeiro elemento é a quantidade de caracteres especiais e o seguindo elemento é a quantidade de números existentes na senha.
"""

CARACTERES_ESPECIAIS = "!@#$%^&*()_+[]{}|;':,.<>?/`~"


def verifica_senha(lista_A: list[str]) -> list[int]:

    caracteres_especiais = 0
    numeros = 0
    for caracter in lista_A:
        if caracter in CARACTERES_ESPECIAIS:
            caracteres_especiais += 1
        elif caracter.isdigit():
            numeros += 1

    return [caracteres_especiais, numeros]


print(lista_A := verifica_senha("a1b2c3d4e5f6g7h8i9j0"))
