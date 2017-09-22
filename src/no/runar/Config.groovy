package no.runar

class Config{
    static def steps
    static def create(String t){
        steps.echo "------- Config create -------"
        return new ConfigHolder(t)
    }
}