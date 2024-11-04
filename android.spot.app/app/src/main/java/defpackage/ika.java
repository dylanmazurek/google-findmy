package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ika implements ikz {
    public final ikg a;

    public ika(ikg ikgVar) {
        this.a = ikgVar;
    }

    @Override // defpackage.ikz
    public final ikg a() {
        return this.a;
    }

    @Override // defpackage.ikz
    public final File b(Uri uri) {
        return hqt.e(uri);
    }

    @Override // defpackage.ikz
    public final InputStream c(Uri uri) {
        File e = hqt.e(uri);
        return new ikl(new FileInputStream(e), e);
    }

    @Override // defpackage.ikz
    public final OutputStream d(Uri uri) {
        File e = hqt.e(uri);
        iqg.t(e);
        return new ikm(new FileOutputStream(e), e);
    }

    @Override // defpackage.ikz
    public final String e() {
        return "file";
    }

    @Override // defpackage.ikz
    public final void f(Uri uri) {
        File e = hqt.e(uri);
        if (!e.isDirectory()) {
            if (!e.delete()) {
                if (!e.exists()) {
                    throw new FileNotFoundException(String.format("%s does not exist", uri));
                }
                throw new IOException(String.format("%s could not be deleted", uri));
            }
            return;
        }
        throw new FileNotFoundException(String.format("%s is a directory", uri));
    }

    @Override // defpackage.ikz
    public final void g(Uri uri, Uri uri2) {
        File e = hqt.e(uri);
        File e2 = hqt.e(uri2);
        iqg.t(e2);
        if (e.renameTo(e2)) {
        } else {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.ikz
    public final boolean h(Uri uri) {
        return hqt.e(uri).exists();
    }

    public ika() {
        this(new ikg());
    }
}
