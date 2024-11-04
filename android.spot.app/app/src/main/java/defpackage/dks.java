package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dks {
    private volatile dmc a;
    private final dhx b;

    public dks(dhx dhxVar) {
        this.b = dhxVar;
    }

    public final dmc a() {
        File file;
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    Object obj = this.b.a;
                    File cacheDir = ((Context) ((eey) obj).b).getCacheDir();
                    dme dmeVar = null;
                    if (cacheDir == null) {
                        file = null;
                    } else {
                        file = new File(cacheDir, (String) ((eey) obj).a);
                    }
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        dmeVar = new dme(file);
                    }
                    this.a = dmeVar;
                }
                if (this.a == null) {
                    this.a = new dmd();
                }
            }
        }
        return this.a;
    }
}
