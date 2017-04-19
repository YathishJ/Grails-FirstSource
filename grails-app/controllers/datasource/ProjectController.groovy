package datasource

class ProjectController {
    def scaffold = true

    def index = {
        redirect (action: current)
    }

    def current = {
        def allProjects = Project.list()
        [allProjects:allProjects]
    }
}
