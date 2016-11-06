package com.example.xyzreader.data;

import android.net.Uri;

public class ItemsContract {
    public static final String CONTENT_AUTHORITY = "com.example.xyzreader";
    private static final Uri BASE_URI = Uri.parse("content://com.example.xyzreader");


    public static class Items implements ItemsColumns {
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.com.example.xyzreader.items";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.com.example.xyzreader.items";

        public static final String DEFAULT_SORT = PUBLISHED_DATE + " DESC";

        /**
         * Matches: /items/
         */
        public static Uri buildDirUri() {
            return BASE_URI.buildUpon().appendPath("items").build();
        }

        /**
         * Matches: /items/[_id]/
         */
        public static Uri buildItemUri(long _id) {
            return BASE_URI.buildUpon().appendPath("items").appendPath(Long.toString(_id)).build();
        }

        /**
         * Read item ID item detail URI.
         */
        public static long getItemId(Uri itemUri) {
            return Long.parseLong(itemUri.getPathSegments().get(1));
        }
    }

    private ItemsContract() {
    }
}
