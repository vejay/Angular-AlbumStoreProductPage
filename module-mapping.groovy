def moduleGroups() {
    return [
        administrator: "V-CONFIGURATION",
        analyze: "V-ANALYZE",
        alarmcentral: "",
        configuration: "ULTRALIGHT-V-CONFIGURATION",
        externalGraphs: "ULTRALIGHT-V-MODEM-SESSIONS",
        modemsession: "ULTRALIGHT-V-MODEM-SESSIONS",
        network: "",
        search: "ULTRALIGHT-V-GLOBAL-SEARCH",
        spectrum: "",
        widgets: ""]
}

def getGroup(module) {
    return moduleGroups()[module]
}

return this

