public inputParameters() {
    def parameters = [
        choice(name: "testSkip", choices: ['true', 'false'], description: "Skip the execution of tests during the Maven build process"),
        choice(name: "modernizerSkip", choices: ['true', 'false'], description: "Skip the execution of the modernizer plugin during the Maven build process")
    ]
    return parameters
}

return this;