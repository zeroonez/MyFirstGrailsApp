package com.nguyenno.apps.projects;

import java.time.ZonedDateTime;

class NetRateScheme {
    private String id
    private String name
    private ZonedDateTime dateCreated
    private CreatedBy createdBy

    String getId() {
        return id
    }

    void setId(String id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    ZonedDateTime getDateCreated() {
        return dateCreated
    }

    void setDateCreated(ZonedDateTime dateCreated) {
        this.dateCreated = dateCreated
    }

    CreatedBy getCreatedBy() {
        return createdBy
    }

    void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy
    }
}
