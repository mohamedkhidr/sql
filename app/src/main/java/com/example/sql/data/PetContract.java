package com.example.sql.data;

import android.provider.BaseColumns;

public final class PetContract {

    // Make the constructor private to prevent initiation
    private PetContract(){

    }

    // Create an Entry class for each table in the Database
    public static final class PetEntry implements BaseColumns{
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        // Mapping constants

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
