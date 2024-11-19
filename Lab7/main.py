def main():
    # Get the size of the square matrix
    n_rows = int(input("Введіть розмір квадратної матриці: "))

    # Create a triangular matrix with decreasing row sizes
    arr = [['' for _ in range(n_rows - i * 2)] for i in range(n_rows // 2)]

    # Get the filler character
    filler = input("\nВведіть символ-заповнювач: ")
    if not filler:
        print("\nНе введено символ заповнювач")
        return
    elif len(filler) > 1:
        print("\nЗабагато символів заповнювачів")
        return

    for i, row in enumerate(arr):
        left_align = " " * (i * 2)
        print(left_align, end="")

        for j in range(len(row)):
            arr[i][j] = filler
            print(arr[i][j] + " ", end="")

        if i < len(arr) - 1:
            print()


if __name__ == "__main__":
    main()
