package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dof implements dje {
    private static final String[] a = {"_data"};
    private final Context b;
    private final dnp c;
    private final dnp d;
    private final Uri e;
    private final int f;
    private final int g;
    private final div h;
    private final Class i;
    private volatile boolean j;
    private volatile dje k;

    public dof(Context context, dnp dnpVar, dnp dnpVar2, Uri uri, int i, int i2, div divVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = dnpVar;
        this.d = dnpVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = divVar;
        this.i = cls;
    }

    @Override // defpackage.dje
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.dje
    public final void cr() {
        this.j = true;
        dje djeVar = this.k;
        if (djeVar != null) {
            djeVar.cr();
        }
    }

    @Override // defpackage.dje
    public final void d() {
        dje djeVar = this.k;
        if (djeVar != null) {
            djeVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [dje] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @Override // defpackage.dje
    public final void f(dgs dgsVar, djd djdVar) {
        boolean isExternalStorageLegacy;
        int checkSelfPermission;
        Uri uri;
        bso b;
        try {
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            ?? r4 = 0;
            Cursor cursor = null;
            if (isExternalStorageLegacy) {
                dnp dnpVar = this.c;
                Uri uri2 = this.e;
                try {
                    Cursor query = this.b.getContentResolver().query(uri2, a, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    query.close();
                                    b = dnpVar.b(file, this.f, this.g, this.h);
                                } else {
                                    throw new FileNotFoundException("File path was empty in media store for: " + String.valueOf(uri2));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + String.valueOf(uri2));
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                Uri uri3 = this.e;
                if (!bpy.f(uri3) || !uri3.getPathSegments().contains("picker")) {
                    checkSelfPermission = this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
                    if (checkSelfPermission == 0) {
                        uri = MediaStore.setRequireOriginal(this.e);
                    } else {
                        uri = this.e;
                    }
                    b = this.d.b(uri, this.f, this.g, this.h);
                } else {
                    b = this.d.b(this.e, this.f, this.g, this.h);
                }
            }
            if (b != null) {
                r4 = b.c;
            }
            if (r4 == 0) {
                djdVar.e(new IllegalArgumentException("Failed to build fetcher for: " + String.valueOf(this.e)));
                return;
            }
            this.k = r4;
            if (this.j) {
                cr();
            } else {
                r4.f(dgsVar, djdVar);
            }
        } catch (FileNotFoundException e) {
            djdVar.e(e);
        }
    }

    @Override // defpackage.dje
    public final int g() {
        return 1;
    }
}
