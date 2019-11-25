package com.nguyenno.apps.projects

class Project {
    private String id
    private String name
    private String externalId
    private String note
    private String dateCreated
    private String status
    private boolean displayNoteInProject
    private PriceList priceList
    private NetRateScheme netRateScheme
    private CreatedBy createdBy
    private String sourceLang

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

    String getExternalId() {
        return externalId
    }

    void setExternalId(String externalId) {
        this.externalId = externalId
    }

    String getNote() {
        return note
    }

    void setNote(String note) {
        this.note = note
    }

    boolean getDisplayNoteInProject() {
        return displayNoteInProject
    }

    void setDisplayNoteInProject(boolean displayNoteInProject) {
        this.displayNoteInProject = displayNoteInProject
    }

    PriceList getPriceList() {
        return priceList
    }

    void setPriceList(PriceList priceList) {
        this.priceList = priceList
    }

    NetRateScheme getNetRateScheme() {
        return netRateScheme
    }

    void setNetRateScheme(NetRateScheme netRateScheme) {
        this.netRateScheme = netRateScheme
    }

    CreatedBy getCreatedBy() {
        return createdBy
    }

    void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy
    }

    String getDateCreated() {
        return dateCreated
    }

    void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated
    }

    String getStatus() {
        return status
    }

    void setStatus(String status) {
        this.status = status
    }

    String getSourceLang() {
        return sourceLang
    }

    void setSourceLang(String sourceLang) {
        this.sourceLang = sourceLang
    }
}
