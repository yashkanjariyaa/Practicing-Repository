class person :
    def __init__(them,name,age,id):
        them.name = name
        them.age = age
        them.id = id
    def intro(them):
        print(them.name,them.age,them.id)

class friends(person):
    def __init__(them,name,age,id,friendship):
        super().__init__(name,age,id)
        them.closefriends = friendship
    def intro(them):
        print(them.name,them.age,them.id,them.closefriends)
nishu = friends("Nishanth",18,79,True)
revi = friends("Reevaa",19,94,True)
mishra = friends("Parna",18,83,False)
vedu = friends("Vedant",18,122,True)
uncle = person("Ramesh",69,00)

nishu.intro()
