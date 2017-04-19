package datasource

class Project {

    String name
    String description
    Date dueDate

    static belongsTo = [owner : EndUser]

    static hasMany = [tasks : Tasks]

    static constraints = {

    }
}
