package com.nguyenno.apps.configs;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("memsource")
public class MemsourceRestProperties {
    private String loginToSessionUri;
    private String projectsUri;
    private String whoAmIUri;

    public String getLoginToSessionUri() {
        return loginToSessionUri;
    }

    public void setLoginToSessionUri(String loginToSessionUri) {
        this.loginToSessionUri = loginToSessionUri;
    }

    public String getProjectsUri() {
        return projectsUri;
    }

    public void setProjectsUri(String projectsUri) {
        this.projectsUri = projectsUri;
    }

    public String getWhoAmIUri() {
        return whoAmIUri;
    }

    public void setWhoAmIUri(String whoAmIUri) {
        this.whoAmIUri = whoAmIUri;
    }
}
