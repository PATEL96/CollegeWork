class Institute:
	def __init__ (self, Course, Semester):
		self.Course = Course
		self.Semester = Semester
		
	def display(self):
		print("Course:", self.Course)
		print("Semester:", self.Semester)
		
class Branch(Institute):
	def __init__ (self, Course, Semester, Name, Enrollment):
		Institute.__init__(self, Course, Semester)
		self.Name = Name
		self.Enrollment = Enrollment
	
	def display(self):
		print("Name:", self.Name)
		print("Enrollment: ", self.Enrollment)
		super().display()

y = Branch("B.Tech. I.T.", "4", "Raj D. Patel", "202103103510081")

y.display()