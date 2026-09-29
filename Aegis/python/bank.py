class BankAccount:

    def __init__(self, name, balance):
        self.name = name
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        self.balance -= amount

    def display(self):
        print(f"Name: {self.name}")
        print(f"Balance: ₹{self.balance}")


account1 = BankAccount("ved", 25012)

account1.deposit(2000)
account1.withdraw(1000)

account1.display()