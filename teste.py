import sqlite3

conexao = sqlite3.connect("bancoDados.db")
cursor = conexao.cursor()

cursor.execute("select * from usuario")
dados = cursor.fetchall()

for d in dados:
    print(d)
    
input()