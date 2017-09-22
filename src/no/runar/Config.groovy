package no.runar

class Config{
    static def steps
    static ConfigHolder create(String t){
        steps.echo "------- Config create -------" +t
        ConfigHolder configHolder=new ConfigHolder(t)
        steps.echo "------- Config create -------" +configHolder.text

        return configHolder
    }
}