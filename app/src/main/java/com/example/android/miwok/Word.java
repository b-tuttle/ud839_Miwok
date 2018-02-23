package com.example.android.miwok;

/**
 * Created by Bryan on 2/21/2018.
 */

public class Word {

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Create a new Word object.
     *
     * @param mDefaultTranslation is the word in a language that the user is already familiar with
     *                            (such as English)
     * @param mMiwokTranslation   is the word in the Miwok language
     */
    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
