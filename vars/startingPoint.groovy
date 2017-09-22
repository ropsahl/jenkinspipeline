import no.runar.Config
import no.runar.ConfigHolder

void call(){
    echo "---- Startingpoint reached ----"

    Config.steps=steps
    ConfigHolder configHolder=Config.create()
    node(){
        echo configHolder.text
    }
}