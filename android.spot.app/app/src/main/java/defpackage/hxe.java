package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxe {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final knd b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public hxe(Context context, hxf hxfVar) {
        String str;
        if (hxfVar.b) {
            str = hvo.b(context, hxfVar.a);
        } else {
            str = hxfVar.a;
        }
        this.a = str;
        knd b = knd.b(hxfVar.c);
        this.b = b == null ? knd.UNKNOWN : b;
        this.c = hxfVar.f;
        this.d = hxfVar.d;
        this.e = hxfVar.e;
    }

    public static Map a(Context context) {
        Map map = g;
        if (map == null) {
            synchronized (f) {
                map = g;
                if (map == null) {
                    jiu jiuVar = new jiu();
                    try {
                        String[] list = context.getAssets().list("phenotype");
                        if (list != null) {
                            for (String str : list) {
                                if (str.endsWith("_package_metadata.binarypb")) {
                                    try {
                                        InputStream open = context.getAssets().open(a.ao(str, "phenotype/"));
                                        try {
                                            lja ljaVar = lja.a;
                                            lkz lkzVar = lkz.a;
                                            lja ljaVar2 = lja.a;
                                            hxf hxfVar = hxf.g;
                                            liq J = liq.J(open);
                                            ljn l = hxfVar.l();
                                            try {
                                                try {
                                                    try {
                                                        llg b = lkz.a.b(l);
                                                        b.l(l, lir.p(J), ljaVar2);
                                                        b.g(l);
                                                        ljn.A(l);
                                                        hxe hxeVar = new hxe(context, (hxf) l);
                                                        jiuVar.d(hxeVar.a, hxeVar);
                                                        if (open != null) {
                                                            open.close();
                                                        }
                                                    } catch (ljy e) {
                                                        if (e.a) {
                                                            throw new ljy(e);
                                                        }
                                                        throw e;
                                                    } catch (llo e2) {
                                                        throw e2.a();
                                                    }
                                                } catch (RuntimeException e3) {
                                                    if (e3.getCause() instanceof ljy) {
                                                        throw ((ljy) e3.getCause());
                                                    }
                                                    throw e3;
                                                }
                                            } catch (IOException e4) {
                                                if (e4.getCause() instanceof ljy) {
                                                    throw ((ljy) e4.getCause());
                                                }
                                                throw new ljy(e4);
                                            }
                                        } catch (Throwable th) {
                                            if (open != null) {
                                                try {
                                                    open.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                            break;
                                        }
                                    } catch (ljy e5) {
                                        Log.e("PackageInfo", a.ao(str, "Unable to read Phenotype PackageMetadata for "), e5);
                                    }
                                }
                            }
                        }
                    } catch (IOException e6) {
                        Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e6);
                    }
                    jiy b2 = jiuVar.b();
                    g = b2;
                    map = b2;
                }
            }
        }
        return map;
    }
}
