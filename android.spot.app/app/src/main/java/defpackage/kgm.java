package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kgm extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        SecureRandom a = kgn.a();
        a.nextLong();
        return a;
    }
}
