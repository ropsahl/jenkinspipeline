package no.runar

class Config{
    static def create(){
        echo "------- Config create -------"
        return new ConfigHolder()
    }
}