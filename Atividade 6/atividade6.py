import threading

class DivisiveisThread:
    def __init__(self, nome, valor_inicial, valor_final):
        self.nome = nome
        self.valor_inicial = valor_inicial
        self.valor_final = valor_final

    def run(self):
        print(f"Thread {self.nome} iniciada")
        for num in range(self.valor_inicial, self.valor_final + 1):
            if num % 3 == 0 and num % 5 == 0:
                print(f"Thread {self.nome}: {num}")
        print(f"Thread {self.nome} concluída")

if __name__ == "__main__":
    # Criar as três threads com os intervalos especificados
    thread1 = DivisiveisThread("Thread 1", 100, 300)
    thread2 = DivisiveisThread("Thread 2", 301, 500)
    thread3 = DivisiveisThread("Thread 3", 501, 700)

    # Iniciar as threads
    t1 = threading.Thread(target=thread1.run)
    t2 = threading.Thread(target=thread2.run)
    t3 = threading.Thread(target=thread3.run)

    # Iniciar as threads
    t1.start()
    t2.start()
    t3.start()

    # Aguardar até que todas as threads terminem
    t1.join()
    t2.join()
    t3.join()

    print("Programa principal concluído")
