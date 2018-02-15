package dev.amoeba.moexplorer.model;

import android.content.ContentProviderClient;
import android.database.Cursor;

import java.io.Closeable;

import dev.amoeba.moexplorer.libcore.io.IoUtils;
import dev.amoeba.moexplorer.misc.ContentProviderClientCompat;

import static dev.amoeba.moexplorer.BaseActivity.State.MODE_UNKNOWN;
import static dev.amoeba.moexplorer.BaseActivity.State.SORT_ORDER_UNKNOWN;

public class DirectoryResult implements Closeable {
	public ContentProviderClient client;
    public Cursor cursor;
    public Exception exception;

    public int mode = MODE_UNKNOWN;
    public int sortOrder = SORT_ORDER_UNKNOWN;

    @Override
    public void close() {
        IoUtils.closeQuietly(cursor);
        ContentProviderClientCompat.releaseQuietly(client);
        cursor = null;
        client = null;
    }
}