package j$.util;

import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0062q extends C0056k implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C0056k(this.b);
    }

    @Override // j$.util.C0056k, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new C0056k(this.b.subList(i, i2));
    }
}
