def doA(pri) :
    print(pri)
    pri = 100

def doB(ref) :
    print(ref)
    ref[0] = 200

a = 20
doA(a)

b = [10, 20 ,30]
doB(b)

print(a)
print(b)

    