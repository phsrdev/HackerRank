if __name__ == '__main__':

    """
    USANDO ELSE-ELIF STATEMENT
    """
    # 1. Inicializando Variaveis Necessarias
    N = int(input()) #Numero de comandos realiazados, ou loops.
    my_list = []
    continue_loop = True

    # 2. logica do codigo
    while(continue_loop):
        
        # Entrada da opcao 
        current_option = input("")

        # Split string input into list [action, index, element] (or [action, element])
        processed_option = current_option.split()

        # listar todas as operacoes necessarias para o desafio
        if processed_option[0] == "insert":
            my_list.insert(int(processed_option[1]), int(processed_option[2]))
        elif processed_option[0] == "print":
            print(my_list)
        elif processed_option[0] == "remove":
            my_list.remove(int(processed_option[1]))
        elif processed_option[0] == "append":
            my_list.append(int(processed_option[1]))
        elif processed_option[0] == "sort":
            my_list.sort()
        elif processed_option[0] == "pop":
            my_list.pop()
        elif processed_option[0] == "reverse":
            my_list.reverse()

        # -1 vez ao inserir a entrada. O loop sera interrompido se houver quando N chegar a 0
        N -= 1
        if N == 0: 
            continue_loop = False

'''
Consider a list (list = []). You can perform the following commands:

1 - insert i e: Insert integer e at position i.
2 - print: Print the list.
3 - remove e: Delete the first occurrence of integer e.
4 - append e: Insert integer e at the end of the list.
5 - sort: Sort the list.
6 - pop: Pop the last element from the list.
7 - reverse: Reverse the list.

Initialize your list and read in the value of n followed by n lines of commands where each command will be of the 7 types listed above. Iterate through each command in order and perform the corresponding operation on your list.

Example

N = 4
append 1
append 2
insert 3 1
print

append 1: append 1 to the list, arr = [1].
append 2: append 2 to the list, arr = [1,2].
insert 3 1: insert 3 at index 1 arr = [1,3,2].
print: Print the array.

Output:

[1, 3, 2]

Input Format

The first line contains an integer, n, denoting the number of commands.
Each line i of the n subsequent lines contains one of the commands described above.

Constraints

The elements added to the list must be integers.

Output Format

For each command of type print, print the list on a new line.

Sample Input 0

12
insert 0 5
insert 1 10
insert 0 6
print
remove 6
append 9
append 1
sort
print
pop
reverse
print

Sample Output 0

[6, 5, 10]
[1, 5, 9, 10]
[9, 5, 1]
'''