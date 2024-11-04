package defpackage;

import java.security.PrivilegedAction;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nrn implements PrivilegedAction {
    final /* synthetic */ String a;
    final /* synthetic */ nro b;

    public nrn(nro nroVar, String str) {
        this.a = str;
        this.b = nroVar;
    }

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        ClassLoader classLoader = this.b.a;
        if (classLoader != null) {
            return classLoader.getResourceAsStream(this.a);
        }
        return ClassLoader.getSystemResourceAsStream(this.a);
    }
}
