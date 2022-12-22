def add(param1, param2):
    #            1000 < param1 < -1000
    #   equal to 1000 < param1 and param1 < -1000
    if (1000 < param1 or param1 < -1000) or (1000 < param2 or param2 < -1000):
        raise ValueError

    return param1 + param2


if __name__ == '__main__':
    try:
        print(f'Sum : {add(-27, 100)}')
        print(f'Sum : {add(-1000, 1)}')
        print(f'Sum : {add(-1, 1000)}')
        print(f'Sum : {add(-1000, 1000)}')
    except ValueError:
        print('The parameters not satisfied the operation')


