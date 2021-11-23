class Education {
  late String name, location, graduationDate, information;
  late bool ongoing;
  late List<String> courseWork;

  Education(String name, String location, String graduationDate, String information, bool ongoing, [List<String> courseWork = const <String>[]]){
    this.name = name;
    this.location = location;
    this.graduationDate = graduationDate;
    this.information = information;
    this.ongoing = ongoing;
    this.courseWork = courseWork;
  }

  String getName(){
    return this.name;
  }

}