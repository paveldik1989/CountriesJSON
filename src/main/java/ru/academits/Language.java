package ru.academits;

public class Language {
    private String iso639_1;
    private String iso639_2;
    private String name;
    private String nativeName;

    public String getIso6391() {
        return iso639_1;
    }

    public void setIso6391(String iso639_1) {
        this.iso639_1 = iso639_1;
    }

    public String getIso6392() {
        return iso639_2;
    }

    public void setIso6392(String iso639_2) {
        this.iso639_2 = iso639_2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }
}