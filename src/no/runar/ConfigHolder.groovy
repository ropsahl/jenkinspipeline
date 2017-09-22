package no.runar

/**
 * Created by runar on 22/09/2017.
 *
 */
class ConfigHolder implements Serializable {
    final String text

    ConfigHolder(String t) {
        text = " Config holder is initialized " + t
    }
}
