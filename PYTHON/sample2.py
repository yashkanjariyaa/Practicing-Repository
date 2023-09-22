class profession :
    def __init__(self,name) :
        self.name = name
    def action(self):
        print("Works")
class teacher(profession):
    def __init__(self,name) :
        self.name = name
    def action(self):
        print("Teaches")
class doctor(profession):
    def __init__(self,name) :
        self.name = name
    def action(self):
        print("Treats")
class engineer(profession):
    def __init__(self,name) :
        self.name = name
    def action(self):
        print("Builds")
class corporateEmploy(profession):
    pass

smita = teacher("smita")
elon = engineer("elon")
me = doctor("me")

smita.action()
elon.action()
me.action()