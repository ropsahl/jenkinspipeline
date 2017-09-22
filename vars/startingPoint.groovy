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
            config1=Config.create("One")
            echo "One Complete"
            echo config1.text

        }
    },two: {
        stage("Stage two"){
            config2=Config.create("Two")
            echo "Two Complete"
            echo config2.text

        }
    },three: {
        stage("Stage three"){
            config3=Config.create("Three")
            echo "Three Complete"
            echo config3.text

        }
    }
}