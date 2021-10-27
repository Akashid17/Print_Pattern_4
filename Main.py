
def Display(iNo):

    if iNo < 0:
        iNo = -iNo

    while iNo != 0:
        print(iNo,end="\t#\t")
        iNo -= 1
    
    print()

def main():

    iValue = int(input("Enter Number\n"))
    Display(iValue)

if __name__ == "__main__":
    main()