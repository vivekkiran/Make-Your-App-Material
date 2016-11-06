package com.example.xyzreader.data;

/**
 * Created by devenv on 11/6/16.
 */

public interface ItemsColumns {
    /**
     * Type: INTEGER PRIMARY KEY AUTOINCREMENT
     */
    String _ID = "_id";
    /**
     * Type: TEXT
     */
    String SERVER_ID = "server_id";
    /**
     * Type: TEXT NOT NULL
     */
    String TITLE = "title";
    /**
     * Type: TEXT NOT NULL
     */
    String AUTHOR = "author";
    /**
     * Type: TEXT NOT NULL
     */
    String BODY = "body";
    /**
     * Type: TEXT NOT NULL
     */
    String THUMB_URL = "thumb_url";
    /**
     * Type: TEXT NOT NULL
     */
    String PHOTO_URL = "photo_url";
    /**
     * Type: REAL NOT NULL DEFAULT 1.5
     */
    String ASPECT_RATIO = "aspect_ratio";
    /**
     * Type: INTEGER NOT NULL DEFAULT 0
     */
    String PUBLISHED_DATE = "published_date";
}