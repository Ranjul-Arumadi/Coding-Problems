import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*create the class Course with the below Attributes.

courseId- int
courseName- String
courseAdmin- String
quiz- int
handson -int

The above methods should be private ,write getter and
setter and parametrized constructor as required.

create class courseProgram with main method.

implement two static methods-
   findAvgOfQuizByAdmin method:this method will take array
of Course objects and a String  value as input parameters.
This method will find out Average (as int) of Quiz questions
for given Course Admin (String parametre passed)
This method will return Average if found.if there is no course
that matches then the method should return 0.

sortCourseByHandsOn method:
This method will take an Array of Course Objects and int
value as input parameters.
This methods should return an Array of Course objects in an
ascending order of their  handson which are less than the
given handson(int parameter passed) value. if there is no
such course then the method should return null.

The above mentioned static methods should be called from
main methods.

for findAvgOfQuizByAdmin method: The main method
should print the average if the returned value is not 0.
if the returned value is 0 then it should print "No Course
found."


for sortCourseByHandsOn method:
                        the  main method should print the name
of the Course from the returned Course object Array if the
returned value is not null.if the returned value is null then
it should print "No Course found with mentioned attribute."

input1:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Nisha
17

output1:
35
kubernetes
Apache Spark
cassandra

input2:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Shubhamk
5

output 2:
No Course found
No Course found with mentioned attributes.
*/
class courseProgramR{
	public static void main(String[] args) {
		//int n = 4;
		
		Course c [] = new Course[4];

		c[0] = new Course(1, "Java", "Divya", 2, 5);
		c[1] = new Course(2, "C", "Neena", 5, 6);
		c[2] = new Course(3, "PHP", "Divya", 7, 7);
		c[3] = new Course(4, "Ruby", "Abhi", 3, 8);


		double avg = findAvgOfQuizByAdmin(c, "Divya");

		Course cc[] = sortCourseByHandsOn(c, 7);

		System.out.println("Avg is: "+avg);

		if(cc!=null){
			for(Course x: cc){
				System.out.println(x.getHandson());
			}
		}
	}
/*
implement two static methods-
findAvgOfQuizByAdmin method:this method will take array
of Course objects and a String  value as input parameters.
This method will find out Average (as int) of Quiz questions
for given Course Admin (String parametre passed)
This method will return Average if found.if there is no course
that matches then the method should return 0.

sortCourseByHandsOn method:
This method will take an Array of Course Objects and int
value as input parameters.
This methods should return an Array of Course objects in an
ascending order of their  handson which are less than the
given handson(int parameter passed) value. if there is no
such course then the method should return null.

The above mentioned static methods should be called from
main methods.

for findAvgOfQuizByAdmin method: The main method
should print the average if the returned value is not 0.
if the returned value is 0 then it should print "No Course
found."


for sortCourseByHandsOn method:
                        the  main method should print the name
of the Course from the returned Course object Array if the
returned value is not null.if the returned value is null then
it should print "No Course found with mentioned attribute."
*/

	static double findAvgOfQuizByAdmin(Course[] c, String courseAdmin){
		double avg=0;
		double sum=0;
		double n=0;

		for(Course cc: c){
			if(cc.getCourseAdmin().equalsIgnoreCase(courseAdmin)){
				sum+=cc.getQuiz();
				n++;
			}
		}
		if(n==0){
			return 0;
		}
		avg = (sum/n);

		return avg;
	}

	static Course[] sortCourseByHandsOn(Course[] c, int handson){
		List<Course> l = new ArrayList<>();

		for(Course cc: c){
			if(cc.getHandson()<handson){
				l.add(cc);
			}
		}
		if(l.size()==0){
			return null;
		}

		Course[] cc = l.toArray(new Course[0]);
		
		Arrays.sort(cc, (c1,c2) -> (c1.getHandson()-c2.getHandson()) );

		return cc;

		
	}

}
/*
create the class Course with the below Attributes.

courseId- int
courseName- String
courseAdmin- String
quiz- int
handson -int

The above methods should be private ,write getter and
setter and parametrized constructor as required.
*/
class Course{
	int courseId;
	String courseName;
	String courseAdmin;
	int quiz;
	int handson;

	

	public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseAdmin = courseAdmin;
		this.quiz = quiz;
		this.handson = handson;
	}

	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseAdmin() {
		return courseAdmin;
	}
	public void setCourseAdmin(String courseAdmin) {
		this.courseAdmin = courseAdmin;
	}
	public int getQuiz() {
		return quiz;
	}
	public void setQuiz(int quiz) {
		this.quiz = quiz;
	}
	public int getHandson() {
		return handson;
	}
	public void setHandson(int handson) {
		this.handson = handson;
	}

	
}
