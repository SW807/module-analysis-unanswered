package dk.aau.cs.psylog.unansweredcalls;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;

import dk.aau.cs.psylog.module_lib.DBAccessContract;
import dk.aau.cs.psylog.module_lib.IScheduledTask;

public class UnansweredCallsListener implements IScheduledTask {

    private ContentResolver contentResolver;
    private static final String CALL_HISTORY_TABLE_NAME = "MODULE_CALLS_META_call_history";

    public UnansweredCallsListener(Context context) {
        this.contentResolver = context.getContentResolver();
    }

    @Override
    public void doTask() {
        Cursor cursor = contentResolver.query(Uri.parse(DBAccessContract.DBACCESS_CONTENTPROVIDER + CALL_HISTORY_TABLE_NAME), new String[]{"incoming", "answered"}, null, null, null);
    }

    @Override
    public void setParameters(Intent i) {

    }
}
