import no.runar.Config
import no.runar.ConfigHolder

void call(){
    echo "---- Startingpoint reached ----"

    ConfigHolder config1
    ConfigHolder config2
    ConfigHolder config3

    Config.steps=steps
    parallel one: {
        stage("Stage one"){
            config1=r=Config.create("One")
        }
    },two: {
        stage("Stage two"){
            config3=r=Config.create("Two")
        }
    },three: {
        stage("Stage three"){
            config3=r=Config.create("Three")
        }
    }
    node(){
        echo config1.text
        echo config2.text
        echo config3.text
    }
}