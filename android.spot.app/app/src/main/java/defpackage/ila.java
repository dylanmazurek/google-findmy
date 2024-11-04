package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ila implements ikz {
    @Override // defpackage.ikz
    public final ikg a() {
        return ((ika) j()).a;
    }

    @Override // defpackage.ikz
    public /* synthetic */ File b(Uri uri) {
        throw null;
    }

    @Override // defpackage.ikz
    public InputStream c(Uri uri) {
        throw null;
    }

    @Override // defpackage.ikz
    public final OutputStream d(Uri uri) {
        return j().d(i(uri));
    }

    @Override // defpackage.ikz
    public final void f(Uri uri) {
        j().f(i(uri));
    }

    @Override // defpackage.ikz
    public final void g(Uri uri, Uri uri2) {
        j().g(i(uri), i(uri2));
    }

    @Override // defpackage.ikz
    public boolean h(Uri uri) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Uri i(Uri uri) {
        throw null;
    }

    protected abstract ikz j();
}
