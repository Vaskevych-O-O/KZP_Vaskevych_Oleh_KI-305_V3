class Dog:
    def __init__(self, owner, breed, dog_tag):
        self.owner = owner
        self.breed = breed
        self.dog_tag = dog_tag
        self.log_file = "Log.txt"
        self.log("Dog created with owner: {}, breed: {}, dog tag: {}".format(self.owner, self.breed, self.dog_tag))

    def set_owner(self, owner):
        self.owner = owner
        self.log("Owner set to: {}".format(owner.name))

    def set_breed(self, breed):
        self.breed = breed
        self.log("Breed set to: {}".format(breed.name))

    def set_dog_tag(self, dog_tag):
        self.dog_tag = dog_tag
        self.log("Dog tag set to: {}".format(dog_tag.registration_number))

    def bark(self):
        self.log("Dog is barking!")
        print("Woof!")

    def fetch(self, item):
        self.log("Dog fetched: {}".format(item))
        print("Fetched: {}".format(item))

    def sit(self):
        self.log("Dog is sitting.")
        print("Dog sits down.")

    def roll_over(self):
        self.log("Dog rolled over.")
        print("Dog rolls over.")

    def eat(self, food):
        self.log("Dog is eating: {}".format(food))
        print("Eating: {}".format(food))

    def sleep(self):
        self.log("Dog is sleeping.")
        print("Zzz...")

    def play(self, toy):
        self.log("Dog is playing with: {}".format(toy))
        print("Playing with: {}".format(toy))

    def groom(self):
        self.log("Dog is being groomed.")
        print("Grooming the dog.")

    def log(self, message):
        with open(self.log_file, 'a') as fout:
            fout.write(message + '\n')
