package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnl implements dje {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public dnl(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.dje
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.dje
    public final void f(dgs dgsVar, djd djdVar) {
        Cursor query = this.b.getContentResolver().query(this.c, a, null, null, null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            djdVar.e(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
        } else {
            djdVar.b(new File(str));
        }
    }

    @Override // defpackage.dje
    public final int g() {
        return 1;
    }

    @Override // defpackage.dje
    public final void cr() {
    }

    @Override // defpackage.dje
    public final void d() {
    }
}
