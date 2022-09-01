while(1):

    s = input()

    if s == '#' :
        break

    cnt = 0

    for char in s:
        if char in 'aeiouAEIOU':
            cnt += 1



    print(cnt)


