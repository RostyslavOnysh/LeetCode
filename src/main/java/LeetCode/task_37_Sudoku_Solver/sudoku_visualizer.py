import time
import os

# ANSI escape codes
RESET = '\033[0m'
BLUE = '\033[94m'
RED = '\033[91m'
YELLOW = '\033[93m'


def clear_screen():
    os.system('cls' if os.name == 'nt' else 'clear')


def print_board(board, highlight_pos=None, trial_num=None):
    clear_screen()
    for row in range(9):
        for col in range(9):
            if highlight_pos and (row, col) == highlight_pos:
                if trial_num is not None:
                    print(f"{YELLOW}{trial_num}{RESET}", end=" ")
                else:
                    print(f"{RED}{board[row][col] if board[row][col] != 0 else '.'}{RESET}", end=" ")
            else:
                print(f"{BLUE}{board[row][col] if board[row][col] != 0 else '.'}{RESET}", end=" ")
        print()
    print()


def is_valid(board, row, col, num):
    for i in range(9):
        if board[row][i] == num or board[i][col] == num:
            return False

    start_row, start_col = 3 * (row // 3), 3 * (col // 3)
    for i in range(3):
        for j in range(3):
            if board[start_row + i][start_col + j] == num:
                return False
    return True

def solve_sudoku(board):
    for row in range(9):
        for col in range(9):
            if board[row][col] == 0:
                for num in range(1, 10):

                    print_board(board, highlight_pos=(row, col), trial_num=num)
                    time.sleep(0.02)

                    if is_valid(board, row, col, num):
                        board[row][col] = num
                        print_board(board, highlight_pos=(row, col))
                        time.sleep(0.5)

                        if solve_sudoku(board):
                            return True

                        board[row][col] = 0
                        print_board(board, highlight_pos=(row, col))
                        time.sleep(0.1)

                return False
    return True

board = [
    [5, 3, 4, 0, 7, 0, 0, 1, 0],
    [6, 7, 0, 1, 9, 5, 0, 4, 8],
    [0, 9, 8, 0, 0, 0, 0, 6, 0],
    [8, 0, 0, 0, 6, 0, 0, 0, 3],
    [4, 0, 0, 8, 0, 3, 0, 0, 1],
    [7, 1, 0, 9, 2, 0, 0, 0, 6],
    [0, 6, 0, 0, 0, 0, 2, 8, 0],
    [0, 8, 7, 4, 1, 9, 0, 3, 5],
    [3, 4, 0, 2, 8, 0, 0, 7, 9]
]

print("Початкова дошка:")
print_board(board)
solve_sudoku(board)
print("Розв'язок знайдено:")
print_board(board)