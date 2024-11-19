from Dog import Dog
from ExperimentalDog import ExperimentalDog


def main():
    default_dog = Dog('Marie', 'Border Collie', 6592)
    experimental_dog = ExperimentalDog('Adison', 'Boston Terrier', 4152)

    default_dog.bark()
    experimental_dog.bark()

    experimental_dog.train()
    experimental_dog.perform_trick()
    print(experimental_dog.owner)


if __name__ == '__main__':
    main()
