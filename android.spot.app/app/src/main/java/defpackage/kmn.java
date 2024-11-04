package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmn {
    public static final kmn a = new kmn(new kmo(1));
    public static final kmn b = new kmn(new kmo(4));
    public static final kmn c = new kmn(new kmo(6));
    public static final kmn d = new kmn(new kmo(5));
    public static final kmn e = new kmn(new kmo(0));
    public static final kmn f = new kmn(new kmo(3));
    public static final kmn g = new kmn(new kmo(2));
    private final kmm h;

    public kmn(kmp kmpVar) {
        kml kmlVar;
        if (!kdd.a()) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                kmlVar = new kml(kmpVar, 1);
            } else {
                kmlVar = new kml(kmpVar, 0);
            }
        } else {
            kmlVar = new kml(kmpVar, 2);
        }
        this.h = kmlVar;
    }

    public static List c(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.h.a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object b(String str, List list) {
        return this.h.b(str, list);
    }
}
