package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ean implements Serializable {
    public abstract eal a();

    public abstract int b();

    public abstract eam c();

    public final String d() {
        if (b() - 1 != 0) {
            return a().a;
        }
        return c().a.replaceAll("^\"|\"$", "");
    }
}
