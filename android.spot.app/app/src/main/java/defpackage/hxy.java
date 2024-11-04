package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxy {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final Context c;
    public final jfe d;
    public final jfe e;
    public final jfe f;
    public final jfe g;
    public final Uri h;
    public volatile hwq i;
    public final Uri j;
    public volatile hwr k;
    private final jfe l;

    public hxy(Context context, jfe jfeVar, jfe jfeVar2, jfe jfeVar3) {
        this.c = context;
        this.e = jfeVar;
        this.d = jfeVar3;
        this.f = jfeVar2;
        ijy ijyVar = new ijy(context);
        ijyVar.d("phenotype_storage_info");
        ijyVar.e("storage-info.pb");
        this.h = ijyVar.a();
        ijy ijyVar2 = new ijy(context);
        ijyVar2.d("phenotype_storage_info");
        ijyVar2.e("device-encrypted-storage-info.pb");
        if (a.g()) {
            ijyVar2.b();
        }
        this.j = ijyVar2.a();
        this.g = hwx.H(new hnn(this, 19));
        this.l = hwx.H(new hnn(jfeVar, 20));
    }

    public final hwq a() {
        hwq hwqVar = this.i;
        if (hwqVar == null) {
            synchronized (a) {
                hwqVar = this.i;
                if (hwqVar == null) {
                    hwqVar = hwq.j;
                    ikv b2 = ikv.b(hwqVar);
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        try {
                            hwq hwqVar2 = (hwq) ((kpb) this.f.a()).n(this.h, b2);
                            StrictMode.setThreadPolicy(threadPolicy);
                            hwqVar = hwqVar2;
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                    } catch (IOException unused) {
                    }
                    this.i = hwqVar;
                }
            }
        }
        return hwqVar;
    }

    public final hwr b() {
        hwr hwrVar = this.k;
        if (hwrVar == null) {
            synchronized (b) {
                hwrVar = this.k;
                if (hwrVar == null) {
                    hwrVar = hwr.h;
                    ikv b2 = ikv.b(hwrVar);
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        try {
                            hwr hwrVar2 = (hwr) ((kpb) this.f.a()).n(this.j, b2);
                            StrictMode.setThreadPolicy(threadPolicy);
                            hwrVar = hwrVar2;
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                    } catch (IOException unused) {
                    }
                    this.k = hwrVar;
                }
            }
        }
        return hwrVar;
    }

    public final jyz c(boolean z) {
        jyz jyzVar;
        jzd jzdVar = (jzd) this.e.a();
        jzdVar.getClass();
        if (z) {
            jyzVar = ivc.F((jyz) this.l.a());
        } else {
            jyzVar = jyv.a;
        }
        return jwu.h(jys.q(jyzVar), new hxj(this, 3), jzdVar);
    }
}
