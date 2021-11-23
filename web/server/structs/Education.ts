export default class Education {
  private name: string;
  private location: string;
  private graduationDate: string;
  private information: string;
  private ongoing: boolean;
  private courseWork: [string];

  constructor(
    name: string,
    location: string,
    graduationDate: string,
    information: string,
    ongoing: boolean,
    courseWork?: [string]
  ) {
    this.name = name;
    this.location = location;
    this.graduationDate = graduationDate;
    this.information = information;
    this.ongoing = ongoing;
    this.courseWork = courseWork;
  }

  public getName(): string {
    return this.name;
  }
}
