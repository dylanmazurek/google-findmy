package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class btj implements bti {
    private final ContentProviderClient a;
    private final /* synthetic */ int b;

    public btj(Context context, Uri uri, int i, byte[] bArr) {
        this.b = i;
        this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // defpackage.bti
    public final void a() {
        if (this.b != 0) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
                return;
            }
            return;
        }
        ContentProviderClient contentProviderClient2 = this.a;
        if (contentProviderClient2 != null) {
            contentProviderClient2.release();
        }
    }

    @Override // defpackage.bti
    public final Cursor b(Uri uri, String[] strArr, String[] strArr2) {
        int i = this.b;
        ContentProviderClient contentProviderClient = this.a;
        if (i != 0) {
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e2) {
            Log.w("FontsProvider", "Unable to query the content provider", e2);
            return null;
        }
    }

    public btj(Context context, Uri uri, int i) {
        this.b = i;
        this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
