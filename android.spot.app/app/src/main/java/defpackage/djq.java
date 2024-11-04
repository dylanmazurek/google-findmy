package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class djq implements dje {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public djq(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    protected abstract Object b(Uri uri, ContentResolver contentResolver);

    protected abstract void c(Object obj);

    @Override // defpackage.dje
    public final void d() {
        Object obj = this.c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.dje
    public final void f(dgs dgsVar, djd djdVar) {
        try {
            Object b = b(this.a, this.b);
            this.c = b;
            djdVar.b(b);
        } catch (FileNotFoundException e) {
            djdVar.e(e);
        }
    }

    @Override // defpackage.dje
    public final int g() {
        return 1;
    }

    @Override // defpackage.dje
    public final void cr() {
    }
}
