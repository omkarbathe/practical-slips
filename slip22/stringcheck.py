class stringcheck:
    def __init__(self,string):
        self.inputstring=string;
        
    def __mul__(self,n):
        if isinstance(n,int):
            return self.inputstring*n;
        else:
            raise ValueError("cant repeat")
            
user_input_string=input("enter string")
repetation_factor=int(input("Enter repetaion"))

repeater=stringcheck(user_input_string)

result=repeater*repetation_factor
print("result",result)