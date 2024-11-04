package defpackage;

import android.net.Uri;
import android.os.Process;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikx implements ijv {
    public lyn[] a;
    private final lkq b;

    public ikx(lkq lkqVar) {
        this.b = lkqVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [ikz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [ikz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ikz, java.lang.Object] */
    @Override // defpackage.ijv
    public final /* synthetic */ Object a(kqr kqrVar) {
        String str = ".mobstore_tmp-" + Process.myPid() + "-" + Thread.currentThread().getId() + "-" + System.currentTimeMillis() + "-" + ikw.a.getAndIncrement();
        Uri uri = (Uri) kqrVar.c;
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
        List c = kqrVar.c(kqrVar.e.d(build));
        lyn[] lynVarArr = this.a;
        if (lynVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                lynVarArr[i].m(c);
            }
        }
        try {
            OutputStream outputStream = (OutputStream) c.get(0);
            try {
                this.b.f(outputStream);
                lyn[] lynVarArr2 = this.a;
                if (lynVarArr2 != null) {
                    for (int i2 = 0; i2 <= 0; i2++) {
                        lynVarArr2[i2].n();
                    }
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                kqrVar.e.g(build, (Uri) kqrVar.c);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                kqrVar.e.f(build);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
