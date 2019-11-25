package com.nguyenno.apps.projects;

class ListOfProjects {
    private Integer totalElements
    private Integer totalPages
    private Integer pageSize
    private Integer pageNumber
    private Integer numberOfElements
    private List<Project> content = []

    Integer getTotalElements() {
        return totalElements
    }

    Integer getTotalPages() {
        return totalPages
    }

    Integer getPageSize() {
        return pageSize
    }

    Integer getPageNumber() {
        return pageNumber
    }

    Integer getNumberOfElements() {
        return numberOfElements
    }

    List<Project> getContent() {
        return content
    }
}
