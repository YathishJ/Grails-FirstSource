package datasource

class EndUser {
    String userName
    String password
    String fullName

    static hasMany = [projects : Project, tasks : Tasks]
    static constraints = {
    }
}
