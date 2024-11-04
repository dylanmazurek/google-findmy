package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.apps.adm.R;
import defpackage.bzo;
import defpackage.cku;
import defpackage.ckv;
import defpackage.ckw;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (context.getApplicationContext() != null) {
                if (cku.a == null) {
                    synchronized (cku.b) {
                        if (cku.a == null) {
                            cku.a = new cku(context);
                        }
                    }
                }
                Class<?> cls = getClass();
                cku ckuVar = cku.a;
                try {
                    try {
                        bzo.e("Startup");
                        Bundle bundle = ckuVar.e.getPackageManager().getProviderInfo(new ComponentName(ckuVar.e, cls), 128).metaData;
                        String string = ckuVar.e.getString(R.string.androidx_startup);
                        if (bundle != null) {
                            try {
                                HashSet hashSet = new HashSet();
                                for (String str : bundle.keySet()) {
                                    if (string.equals(bundle.getString(str, null))) {
                                        Class<?> cls2 = Class.forName(str);
                                        if (ckv.class.isAssignableFrom(cls2)) {
                                            ckuVar.d.add(cls2);
                                        }
                                    }
                                }
                                Iterator it = ckuVar.d.iterator();
                                while (it.hasNext()) {
                                    ckuVar.a((Class) it.next(), hashSet);
                                }
                            } catch (ClassNotFoundException e) {
                                throw new ckw(e);
                            }
                        }
                        return true;
                    } catch (PackageManager.NameNotFoundException e2) {
                        throw new ckw(e2);
                    }
                } finally {
                    Trace.endSection();
                }
            }
            return true;
        }
        throw new ckw();
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
