
from Dog import Dog


class ExperimentalDog(Dog):
    def __init__(self, owner, breed, dog_tag):
        super().__init__(owner, breed, dog_tag)

    def train(self):
        self.log("Experimental dog is being trained.")
        print("Experimental dog training...")

    def perform_trick(self):
        self.log("Experimental dog is performing a trick.")
        print("Experimental dog is performing a trick!")
