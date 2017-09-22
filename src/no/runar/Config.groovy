package no.runar

class Config{
    static def steps
    static def create(){
        steps.echo "------- Config create -------"
        return new ConfigHolder()
    }
}